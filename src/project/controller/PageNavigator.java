package project.controller;

import project.view.EquiChoiceMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// PageNavigator class provides navigation controls for a JFrame.
public class PageNavigator {
    private JFrame frame; // The JFrame that the navigation controls will operate on.
    private JButton closeButton; // A button for closing the frame.
    private JButton backButton; // A button for going back to the previous screen.

    // Constructor takes a JFrame and two JButtons that serve as close and back actions.
    public PageNavigator(JFrame frame, JButton closeButton, JButton backButton) {
        this.frame = frame; // Sets the frame to manage.
        this.closeButton = closeButton; // Sets the button that will trigger the close action.
        this.backButton = backButton; // Sets the button that will trigger the back action.

        this.addCloseListener(new closeListener()); // Attaches a close listener to the close button.
        this.addGoBackListener(new goBackListener()); // Attaches a go-back listener to the back button.
    }

    // Method to attach a custom ActionListener to the close button.
    public void addCloseListener(ActionListener action) {
        closeButton.addActionListener(action);
    }

    // Method to attach a custom ActionListener to the back button.
    public void addGoBackListener(ActionListener action) {
        backButton.addActionListener(action);
    }

    // Inner class that defines the ActionListener for the close button.
    class closeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                confirmationMessage(); // Calls a method to display a confirmation message before closing.
            } catch (Exception exception) {
                // If something goes wrong, an error message is displayed in a dialog box.
                JOptionPane.showMessageDialog(null, "ERROR.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Inner class that defines the ActionListener for the back button.
    class goBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Closes the current frame and opens the EquiChoiceMenu.
            frame.setVisible(false);
            frame.dispose();
            EquiChoiceMenu equiChoiceMenu = new EquiChoiceMenu();
        }
    }

    // Method to show a confirmation dialog when attempting to close the application.
    public void confirmationMessage() {
        // Displays a JOptionPane confirm dialog with a YES/NO option and a question message.
        int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Checks the user's response. If YES, it will close the application.
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0); // Terminates the running Java virtual machine.
        }
    }
}
