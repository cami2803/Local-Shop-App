package project.controller;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

//Class designed to display a quantity with a decrement and increment button on either side within the table cell
public class QuantityRenderer extends JPanel implements TableCellRenderer {
    private final JLabel quantityLabel = new JLabel(); //A JLabel used to display the quantity value in the cell.

    public QuantityRenderer() {
        super(new BorderLayout()); //Initialize the JPanel with a BorderLayout.
        setBackground(new Color(96, 108, 56)); //Set the background color of the panel
        quantityLabel.setOpaque(true); //Make the quantityLabel opaque and set its background color and horizontal alignment.
        quantityLabel.setBackground(new Color(254, 250, 224));
        quantityLabel.setHorizontalAlignment(JLabel.CENTER);

        //Create minus and plus buttons, which are disabled
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        minus.setEnabled(false);
        plus.setEnabled(false);

        //Add the minus button, quantity label, and plus button to the panel in the respective border layout positions.
        add(minus, BorderLayout.WEST);
        add(quantityLabel, BorderLayout.CENTER);
        add(plus, BorderLayout.EAST);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        quantityLabel.setText(value.toString()); //Set the text of quantityLabel to the string representation of the value passed to this method, which is the value contained in the cell.
        return this; //Returns the entire panel as the component to render the cell
    }
}