import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the command from the user
    System.out.println("Enter a command (e.g., add 1 3):");
    String input = scanner.nextLine();
    String[] inputParts = input.split(" ");

    // Extract the command and numbers
    String command = inputParts[0];
    int num1 = Integer.parseInt(inputParts[1]);

    // Switch case based on the command
    switch (command) {
      case "add":
        int num2 = Integer.parseInt(inputParts[2]);
        System.out.println(add(num1, num2));
        break;

      case "subtract":
        num2 = Integer.parseInt(inputParts[2]);
        System.out.println(subtract(num1, num2));
        break;

      case "multiply":
        num2 = Integer.parseInt(inputParts[2]);
        System.out.println(multiply(num1, num2));
        break;

      case "divide":
        num2 = Integer.parseInt(inputParts[2]);
        System.out.println(divide(num1, num2));
        break;

      case "fibonacciNumberFinder":
        System.out.println(fibonacciNumberFinder(num1));
        break;

      case "intToBinaryNumber":
        System.out.println(intToBinaryNumber(num1));
        break;

      default:
        System.out.println("Unknown command");
    }

    scanner.close();
  }

  // Add method
  static int add(int a, int b) {
    return a + b;
  }

  // Subtract method
  static int subtract(int a, int b) {
    return a - b;
  }

  // Multiply method
  static int multiply(int a, int b) {
    return a * b;
  }

  // Divide method (assuming integer division)
  static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
  }

  // Fibonacci method
  static int fibonacciNumberFinder(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    int n1 = 1, n2 = 1, result = 0;
    for (int i = 3; i <= n; i++) {
      result = n1 + n2;
      n1 = n2;
      n2 = result;
    }
    return result;
  }

  // Convert integer to binary string
  static String intToBinaryNumber(int number) {
    if (number == 0) {
      return "0";
    }
    StringBuilder binaryString = new StringBuilder();
    while (number > 0) {
      binaryString.append(number % 2);
      number = number / 2;
    }
    return binaryString.reverse().toString();
  }
}
