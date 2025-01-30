package stackandqueue.circulartour;

public class Main {
    // Main function to test the Circular Tour problem
    public static void main(String[] args) {
        CircularTour tour = new CircularTour();

        // Petrol and distance arrays
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = tour.canCompleteTour(petrol, distance);

        if (start != -1) {
            System.out.println("The circular tour can be completed starting from pump " + start);
        } else {
            System.out.println("The circular tour cannot be completed.");
        }
    }
}
