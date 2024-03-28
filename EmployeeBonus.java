import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year the employee joined: ");
        int joiningYear = scanner.nextInt();

        int yearsOfService = currentYear - joiningYear;

        int bonus = yearsOfService > 5 ? 5000 : (yearsOfService >= 3 ? 3000 : 0);

        if (bonus > 0) {
            System.out.println("The employee is awarded a bonus of Rs. " + bonus);
        } else {
            System.out.println("The employee is not awarded any bonus.");
        }

        scanner.close();
    }
}
