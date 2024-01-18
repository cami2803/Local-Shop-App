package project.view;

import project.controller.PageNavigator;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WelcomeFrame {

    private JFrame frame;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton createAccountButton;
    private JButton loginButton;

    public WelcomeFrame() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("EquiChoice");
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setBounds(627, 25, 377, 141);
        frame.getContentPane().add(titleLabel);

        usernameTextField = new JTextField();
        usernameTextField.setFont(new Font("Monospaced", Font.BOLD, 30));
        usernameTextField.setForeground(new Color(254, 250, 224));
        usernameTextField.setBackground(new Color(40, 54, 24));
        usernameTextField.setBounds(992, 462, 270, 41);
        usernameTextField.setCaretColor(new Color(254, 250, 224));
        frame.getContentPane().add(usernameTextField);
        usernameTextField.setColumns(10);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        usernameLabel.setBounds(805, 463, 177, 40);
        usernameLabel.setForeground(new Color(254, 250, 224));
        frame.getContentPane().add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        passwordLabel.setBounds(805, 514, 175, 40);
        passwordLabel.setForeground(new Color(254, 250, 224));
        frame.getContentPane().add(passwordLabel);

        passwordTextField = new JPasswordField();
        passwordTextField.setFont(new Font("Monospaced", Font.BOLD, 30));
        passwordTextField.setForeground(new Color(254, 250, 224));
        passwordTextField.setBackground(new Color(40, 54, 24));
        passwordTextField.setCaretColor(new Color(254, 250, 224));
        passwordTextField.setColumns(10);
        passwordTextField.setBounds(992, 513, 270, 41);
        frame.getContentPane().add(passwordTextField);

        JLabel createAccountLabel = new JLabel("Don't have an account? \r\nCreate one!");
        createAccountLabel.setForeground(new Color(254, 250, 224));
        createAccountLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        createAccountLabel.setBounds(733, 628, 626, 62);
        frame.getContentPane().add(createAccountLabel);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setFont(new Font("Monospaced", Font.BOLD, 25));
        createAccountButton.setBounds(893, 700, 265, 54);
        createAccountButton.setBackground(new Color(221, 161, 94));
        createAccountButton.setForeground(new Color(40, 54, 24));

        frame.getContentPane().add(createAccountButton);

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new CreateAccountFrame();
            }
        });

        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(221, 161, 94));
        loginButton.setForeground(new Color(40, 54, 24));
        loginButton.setFont(new Font("Monospaced", Font.BOLD, 25));
        loginButton.setBounds(893, 564, 265, 54);
        frame.getContentPane().add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabels?autoReconnect=true&useSSL=false", "root", "uncacat");
                    Statement stmt = con.createStatement();
                    String sql = "Select * from login where username = '" + usernameTextField.getText() + "' and password ='" + passwordTextField.getText() + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        frame.setVisible(false);
                        refreshCorrectLogin();
                        EquiChoiceMenu equiChoiceMenu = new EquiChoiceMenu();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect credentials.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        refreshIncorrectLogin();
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.print(e);
                }
            }
        });

        JTextArea introTextArea = new JTextArea();
        introTextArea.setWrapStyleWord(true);
        introTextArea.setLineWrap(true);
        introTextArea.setFont(new Font("Monospaced", Font.BOLD, 30));
        introTextArea.setForeground(new Color(254, 250, 224));
        introTextArea.setBackground(new Color(96, 108, 56));
        introTextArea.setEditable(false);
        introTextArea.setText("Hello and welcome to EquiChoice, an app designed to provide you with a selection of high-quality gear, ranging from saddles and bridles to riding apparel and grooming supplies. Get started by creating your account today and discover the best in horse riding accessories. Happy riding!");
        introTextArea.setBounds(286, 236, 1105, 212);
        frame.getContentPane().add(introTextArea);

        JLabel imageLabel = new JLabel("");
        imageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        imageLabel.setBounds(240, 462, 472, 267);
        frame.getContentPane().add(imageLabel);
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("images/cuier.jpeg"));
        imageLabel.setIcon(img);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        exitButton.setBounds(28, 10, 81, 62);
        exitButton.setBackground(new Color(221, 161, 94));
        exitButton.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(exitButton);

        PageNavigator pageNavigator = new PageNavigator(frame, exitButton, new JButton());

        UIManager.put("Button.select", new Color(221, 161, 94));
        SwingUtilities.updateComponentTreeUI(exitButton);
        SwingUtilities.updateComponentTreeUI(loginButton);
        SwingUtilities.updateComponentTreeUI(createAccountButton);

        UIManager.put("OptionPane.background", new Color(40, 54, 24));
        UIManager.put("Panel.background", new Color(40, 54, 24));
        UIManager.put("OptionPane.messageForeground", new Color(254, 250, 224));
        UIManager.put("Button.background", new Color(221, 161, 94));
        UIManager.put("Button.foreground", new Color(40, 54, 24));
        UIManager.put("OptionPane.messageFont", new Font("Monospaced", Font.BOLD, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Monospaced", Font.BOLD, 12));

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public void refreshCorrectLogin() {
        passwordTextField.setText(null);
        passwordTextField.setText(null);
        frame.dispose();
    }

    public void refreshIncorrectLogin() {
        passwordTextField.setText(null);
        usernameTextField.setText(null);
    }

    public void showMessage(String s) {
        JOptionPane.showMessageDialog(frame, s);
    }


}
