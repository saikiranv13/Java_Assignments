import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to find factorial of a number
    public static long findFactorial(int number) {
        if (number < 0) {
            return -1; // Factorial of a negative number is not defined
        }
        if (number == 0 || number == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
