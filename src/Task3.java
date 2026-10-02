import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        boolean side1Valid = false;
        boolean side2Valid = false;

        do {
            System.out.print("Enter the length of the first side: ");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    side1Valid = true;
                } else {
                    System.out.println("Error: Length must be greater than 0");
                }
            } else {
                System.out.println("Error: Please enter a valid number");
                scan.next();
            }
        } while (side1Valid == false);

        do {
            System.out.print("Enter the length of the 2nd side: ");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    side2Valid = true;
                } else {
                    System.out.println("Error: Length must be greater than 0. Please try again");
                }
            } else {
                System.out.println("Please enter a valid number");
                scan.next();
            }
        } while (side2Valid == false);

        // Calculations
        double area = 0.5 * side1 * side2;
        double hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
        double perimeter = side1 + side2 + hypotenuse;


        System.out.printf("Area: %.2f m²\n", area);
        System.out.printf("Distance: %.2f m\n", hypotenuse);
        System.out.printf("Perimeter: %.2f m\n", perimeter);
    }
}
