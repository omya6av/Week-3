package circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularQueue processQueue = new CircularQueue();

        // Adding processes to the queue
        processQueue.addProcess(1, 10, 1);
        processQueue.addProcess(2, 5, 2);
        processQueue.addProcess(3, 8, 3);

        // Simulating round-robin scheduling
        int timeQuantum = 4;
        processQueue.simulateRoundRobin(timeQuantum);
    }
}