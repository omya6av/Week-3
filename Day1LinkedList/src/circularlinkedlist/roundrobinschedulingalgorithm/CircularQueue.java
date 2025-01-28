package circularlinkedlist.roundrobinschedulingalgorithm;

class CircularQueue {
    private Process head = null;
    private Process tail = null;

    // Add a new process at the end of the circular list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head; // Make it circular
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processID) {
        if (head == null) return;

        Process current = head;
        Process prev = null;
        do {
            if (current.processID == processID) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Simulate the round-robin scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;

        int totalProcesses = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        Process current = head;
        while (head != null) {
            System.out.println("Executing Process ID: " + current.processID);

            if (current.burstTime <= timeQuantum) {
                System.out.println("Process ID " + current.processID + " completed.");
                totalWaitingTime += totalTurnaroundTime;
                totalTurnaroundTime += current.burstTime;
                removeProcess(current.processID);
                current = head;
            } else {
                current.burstTime -= timeQuantum;
                totalTurnaroundTime += timeQuantum;
                current = current.next;
            }

            displayProcesses();
        }

        System.out.println("\nAverage Waiting Time: " + (totalWaitingTime / (double) totalProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) totalProcesses));
    }

    // Display the list of processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes remaining.");
            return;
        }

        Process current = head;
        System.out.println("Current Processes in Queue:");
        do {
            System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
