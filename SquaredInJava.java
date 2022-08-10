
// This program asks the user for input and prints out that number squared
import java.util.Scanner;

public class SquaredInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number. This program will return the square >>");
        int input = scanner.nextInt();
        returnTheSquare(input);
    }

    public static void returnTheSquare(int x) {
        int x_squared = x * x;
        System.out.println(x_squared);
    }
}