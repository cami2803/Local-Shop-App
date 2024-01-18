package project.controller;

import project.DatabaseConnection;
import project.view.CreateAccountFrame;
import project.view.EquiChoiceMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

// Responsible for handling the registration logic in the application's user interface.
// It interacts with the CreateAccountFrame and the DatabaseConnection to register a new user into the system
public class RegisterController {
    private CreateAccountFrame frame; //An instance of CreateAccountFrame which is the user interface for account creation.
    private DatabaseConnection databaseConnection; //An instance of DatabaseConnection which handles the connection to the database.

    public RegisterController(CreateAccountFrame frame, DatabaseConnection databaseConnection) {
        //Receive and set the CreateAccountFrame and DatabaseConnection instances.
        this.frame = frame;
        this.databaseConnection = databaseConnection;
        this.frame.addCreateAccountListener(new CreateListener()); //Add an action listener to the createAccountButton in the CreateAccountFrame
    }

    class CreateListener implements ActionListener {
        //Override the actionPerformed() method which is called when the createAccountButton is clicked.
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //Attempt to establish a connection to the database and prepare an SQL statement for inserting a new user.
                Connection connection = databaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into login (username, password)" + "values (?, ?)");

                //Retrieve the username, password, and repeated password from the CreateAccountFrame
                String username = frame.getCreateUsernameTextField();
                String password = frame.getCreatePasswordTextField();
                String repeatPassword = frame.getRepeatPasswordTextField();

                //Check if any of the fields are empty and show an error message if so.
                if (username.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
                    frame.showErrorMessage("Empty fields!");
                } else {
                    //If the password and repeated password match, execute the SQL statement to insert the new user into the database.
                    if (password.equals(repeatPassword)) {
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, password);
                        preparedStatement.executeUpdate();
                        connection.close();

                        //If successful, close the connection, inform the user that the account was created, and refresh the registration form.
                        frame.showMessage("Account created!");
                        EquiChoiceMenu equiChoiceMenu = new EquiChoiceMenu();
                        frame.refreshRegister();
                    } else {
                        //If the passwords do not match, display an error message.
                        frame.showErrorMessage("Passwords do not match!");
                    }
                }
            } catch (Exception ex) {
                //Catch any exceptions, like if the username already exists in the database, and displays an error message
                frame.showErrorMessage("Account already exists!");
                frame.refreshRegister();
            }
        }
    }
}
