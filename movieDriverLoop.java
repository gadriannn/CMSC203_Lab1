
import java.util.Scanner;

public class movieDriverLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            Movie movie = new Movie();

            System.out.print("Enter the title of the movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold for the movie: ");
            int soldTickets = keyboard.nextInt();
            keyboard.nextLine(); // read and discard the line feed
            movie.setSoldTickets(soldTickets);

            System.out.println(movie.toString());

            System.out.print("Do you want to enter another movie? (y/n): ");
            String answer = keyboard.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }

        System.out.println("Goodbye!");
    }
}