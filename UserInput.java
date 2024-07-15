package practice;

    import java.util.Scanner;

    public class UserInput {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter some text
            System.out.print("Enter something: ");
    
            // Read the input from the user
            int userInput = scanner.nextInt();
    
            // Print the input on the console
            System.out.println("You entered: " + userInput);
    
            // Close the scanner
            scanner.close();
        }
    }
