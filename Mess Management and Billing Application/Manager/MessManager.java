package Manager;

import java.util.*;

public class MessManager {
    private Map<String, Integer> menu;
    private Map<String, Integer> order;

    public MessManager() {
        menu = new HashMap<>();
        order = new HashMap<>();
        initializeMenu();
    }

    private void initializeMenu() {
        menu.put("Breakfast", 50);
        menu.put("Lunch", 100);
        menu.put("Dinner", 120);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Integer> item : menu.entrySet()) {
            System.out.println(item.getKey() + ": $" + item.getValue());
        }
    }

    public void takeOrder(String itemName, int quantity) {
        if (menu.containsKey(itemName)) {
            order.put(itemName, order.getOrDefault(itemName, 0) + quantity);
            System.out.println("Order placed: " + itemName + " x" + quantity);
        } else {
            System.out.println("Invalid item name. Please choose from the menu.");
        }
    }

    public void displayOrder() {
        System.out.println("Order Summary:");
        for (Map.Entry<String, Integer> item : order.entrySet()) {
            System.out.println(item.getKey() + ": x" + item.getValue());
        }
    }

    public int calculateBill() {
        int totalBill = 0;
        for (Map.Entry<String, Integer> item : order.entrySet()) {
            totalBill += menu.get(item.getKey()) * item.getValue();
        }
        return totalBill;
    }
} 
