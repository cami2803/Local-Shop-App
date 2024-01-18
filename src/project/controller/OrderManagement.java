package project.controller;

import project.model.Item;
import project.model.Order;

public class OrderManagement {
    // The OrderManagement class uses the Singleton pattern to ensure that only one instance of this class can be created.
    private static OrderManagement instance; // Static variable for the singleton instance.
    private Order currentOrder; // Instance variable for the current order being managed.

    // Private constructor prevents instantiation from outside the class.
    private OrderManagement() {
        currentOrder = null; // Initially, there is no current order, so it's set to null.
    }

    // Static method to get the single instance of the class.
    public static OrderManagement getInstance() {
        // If the instance is null, create a new one, otherwise return the existing one.
        if (instance == null) {
            instance = new OrderManagement();
        }
        return instance;
    }

    // Method to create a new order. If there is no current order, it initializes one.
    public void startNewOrder() {
        this.currentOrder = new Order();
    }

    // Method to add an item to the current order. If there's no current order, it starts a new one first.
    public void addItem(Item item) {
        if (currentOrder == null) {
            startNewOrder();
        }
        currentOrder.addItem(item);
    }

    // Getter method for the current order.
    public Order getCurrentOrder() {
        return currentOrder;
    }

    // Method to get details of the current order in a String format. If there's no order, it returns a message.
    public String getCurrentOrderDetails() {
        if (currentOrder != null) {
            return currentOrder.toString();
        } else {
            return "No active order.";
        }
    }

    // Method to complete the order. It processes the order and then resets the current order to null.
    public String completeOrder() {
        if (currentOrder != null) {
            String orderDetails = "Order ID: " + currentOrder.getID() + " Total Price: " + currentOrder.getTotalPrice();
            currentOrder.finishOrder(); // Finalizes the order process, saving it to the database
            currentOrder = null; // Resets the currentOrder to null since the order is now complete.
            return orderDetails; // Returns a summary of the completed order.
        } else {
            return "No order to complete."; // If there was no order to begin with, return this message.
        }
    }
}
