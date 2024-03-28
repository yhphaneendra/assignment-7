import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int daysLate = scanner.nextInt();

        double fine;
        String message;

        if (daysLate <= 7) {
            fine = daysLate * 0.5; // 50 paise per day
            message = "Fine: Rs. " + fine;
        } else if (daysLate <= 14) {
            fine = 1; // Re. 1 per day
            message = "Fine: Rs. " + fine;
        } else {
            if (daysLate > 21) {
                message = "Membership Cancelled";
            } else {
                fine = 5 * (daysLate - 14); // Rs. 5 per day after 14 days
                message = "Fine: Rs. " + fine;
            }
        }

        System.out.println(message);

        scanner.close();
    }
}
