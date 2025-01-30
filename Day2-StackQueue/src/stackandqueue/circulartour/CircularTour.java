package stackandqueue.circulartour;

class CircularTour {

    // Function to find the starting petrol pump for the circular tour
    public int canCompleteTour(int[] petrol, int[] distance) {
        int n = petrol.length;

        // Start from pump 0
        int start = 0;
        int surplus = 0;
        int totalSurplus = 0;

        // Iterate through all the petrol pumps
        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];  // Calculate the surplus petrol at current pump
            totalSurplus += petrol[i] - distance[i];  // Total surplus for all pumps

            // If surplus is negative, reset the starting point
            if (surplus < 0) {
                // Start from the next pump
                start = i + 1;
                surplus = 0;  // Reset surplus for new start point
            }
        }

        // If total surplus is non-negative, a circular tour is possible, otherwise not
        return totalSurplus >= 0 ? start : -1;
    }

}
