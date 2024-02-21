import java.util.Scanner;

public class MovieDriver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to enter details for multiple movies
        while (true) {
            // Prompting user for movie details
            System.out.println("Enter the title of the movie:");
            String title = scanner.nextLine();

            System.out.println("Enter the movie's rating:");
            String rating = scanner.nextLine();

            System.out.println("Enter the number of tickets sold at the theater:");
            int soldTickets = scanner.nextInt();
            scanner.nextLine(); 

            // Creating a Movie object 
            Movie movie = new Movie(title, rating, soldTickets);

            // Printing out the movie information
            System.out.println("Movie Title: " + movie.getTitle());
            System.out.println("Movie Rating: " + movie.getRating());
            System.out.println("Tickets Sold: " + movie.getSoldTickets());

            // Asking user if they want to enter details for another movie
            System.out.println("Do you want to enter details for another movie? (yes/no)");
            String response = scanner.nextLine();
            
            // If the response is not "yes", break out of the loop
            if (!response.equals("yes")) {
                break;
            }
        }

    }
}
