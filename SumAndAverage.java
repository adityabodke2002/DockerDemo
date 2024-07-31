import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the sum of the largest number
        double largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);
        double largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);

        // Calculate the average
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}
