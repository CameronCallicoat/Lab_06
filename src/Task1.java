import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilometers = 0;
        boolean validDistance = false;

        do {
            System.out.println("Enter the trail distance in kilometers: ");

            if (scan.hasNextDouble()) {
                kilometers = scan.nextDouble();
                if (kilometers >= 0) {
                    validDistance = true;
                } else {
                    System.out.println("Error: number entered must be 0 or greater.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scan.next();
            }

        } while (validDistance == false);

        double miles = kilometers * 0.621371;
        System.out.printf("%10s%10f%n", "Kilometers:", kilometers);
        System.out.printf("%10s%10f%n", "Miles:", miles);
    }
}
