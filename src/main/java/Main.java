import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();  // Create an instance of Calculator
    String input;
    System.out.println("Enter a command (e.g., add 1 3) or type 'quit' to exit:");
    // Start an infinite loop until the user enters "quit"
    while (true) {
      input = scanner.nextLine();

      // Check if the user wants to quit
      if (input.equalsIgnoreCase("quit")) {
        System.out.println("Exiting the program...");
        break; // Exit the loop and terminate the program
      }

      String[] inputParts = input.split(" ");
      String command = inputParts[0];
      int num1 = Integer.parseInt(inputParts[1]);

      // Process the command using a switch statement
      switch (command) {
        case "add":
          int num2 = Integer.parseInt(inputParts[2]);
          System.out.println(calculator.add(num1, num2));  // Use calculator instance
          break;

        case "subtract":
          num2 = Integer.parseInt(inputParts[2]);
          System.out.println(calculator.subtract(num1, num2));
          break;

        case "multiply":
          num2 = Integer.parseInt(inputParts[2]);
          System.out.println(calculator.multiply(num1, num2));
          break;

        case "divide":
          num2 = Integer.parseInt(inputParts[2]);
          System.out.println(calculator.divide(num1, num2));
          break;

        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(num1));
          break;

        case "binary":
          System.out.println(calculator.intToBinaryNumber(num1));
          break;

        default:
          System.out.println("Unknown command");
      }
    }

    scanner.close();
  }
}
