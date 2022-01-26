import java.util.Scanner;

public class Lab2Cal {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first value: ");
        int x = input.nextInt();
        System.out.print("Enter second value: ");
        int y = input.nextInt();
        System.out.print("Enter third value: ");
        int z = input.nextInt();

        int sum;
        double average;
        sum = x + y + z;
        average = sum/3;
        System.out.print("The average of " + " " + x + " " + y + " " + z + " is " + average);

    }
}
