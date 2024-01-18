package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.controller.QuantityEditor;
import project.controller.QuantityRenderer;
import project.model.Item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

//Class which creates the user interface for displaying order details within a window
public class OrderFrame {
    private JFrame frame;
    private JTable orderTable;
    private DefaultTableModel tableModel;
    private JTextArea textArea;

    //The constructor takes an OrderManagement object as a parameter, which is used to populate the order details
    public OrderFrame(OrderManagement order) {
        frame = new JFrame("Order Details"); //A JFrame is created with a title "Order Details"
        //The content pane's background color, layout, and bounds are set.
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        //A title label for the order is created and styled.
        JLabel titleLabel = new JLabel("Your Order");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(627, 25, 419, 141);
        frame.getContentPane().add(titleLabel);

        //A DefaultTableModel is created and set up with column names for "Item Name", "Quantity", and "Price".
        String[] columnNames = {"Item Name", "Quantity", "Price"};
        tableModel = new DefaultTableModel(columnNames, 0);

        //A JTable (orderTable) is created with the table model, and column widths are set.
        orderTable = new JTable(tableModel);
        orderTable.setFont(new Font("Monospaced", Font.PLAIN, 15));
        TableColumn column;
        for (int i = 0; i < orderTable.getColumnCount(); i++) {
            column = orderTable.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(300);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(150);
            }
        }

        orderTable.setFillsViewportHeight(true);
        orderTable.setBackground(new Color(40, 54, 24));
        orderTable.setForeground(new Color(254, 250, 224));
        orderTable.setFillsViewportHeight(true);
        orderTable.setBackground(new Color(40, 54, 24));
        orderTable.setForeground(new Color(254, 250, 224));

        //JScrollPane is added to allow scrolling through the table.
        JScrollPane scrollPane = new JScrollPane(orderTable);
        scrollPane.setBounds(122, 266, 567, 302);
        frame.getContentPane().add(scrollPane);

        //Button for confirming the order
        JButton confirmOrderButton = new JButton("Confirm Order");
        confirmOrderButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        confirmOrderButton.setBackground(new Color(221, 161, 94));
        confirmOrderButton.setForeground(new Color(40, 54, 24));
        confirmOrderButton.setBounds(122, 578, 200, 34);
        frame.getContentPane().add(confirmOrderButton);

        //Button for exiting the application
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        exitButton.setBackground(new Color(221, 161, 94));
        exitButton.setForeground(new Color(40, 54, 24));
        exitButton.setBounds(28, 10, 81, 62);
        frame.getContentPane().add(exitButton);

        //Button for going back
        JButton btnBack = new JButton("Back");
        btnBack.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnBack.setBounds(28, 77, 81, 62);
        btnBack.setBackground(new Color(221, 161, 94));
        btnBack.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(btnBack);

        JLabel orderPic = new JLabel("");
        orderPic.setVerticalAlignment(SwingConstants.TOP);
        orderPic.setBounds(882, 212, 848, 767);
        frame.getContentPane().add(orderPic);
        ImageIcon img = new ImageIcon(this.getClass().getResource("/images/order.png"));
        orderPic.setIcon(img);

        JLabel totalLabel = new JLabel("Total: ");
        totalLabel.setForeground(new Color(254, 250, 224));
        totalLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        totalLabel.setBounds(452, 576, 94, 34);
        frame.getContentPane().add(totalLabel);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setForeground(new Color(254, 250, 224));
        textArea.setBackground(new Color(40, 54, 24));
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        frame.getContentPane().add(textArea);

        //The plus and minus buttons are added to every item in the order list
        TableColumn quantityColumn = orderTable.getColumnModel().getColumn(1);
        quantityColumn.setCellRenderer(new QuantityRenderer());
        quantityColumn.setCellEditor(new QuantityEditor((DefaultTableModel) orderTable.getModel(), this, order));

        loadOrderData(order);

        textArea.setBounds(531, 585, 158, 22);

        //PageNavigator is used to add functionality to the exit and back buttons, allowing navigation and closing of the application.
        PageNavigator pageNavigator = new PageNavigator(frame, exitButton, btnBack);

        //An action listener is added to the confirm order button to process the order confirmation logic.
        confirmOrderButton.addActionListener(e -> {
            if (tableModel.getRowCount() == 0) {
                order.startNewOrder();
                JOptionPane.showMessageDialog(frame, "There are no active orders!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                int confirmed = JOptionPane.showConfirmDialog(frame, "Are you sure about your order?", "Confirm Order", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmed == JOptionPane.YES_OPTION) {
                    order.completeOrder();
                    tableModel.setRowCount(0);
                    textArea.setText("");
                    JOptionPane.showMessageDialog(frame, "Thank you for your order! :)");
                } else if (confirmed == JOptionPane.NO_OPTION) {
                    tableModel.setRowCount(0);
                    JOptionPane.showMessageDialog(frame, "I hope you will find something that you will like! :)");
                }
            }
        });

