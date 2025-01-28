package doublylinkedlist.moviemanagementsystem;

class MovieManagement{
    private Movie head;
    private Movie tail;

    public MovieManagement() {
        this.head = null;
        this.tail = null;
    }

    // Add at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add at a specific position
    public void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            if (current.next != null) {
                current.next.prev = newMovie;
            }
            current.next = newMovie;
            if (newMovie.next == null) {
                tail = newMovie;
            }
        }
    }

    // Remove by title
    public void removeMovieByTitle(String title) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            current = current.next;
        }

        System.out.println("Movie not found: " + title);
    }

    // Search by director
    public void searchByDirector(String director) {
        Movie current = head;
        boolean found = false;

        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + current.title + " (" + current.year + ") - Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movies found by director: " + director);
        }
    }

    // Search  movies by rating
    public void searchByRating(double rating) {
        Movie current = head;
        boolean found = false;

        while (current != null) {
            if (current.rating == rating) {
                System.out.println("Found: " + current.title + " (" + current.year + ") - Director: " + current.director);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        Movie current = head;

        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - Director: " + current.director + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display movies in reverse order
    public void displayReverse() {
        Movie current = tail;

        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - Director: " + current.director + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update rating
    public void updateRatingByTitle(String title, double newRating) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }

        System.out.println("Movie not found: " + title);
    }
}