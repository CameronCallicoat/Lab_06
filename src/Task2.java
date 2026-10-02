import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int charges = 0;
        double minutesCharge = 0;
        double costOfCharge = 0;
        boolean validCharges = false;
        boolean validMinutes = false;
        do {
            System.out.println("Enter number of battery charges available: ");

            if (scan.hasNextInt()) {
                charges = scan.nextInt();

                if (charges >= 0) {
                    validCharges = true;
                } else {
                    System.out.println("Error: Value must be 0 or greater");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scan.next();
            }

        } while (validCharges == false);
        do {
            System.out.print("Enter minutes per charge: ");
            if (scan.hasNextDouble()) {
                minutesCharge = scan.nextDouble();
                if (minutesCharge > 0) {
                    validMinutes = true;
                } else {
                    System.out.println("Error: Value must be greater than 0.");
                }
            } else {
                System.out.println("Error: Please enter a number.");
                scan.next();
            }
        }       while (validMinutes == false);

                boolean isCostValid = false;
        do {
                    System.out.print("Enter cost per charge: ");
                    if (scan.hasNextDouble()) {
                costOfCharge = scan.nextDouble();
                if (costOfCharge > 0) {
                    isCostValid = true;
                } else {
                    System.out.println("Error: Number entered must be greater than 0.");
                }
            } else {
                System.out.println("Error: Please enter a number.");
                scan.next();
            }
        }       while (validMinutes == false);
                double totalMinutes = charges * minutesCharge;
                double costPerHour = (60.0 / minutesCharge) * costOfCharge;
                System.out.printf("Total available minutes: %.2f%n", totalMinutes);
                System.out.printf("Cost to run the robot for 60 minutes: $%.2f%n", costPerHour);

            }
}