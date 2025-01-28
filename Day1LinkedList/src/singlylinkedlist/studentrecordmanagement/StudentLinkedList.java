package singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
    Student head;

    //Add at beginning
    public void addBeginning(int rollNumber, String name, int age, char grade){
        Student newNode = new Student(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    //Add at end
    public void addAtEnd(int rollNumber, String name, int age, char grade){
        Student newNode = new Student(rollNumber, name, age, grade);
        if(head==null){
            head = newNode;
            return;
        }
        Student temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add a student at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range!");
            return;
        }
        newStudent.next = current.next;
        current.next = newStudent;
    }

    // Search by roll number
    public void searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Record Found: Roll Number: " + current.rollNumber +
                        ", Name: " + current.name +
                        ", Age: " + current.age +
                        ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Record not found");
    }

    // Update grade by roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Record not found");
    }

    // Delete by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record deleted successfully!");
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Record not found!");
            return;
        }
        current.next = current.next.next;
        System.out.println("Record deleted successfully!");
    }
    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No records found!");
            return;
        }
        Student current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber +
                    ", Name: " + current.name +
                    ", Age: " + current.age +
                    ", Grade: " + current.grade);
            current = current.next;
        }
    }
}
