package project;

import java.sql.Connection;
import java.sql.DriverManager;

//Designed to manage the connection to a MySQL database.
public class DatabaseConnection {
    private final String driver; // A String that holds the fully qualified name of the JDBC driver class.
    private final String dbName; // A String that represents the name of the database to connect to.
    private final String connectionURL; //The base URL for the database connection.
    private final String ssl; //A string with additional parameters to enforce or bypass SSL during the connection.
    private final String username; //The username for the database connection.
    private final String password; //The password for the database connection.


    //Set the instance variables with the appropriate values required to establish a connection to the database.
    public DatabaseConnection() {
        driver = "com.mysql.cj.jdbc.Driver";
        connectionURL = "jdbc:mysql://localhost:3306/";
        dbName = "tabels";
        ssl = "?autoReconnect=true&useSSL=false";
        username = "root";
        password = "";
    }

    public Connection getConnection() throws Exception {
        Class.forName(driver); //Load the JDBC driver class. This is necessary to register the driver so that the Java
        // application can communicate with the database
        return DriverManager.getConnection(connectionURL + dbName + ssl, username, password); //Returns a new Connection object
    }

    //Provides a simple test to check whether the DatabaseConnection can establish a connection with the database.
    public static void main(String[] args) {
        //It instantiates the DatabaseConnection, tries to get a connection, and prints a success message if connected.
        DatabaseConnection db = new DatabaseConnection();
        try {
            //If the connection is successful, it is closed immediately after. If there are any exceptions (e.g., wrong
            // credentials, driver not found, etc.), the stack trace is printed to standard error.
            Connection conn = db.getConnection();
            System.out.println("Database successfully connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
