import java.util.*;
import Manager.*;
public class MessManagementAndBillingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessManager messManager = new MessManager();

        while (true) {
            System.out.println("\nMenu Management System");
            System.out.println("1. Display Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Display Order");
            System.out.println("4. Calculate Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    messManager.displayMenu();
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    messManager.takeOrder(itemName, quantity);
                    break;
                case 3:
                    messManager.displayOrder();
                    break;
                case 4:
                    int totalBill = messManager.calculateBill();
                    System.out.println("Total Bill: $" + totalBill);
                    break;
                case 5:
                    System.out.println("Exiting Mess Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}