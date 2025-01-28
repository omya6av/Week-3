package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement system = new MovieManagement();

        // Adding movies
        system.addMovieAtBeginning("Pushpa3", "Surkumar", 2026, 8.8);
        system.addMovieAtEnd("KFG3", "Neel", 2026, 9.0);
        system.addMovieAtPosition(1, "Bahubali", "SS Raja", 2019, 8.6);

        // Display movies
        System.out.println("Movies in forward order:");
        system.displayForward();

        System.out.println("Movies in reverse order:");
        system.displayReverse();

        // Search by director
        System.out.println("Search movies by director Sukumar:");
        system.searchByDirector("Sukumar");

        // Update rating
        System.out.println("Updating rating for Bahubal':");
        system.updateRatingByTitle("Bahubali", 9.0);

        // Remove a movie
        System.out.println("Removing KFG:");
        system.removeMovieByTitle("KFG");

        // Display movies again
        System.out.println("Movies after removal:");
        system.displayForward();
    }
}
