package singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Add some student records
        studentList.addBeginning(1, "Naman", 20, 'A');
        studentList.addAtEnd(2, "Om", 22, 'B');
        studentList.addAtPosition(2, 3, "ishaan  6", 21, 'A');

        // Display all records
        System.out.println("All Student Records:");
        studentList.displayAll();

        // Search for a student
        System.out.println("Searching for Roll Number 2:");
        studentList.searchByRollNumber(2);

        // Update a grade
        System.out.println("Updating Grade for Roll Number 3:");
        studentList.updateGrade(3, 'B');

        // Delete a student
        System.out.println("Deleting Record with Roll Number 1:");
        studentList.deleteByRollNumber(1);

        // Display all records again
        System.out.println("All Student Records After Deletion:");
        studentList.displayAll();
    }
}
