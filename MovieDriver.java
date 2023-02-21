import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        
        // Create a new Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Create a new Movie object
        Movie movie = new Movie();
        
        // Prompt the user to enter the title of a movie
        System.out.println("Enter the title of a movie:");
        // Read in the line that the user types
        String title = scanner.nextLine();
        // Set the title in the movie object
        movie.setTitle(title);
        
        // Prompt the user to enter the movie's rating
        System.out.println("Enter the movie's rating:");
        // Read in the line that the user types
        String rating = scanner.nextLine();
        // Set the rating in the movie object
        movie.setRating(rating);
        
        // Prompt the user to enter the number of tickets sold at a theater
        System.out.println("Enter the number of tickets sold at a theater:");
        // Read in the integer that the user types
        int soldTickets = scanner.nextInt();
        // Set the number of tickets sold in the movie object
        movie.setSoldTickets(soldTickets);
        
        // Print out the information using the movie's toString method
        System.out.println(movie.toString());
        System.out.println("Goodbye!");
        
        // Close the Scanner object
        scanner.close();
    }
}