        JButton quizButton = new JButton("Take a quick Quiz");
        quizButton.setForeground(new Color(40, 54, 24));
        quizButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        quizButton.setBackground(new Color(221, 161, 94));
        quizButton.setBounds(1200, 25, 200, 62);
        frame.getContentPane().add(quizButton);

        startQuiz(quizButton);

        //UI components' look and feel are updated
        UIManager.put("Button.select", new Color(221, 161, 94));
        SwingUtilities.updateComponentTreeUI(exitButton);
        SwingUtilities.updateComponentTreeUI(btnBack);
        SwingUtilities.updateComponentTreeUI(confirmOrderButton);
        SwingUtilities.updateComponentTreeUI(quizButton);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    //This method calculates the total price of all items in the order and updates the text area to
    // display the total price formatted to two decimal places.
    public void updateTotalPrice() {
        float total = 0f;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            total += (Float) tableModel.getValueAt(i, 2);
        }
        textArea.setText(String.format("%.2f", total));
    }

    //his method populates the table with order data from the OrderManagement object. It clears any existing
    // rows in the table model, calculates the total order price, and fills the table with item names and prices.
    // It then updates the text area to show the calculated total price.
    private void loadOrderData(OrderManagement order) {
        tableModel.setRowCount(0);
        float total = 0f;
        if (order.getCurrentOrder() != null) {
            for (Item item : order.getCurrentOrder().getItems()) {
                float price = item.getPrice();
                total += price;
                tableModel.addRow(new Object[]{item.getName(), 1, price});
            }
        }
        textArea.setText(String.format("%.2f", total));
    }

    public void checkAndStartNewOrder(OrderManagement order) {
        if (tableModel.getRowCount() == 0) {
            order.startNewOrder();
        }
    }

    private void displayQuestion(int questionIndex, AtomicInteger correctCount, String[] questions, String[][] options, String[] correctAnswers) {
        JDialog quizDialog = new JDialog(frame, "Horse Riding Quiz", true);
        quizDialog.setLayout(new GridLayout(0, 1)); // Use GridLayout for question and answers

        // Add a question label
        JLabel questionLabel = new JLabel(questions[questionIndex]);
        questionLabel.setForeground(new Color(254, 250, 224));
        quizDialog.add(questionLabel);

        // Create buttons for possible answers
        ButtonGroup optionsGroup = new ButtonGroup();
        for (String option : options[questionIndex]) {
            JRadioButton optionButton = new JRadioButton(option);
            optionsGroup.add(optionButton);
            quizDialog.add(optionButton);
        }

        // Add a submit button
        JButton submitButton = new JButton("Submit Answer");
        quizDialog.add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(actionEvent -> {
            // Find the selected answer
            Enumeration<AbstractButton> allRadioButtons = optionsGroup.getElements();
            String selectedAnswer = null;
            while (allRadioButtons.hasMoreElements()) {
                JRadioButton temp = (JRadioButton) allRadioButtons.nextElement();
                if (temp.isSelected()) {
                    selectedAnswer = temp.getText();
                    break;
                }
            }
            // Check if the answer is correct
            if (selectedAnswer != null && selectedAnswer.equals(correctAnswers[questionIndex])) {
                correctCount.incrementAndGet();
            }

            // Move to the next question or show the results if it was the last question
            int nextQuestionIndex = questionIndex + 1;
            quizDialog.dispose();
            if (nextQuestionIndex < questions.length) {
                displayQuestion(nextQuestionIndex, correctCount, questions, options, correctAnswers);
            } else {
                JOptionPane.showMessageDialog(frame, "Quiz finished! Correct answers: " + correctCount.get() +
                        ", Incorrect answers: " + (questions.length - correctCount.get()), "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the size of the dialog and make it visible
        quizDialog.setSize(400, 300);
        quizDialog.setLocationRelativeTo(frame);
        quizDialog.setVisible(true);
    }

    private void startQuiz(JButton button) {
        button.addActionListener(e -> {
            // Initialize the quiz data
            String[] questions = {
                    "1. What is the common term for a young horse?",
                    "2. What is a female horse called?",
                    "3. Which horse breed is known for racing?",
                    "4. How much did the most expensive horse cost?",
                    "5. Which of these was a famous fictional horse?"
            };
            String[][] options = {
                    {"A. Colt", "B. Mare", "C. Stallion", "D. Foal"},
                    {"A. Stallion", "B. Mare", "C. Gelding", "D. Colt"},
                    {"A. Arabian", "B. Shire", "C. Thoroughbred", "D. Mustang"},
                    {"A. $15 million", "B. $70 million", "C. $50 million", "D. $40 million "},
                    {"A. Blue Beauty", "B. Brown Beauty", "C. Black Beauty", "D. Bronze Beauty"}
            };
            String[] correctAnswers = {"D. Foal", "B. Mare", "C. Thoroughbred", "B. $70 million", "C. Black Beauty"};
            AtomicInteger correctCount = new AtomicInteger(0);

            // Start the quiz with the first question
            displayQuestion(0, correctCount, questions, options, correctAnswers);
        });
    }



}