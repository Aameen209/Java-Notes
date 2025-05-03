import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner object to take input from user
        int myNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int userNumber = 0; // Variable to store user's guessed number
        
        do {
            System.out.println("Guess my Number(1-100) : ");
            userNumber = sc.nextInt(); // Take user input for guessing the number

            // Check if user's guess is correct
            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!"); // Output if user guesses the correct number
                break; // Exit the loop if the guess is correct
            } else if (userNumber > myNumber) {
                System.out.println("your number is large"); // Output if user's guess is larger than the generated number
            } else {
                System.out.println("your number is small"); // Output if user's guess is smaller than the generated number
            }
        } while (userNumber >= 0); // Continue asking the user to guess until they enter a valid number or negative number

        System.out.println("My number was : "); // Reveal the number
        System.out.println(myNumber); // Output the correct random number
    }
}
