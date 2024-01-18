package project.view;

import project.DatabaseConnection;
import project.controller.PageNavigator;
import project.controller.RegisterController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CreateAccountFrame {
    private JFrame frame;
    private JTextField passwordField;
    private JTextField usernameField;
    private JTextField repeatPassField;
    private JButton createAccountButton;

    public CreateAccountFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel lblCreateAccount = new JLabel("Create Account");
        lblCreateAccount.setForeground(new Color(254, 250, 224));
        lblCreateAccount.setBounds(627, 25, 535, 145);
        lblCreateAccount.setFont(new Font("Monospaced", Font.BOLD, 60));
        frame.getContentPane().add(lblCreateAccount);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(new Color(254, 250, 224));
        usernameLabel.setBounds(238, 348, 177, 40);
        usernameLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        frame.getContentPane().add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(new Color(254, 250, 224));
        passwordLabel.setBounds(238, 399, 175, 40);
        passwordLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(425, 398, 270, 41);
        passwordField.setForeground(new Color(254, 250, 224));
        passwordField.setBackground(new Color(40, 54, 24));
        passwordField.setCaretColor(new Color(254, 250, 224));
        passwordField.setFont(new Font("Monospaced", Font.BOLD, 30));
        passwordField.setColumns(10);
        frame.getContentPane().add(passwordField);

        usernameField = new JTextField();
        usernameField.setBounds(425, 347, 270, 41);
        usernameField.setForeground(new Color(254, 250, 224));
        usernameField.setBackground(new Color(40, 54, 24));
        usernameField.setCaretColor(new Color(254, 250, 224));
        usernameField.setFont(new Font("Monospaced", Font.BOLD, 30));
        usernameField.setColumns(10);
        frame.getContentPane().add(usernameField);

        JLabel repeatPassLabel = new JLabel("Repeat Password:");
        repeatPassLabel.setForeground(new Color(254, 250, 224));
        repeatPassLabel.setBounds(114, 450, 301, 40);
        repeatPassLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        frame.getContentPane().add(repeatPassLabel);

        repeatPassField = new JPasswordField();
        repeatPassField.setBounds(425, 449, 270, 41);
        repeatPassField.setForeground(new Color(254, 250, 224));
        repeatPassField.setBackground(new Color(40, 54, 24));
        repeatPassField.setCaretColor(new Color(254, 250, 224));
        repeatPassField.setFont(new Font("Monospaced", Font.BOLD, 30));
        repeatPassField.setColumns(10);
        frame.getContentPane().add(repeatPassField);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(425, 522, 265, 54);
        createAccountButton.setBackground(new Color(221, 161, 94));
        createAccountButton.setForeground(new Color(40, 54, 24));
        createAccountButton.setFont(new Font("Monospaced", Font.BOLD, 25));
        frame.getContentPane().add(createAccountButton);

        JLabel imageLabel = new JLabel("");
        imageLabel.setBounds(784, 318, 703, 425);
        frame.getContentPane().add(imageLabel);
        ImageIcon img = new ImageIcon(this.getClass().getResource("/images/calSaResized.jpg"));
        imageLabel.setIcon(img);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        exitButton.setBackground(new Color(221, 161, 94));
        exitButton.setForeground(new Color(40, 54, 24));
        exitButton.setBounds(28, 10, 81, 62);
        frame.getContentPane().add(exitButton);

        JButton btnBack = new JButton("Back");
        btnBack.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnBack.setBounds(28, 77, 81, 62);
        btnBack.setBackground(new Color(221, 161, 94));
        btnBack.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(btnBack);

        btnBack.addActionListener(e -> {
            WelcomeFrame welcomeFrame = new WelcomeFrame();
            frame.dispose();
        });

        PageNavigator pageNavigator = new PageNavigator(frame, exitButton, new JButton());
        DatabaseConnection databaseConnection = new DatabaseConnection();
        RegisterController registerController = new RegisterController(this, databaseConnection);

        UIManager.put("Button.select", new Color(221, 161, 94));
        SwingUtilities.updateComponentTreeUI(btnBack);
        SwingUtilities.updateComponentTreeUI(exitButton);
        SwingUtilities.updateComponentTreeUI(createAccountButton);


        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public String getCreatePasswordTextField() {
        return passwordField.getText();
    }

    public String getCreateUsernameTextField() {
        return usernameField.getText();
    }

    public String getRepeatPasswordTextField(){
        return repeatPassField.getText();
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        refreshRegister();
    }

    public void refreshRegister() {
        passwordField.setText(null);
        usernameField.setText(null);
        repeatPassField.setText(null);
    }
    public void showMessage(String s) {
        JOptionPane.showMessageDialog(frame, s);
    }

    public void addCreateAccountListener(ActionListener action) {
        createAccountButton.addActionListener(action);
    }
}
