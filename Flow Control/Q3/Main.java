public class Main {
    public static void main(String[] args) {
        int sumOfFirstTenEven = sumOfFirstNEvenNumbers(10);
        int sumOfFirstTenOdd = sumOfFirstNOddNumbers(10);

        System.out.println("Sum of first 10 even numbers: " + sumOfFirstTenEven);
        System.out.println("Sum of first 10 odd numbers: " + sumOfFirstTenOdd);
    }

    // Method to calculate the sum of the first n even numbers
    public static int sumOfFirstNEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i; // Even numbers are multiples of 2
        }
        return sum;
    }

    // Method to calculate the sum of the first n odd numbers
    public static int sumOfFirstNOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (2 * i) + 1; // Odd numbers are one more than the even numbers
        }
        return sum;
    }
}
