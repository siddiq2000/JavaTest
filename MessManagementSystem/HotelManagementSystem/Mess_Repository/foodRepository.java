// foodRepository.java
package Mess_Repository;

import java.util.ArrayList;
import java.util.List;
import Mess_Model.foodModel;

public class foodRepository {
    private ArrayList<foodModel> foods;

    public foodRepository() {
        foods = new ArrayList<>();
        // Add sample food items
        initializeSampleFoods();
    }

    private void initializeSampleFoods() {
        foods.add(new foodModel("Pizza", 10.99, true));
        foods.add(new foodModel("Burger", 5.99, true));
        foods.add(new foodModel("Salad", 7.99, true));
        foods.add(new foodModel("Pasta", 8.99, true));
        foods.add(new foodModel("Sandw", 6.99, true));
        foods.add(new foodModel("Steak", 15.99, true));
        foods.add(new foodModel("Soup", 4.99, true));
        foods.add(new foodModel("Sushi", 12.99, true));
        foods.add(new foodModel("Tacos", 9.99, true));
        foods.add(new foodModel("Fried", 11.99, true));
        // Adding Indian food items
        foods.add(new foodModel("Butter", 13.99, true));
        foods.add(new foodModel("Paneer", 9.99, true));
        foods.add(new foodModel("Biryani", 11.99, true));
        foods.add(new foodModel("Masala", 8.99, true));
        foods.add(new foodModel("Chole", 10.99, true));
    }

    public List<foodModel> getAllFoods() {
        return foods;
    }

    public foodModel getFoodByName(String name) {
        for (foodModel food : foods) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }
        return null;
    }



    // Method to reserve food by a customer
    public void reserveFood(String customerName, String foodName) {
        foodModel food = getFoodByName(foodName);
        if (food != null) {
            food.setReservedBy(customerName);
            food.setAvailable(false); // Update availability
        }
    }
}
