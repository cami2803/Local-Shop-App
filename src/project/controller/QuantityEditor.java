package project.controller;

import project.view.OrderFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;

// Class that is used as a custom cell editor within a JTable
// The class extends AbstractCellEditor and implements TableCellEditor, which are parts of the Swing library for
// creating editable components in table cells.
public class QuantityEditor extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel = new JPanel(new BorderLayout()); //A JPanel that will contain the minus button, quantity label, and plus button.
    private final JButton minus = new JButton("-"); //minus and plus: JButton components to decrease and increase the quantity.
    private final JButton plus = new JButton("+");
    private final JLabel quantityLabel = new JLabel("1", SwingConstants.CENTER);//: A JLabel to display the current quantity.
    private DefaultTableModel tableModel; //The DefaultTableModel of the JTable which this editor is part of.
    private OrderFrame orderFrame; //A reference to the OrderFrame which contains the JTable.
    private int currentRow; //Stores the index of the currently edited row.
    private float unitPrice; //The price per unit of the item.
    private OrderManagement order; //The current order

    //Initializing the panel and its components, setting their visual properties.
    public QuantityEditor(DefaultTableModel tableModel, OrderFrame orderFrame, OrderManagement order) {
        this.tableModel = tableModel;
        this.orderFrame = orderFrame;
        this.order = order;
        panel.add(minus, BorderLayout.WEST);
        panel.add(quantityLabel, BorderLayout.CENTER);
        panel.add(plus, BorderLayout.EAST);
        panel.setBackground(new Color(96, 108, 56));
        quantityLabel.setOpaque(true);
        quantityLabel.setBackground(new Color(254, 250, 224));

        //Action listeners to the minus and plus buttons to handle the decrease and increase actions.
        minus.addActionListener(e -> decrement());
        plus.addActionListener(e -> increment());
    }

    //Decrease the quantity by one if it's greater than one and updates the table model with the new quantity and total price.
    private void decrement() {
        int quantity = Integer.parseInt(quantityLabel.getText());
        quantity--;
        quantityLabel.setText(String.valueOf(quantity));
        updateTableModel(quantity);
        if (quantity == 0) {
            int response = JOptionPane.showConfirmDialog(panel, "Are you sure you want to remove this item from your order?", "Confirm Removal", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                tableModel.removeRow(currentRow);
                orderFrame.updateTotalPrice();
                orderFrame.checkAndStartNewOrder(order);
            }
        }
    }

    //Increase the quantity by one and updates the table model with the new quantity and total price.
    private void increment() {
        int quantity = Integer.parseInt(quantityLabel.getText());
        quantity++;
        quantityLabel.setText(String.valueOf(quantity));
        updateTableModel(quantity);
    }

    private void updateTableModel(int quantity) {
        float newPrice = unitPrice * quantity; //Calculate the new price based on the unit price and the specified quantity.
        tableModel.setValueAt(quantity, currentRow, 1); //Update the table model to reflect the new quantity and total price.
        tableModel.setValueAt(newPrice, currentRow, 2);
        orderFrame.updateTotalPrice(); //update the total price display in the OrderFrame.
        fireEditingStopped();
    }

    //Overrides AbstractCellEditor's method to return the new quantity as an Integer.
    @Override
    public Object getCellEditorValue() {
        return Integer.parseInt(quantityLabel.getText());
    }


    //Set up the editor component for the given table cell.
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.currentRow = row; //Retrieve and store the currentRow.

        //Calculate the unit price if the value is an instance of Integer
        if (column == 1 && value instanceof Integer) {
            this.unitPrice = (Float) table.getModel().getValueAt(row, 2) / (Integer) value;
        }
        quantityLabel.setText(value.toString()); //Set the text of quantityLabel to the value of the cell being edited.
        return panel;
    }
}
