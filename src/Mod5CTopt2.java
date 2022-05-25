import java.util.Scanner;

public class Mod5CTopt2 {
    private static int     total;
    private static Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sum of 5 numbers. Enter 5 numbers - Example: \"2 2 2 2 2\"");
        System.out.println("Total Sum: " + sum5(scan.nextInt() , 5)); // Send Recursive Method 5 Recurves and Initial number
    }
    // Recursive Method
    private static int sum5(int num , int i) {
        total += num;
        if (i == 1) return total;
        return sum5(scan.nextInt() , i - 1); // Calls itself until i = 1
    }
}
