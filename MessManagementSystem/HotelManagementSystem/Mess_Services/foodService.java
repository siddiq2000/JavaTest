package Mess_Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import Mess_Model.foodModel;
import Mess_Repository.foodRepository;

public class foodService {
	private foodRepository frepo;

    public foodService(foodRepository frepo) {
        this.frepo = frepo;
    }

    public List<foodModel> getAllfoods() {
        return frepo.getAllFoods();
    }

    public foodModel getfoodbyname(String name) {
        return frepo.getFoodByName(name);
    }

    public void displayAvailablefoods() {
        List<foodModel> availablefood = frepo.getAllFoods();
        System.out.println("Available Foods:");
        System.out.println("Name\t\tprice\t\tAvailable");
        for (foodModel food : availablefood) {
            if (food.isAvailable()) {
                System.out.println(food.getName() + "\t\t" + food.getPrice() + "\t\t" + food.isAvailable());
            }
        }
    }

    public Collection<foodModel> placeFoodOrder(String foodCustomerName) {
        List<foodModel> availableFoods = frepo.getAllFoods();
        Collection<foodModel> orderedFoodItems = new ArrayList<>();

        System.out.println("Enter the food items to order (separated by comma): ");
        Scanner scanner = new Scanner(System.in);
        String[] foodItems = scanner.nextLine().split(",");

        for (String foodItem : foodItems) {
            foodModel orderedFood = availableFoods.stream()
                    .filter(food -> food.getName().equalsIgnoreCase(foodItem.trim()) && food.isAvailable())
                    .findFirst()
                    .orElse(null);

            if (orderedFood != null) {
                orderedFood.setAvailable(true);
                orderedFoodItems.add(orderedFood);
            } else {
                System.out.println("Food item '" + foodItem + "' is not available.");
            }
        }

        if (!orderedFoodItems.isEmpty()) {
            System.out.println("Food order placed for customer: " + foodCustomerName);
        } else {
            System.out.println("No food items ordered.");
        }

        return orderedFoodItems;
    }

}
