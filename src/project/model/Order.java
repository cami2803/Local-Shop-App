package project.model;

import project.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


//This class represents an order and encapsulates its attributes and functionalities.
public class Order {
    private int ID; //A unique identifier for the order.
    private List<Item> items; //A list of Item objects that are part of the order.
    private float totalPrice; //A floating-point value representing the total price of the order.

    public Order() {
        this.ID = (int)Math.floor(Math.random() * (1000 - 10 + 1) + 10); //The ID is randomly generated in the range of 10 to 1000.
        this.items = new ArrayList<>(); //Initialize the items list with an empty array
        this.totalPrice = 0.0f; //Initialize the total Price with 0
    }

    //Adds an Item object to the items list and updates totalPrice by adding the price of the new item.
    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    //Returns the order's ID.
    public int getID() {
        return ID;
    }

    //Returns the list of items in the order.
    public List<Item> getItems() {
        return items;
    }

    //Returns the total price of the order.
    public float getTotalPrice() {
        return totalPrice;
    }

    //Overridden method from Object class. It constructs and returns a string representation of the order,
    // including ID, list of items with their names and prices, and the total price.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(ID).append("\n");
        sb.append("Items:\n");
        for (Item item : items) {
            sb.append("- ").append(item.getName()).append(", Price: ").append(item.getPrice()).append("\n");
        }
        sb.append("Total Price: ").append(totalPrice).append("\n");
        return sb.toString();
    }

    //This method records the order details (ID and totalPrice) into a database. It establishes a database connection
    // using DatabaseConnection, prepares a SQL statement for insertion, executes the statement, and then closes the
    // connection. Exception handling is implemented for SQL and general exceptions.
    public void finishOrder(){
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into orders (ID, totalPrice)" + "values (?, ?)");
            preparedStatement.setInt(1, this.ID);
            preparedStatement.setFloat(2, this.totalPrice);

            preparedStatement.executeUpdate();

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
