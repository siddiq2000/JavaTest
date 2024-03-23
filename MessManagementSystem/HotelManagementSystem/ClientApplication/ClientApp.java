
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Mess_Model.*;
import Mess_Repository.*;
import Mess_Services.*;

public class ClientApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customerRepository custRepo=new customerRepository();
        customerService cs = new customerService();
        roomRepository roomRepo = new roomRepository();
        roomService rs = new roomService(roomRepo);
        foodRepository foodRepo = new foodRepository();
        foodService fs = new foodService(foodRepo);

        List<foodModel> selectedFood = new ArrayList<>();
        double roomRent = 0; // Variable to store room rent
        double foodTotalPrice = 0; // Variable to store total food price
        String roomCustomerName = null; // Name of the customer for room reservation
        String foodCustomerName = null; // Name of the customer for food order

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Register Customer");
            System.out.println("2. Display all registered customers in the hotel");
            System.out.println("3. Display Available Rooms");
            System.out.println("4. Make Room Reservation");
            System.out.println("5. Generate Room Bill");
            System.out.println("6. Display the Menu Card");
            System.out.println("7. Place Food Order");
            System.out.println("8. View Food Order and Generate Food Bill");
            System.out.println("9. Generate and Display Total Bill (Room + Food)");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Register a customer
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter customer email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter customer phone number: ");
                    String phoneNumber = sc.nextLine();

                    customerModel cm = new customerModel(name, email, phoneNumber);

                    boolean b = cs.registerCustomer(cm);
                    if (b) {
                        System.out.println("Customer registered successfully.");
                    } else {
                        System.out.println("Problem registering customer.");
                    }
                    System.out.println("-----------------------");
                    break;

                case 2:
                    // Display all registered customers
                    ArrayList<customerModel> regCust = customerService.getallcustomer();
//                    ArrayList <customerModel> regCust = cs.getallcustomer(); 
                    if (regCust.isEmpty()) {
                        System.out.println("No customers registered yet.");
                    } else {
                        System.out.println("** Registered Customers in the Hotel **");
                        System.out.println("CustID\tName\tEmail\tPhoneNumber");
                        for (customerModel cust : regCust) {
                            System.out.println(cust.getCid() + "\t" + cust.getName() + "\t" + cust.getEmail() + "\t" + cust.getPhonenumber());
                        }
                    }
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    // Display available rooms
                    rs.displayAvailableRooms();
                    System.out.println("-----------------------------");
                    break;


                case 4:
                    // Make room reservation
                    System.out.print("Enter the customer name for room reservation: ");
                    String newRoomCustomerName = sc.nextLine();
                    // Check if the customer is registered before reserving the room
                    boolean customerExists = cs.checkCustomerExists(newRoomCustomerName);
                    if (customerExists) {
                        System.out.print("Enter the room number to reserve: ");
                        int roomNumber = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        // Reserve the room and update roomRent if successful
                        roomRent = rs.reserveRoom(newRoomCustomerName, roomNumber);
                        if (roomRent > 0) {
                            System.out.println("Room " + roomNumber + " reserved for customer: " + newRoomCustomerName);
                            roomCustomerName = newRoomCustomerName;
                        } else {
                            System.out.println("Room reservation failed. Please try again.");
                        }
                    } else {
                        System.out.println("Customer is not registered. Please register the customer first.");
                    }
                    System.out.println("---------------------------------");
                    break;

                case 5:
                    // Generate room bill
                    if (roomRent > 0) {
                        System.out.println("Customer Name: " + roomCustomerName);
                        double roomTax = roomRent * 0.2;
                        double totalRoomBill = roomRent + roomTax;
                        System.out.println("Room Rent: $" + roomRent);
                        System.out.println("Room Tax (20%): $" + roomTax);
                        System.out.println("Total Room Bill (including tax): $" + totalRoomBill);
                    } else {
                        System.out.println("No room reservation made yet..");
                    }
                    System.out.println("------------------------------------");
                    break;
                case 6:
                    // Display menu card
                    fs.displayAvailablefoods();
                    System.out.println("--------------------------------");
                    break;

                case 7:
                    // Place food order
                    System.out.print("Enter the customer name for food order: ");
                    String newFoodCustomerName = sc.nextLine();
                    // Check if the customer is registered before placing the food order
                     customerExists = cs.checkCustomerExists(newFoodCustomerName);
                    if (customerExists) {
                        selectedFood.addAll(fs.placeFoodOrder(newFoodCustomerName));
                        foodCustomerName = newFoodCustomerName;
                    } else {
                        System.out.println("Customer is not registered. Please register the customer first.");
                    }
                    System.out.println("-------------------------------");
                    break;


                case 8:
                    // Generate food bill
                    if (!selectedFood.isEmpty()) {
                        System.out.println("Customer Name: " + foodCustomerName);
                        System.out.println("Selected Food:");
                        double foodTax = 0;
                        for (foodModel food : selectedFood) {
                            System.out.println(food.getName() + "\t$" + food.getPrice());
                            foodTotalPrice += food.getPrice();
                        }
                        foodTax = foodTotalPrice * 0.1;
                        double totalFoodBill = foodTotalPrice + foodTax;
                        System.out.println("Total Price: $" + foodTotalPrice);
                        System.out.println("Food Tax (10%): $" + foodTax);
                        System.out.println("Total Food Bill (including tax): $" + totalFoodBill);
                    } else {
                        System.out.println("No food orders placed yet.");
                    }
                    System.out.println("-------------------------------");
                    break;

                case 9:
                    // Generate and display total bill
                    if (roomRent > 0 && !selectedFood.isEmpty() && roomCustomerName.equals(foodCustomerName)) {
                        System.out.println("Customer Name: " + roomCustomerName);
                        double roomTax = roomRent * 0.2;
                        double totalRoomBill = roomRent + roomTax;
                        System.out.println("Room Rent: $" + roomRent);
                        System.out.println("Room Tax (20%): $" + roomTax);
                        System.out.println("Total Room Bill (including tax): $" + totalRoomBill);

                        double foodTax = foodTotalPrice * 0.1;
                        double totalFoodBill = foodTotalPrice + foodTax;
                        System.out.println("Selected Food:");
                        for (foodModel food : selectedFood) {
                            System.out.println(food.getName() + "\t$" + food.getPrice());
                        }
                        System.out.println("Total Price: $" + foodTotalPrice);
                        System.out.println("Food Tax (10%): $" + foodTax);
                        System.out.println("Total Food Bill (including tax): $" + totalFoodBill);

                        System.out.println("Total Bill (Room + Food): $" + (totalRoomBill + totalFoodBill));
                    } else {
                        System.out.println("Please make both room reservation and food order by the same customer.");
                    }
                    System.out.println("-------------------------------");
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);
        sc.close();
    }
}
