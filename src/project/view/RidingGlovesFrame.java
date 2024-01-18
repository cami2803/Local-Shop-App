package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.RidingGloves;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RidingGlovesFrame {
    private JFrame frame;
    private OrderManagement orderManagement;

    public RidingGlovesFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Riding Gloves");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(627, 25, 494, 141);
        frame.getContentPane().add(titleLabel);

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

        JLabel glove1 = new JLabel("");
        glove1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(glove1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/manusi1.jpg"));
        glove1.setIcon(img1);

        JLabel glove2 = new JLabel("");
        glove2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(glove2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/manusi2.jpg"));
        glove2.setIcon(img2);

        JLabel glove3 = new JLabel("");
        glove3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/manusi3.jpg"));
        frame.getContentPane().add(glove3);
        glove3.setIcon(img3);

        JLabel glove4 = new JLabel("");
        glove4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/manusi4.jpg"));
        frame.getContentPane().add(glove4);
        glove4.setIcon(img4);

        JLabel glove5 = new JLabel("");
        glove5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/manusi5.jpg"));
        frame.getContentPane().add(glove5);
        glove5.setIcon(img5);

        JLabel glove1Label = new JLabel("Edina Gloves  39.99$");
        glove1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        glove1Label.setForeground(new Color(254, 250, 224));
        glove1Label.setBounds(41, 487, 240, 27);
        frame.getContentPane().add(glove1Label);

        JLabel glove2Label = new JLabel("Polygrip Gloves  7.99$");
        glove2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        glove2Label.setForeground(new Color(254, 250, 224));
        glove2Label.setBounds(337, 487, 230, 27);
        frame.getContentPane().add(glove2Label);

        JLabel glove3Label = new JLabel("Thermo Gloves  19.99$");
        glove3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        glove3Label.setForeground(new Color(254, 250, 224));
        glove3Label.setBounds(632, 492, 240, 27);
        frame.getContentPane().add(glove3Label);

        JLabel glove4Label = new JLabel("Eliana Gloves  7.99$");
        glove4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        glove4Label.setForeground(new Color(254, 250, 224));
        glove4Label.setBounds(939, 492, 240, 27);
        frame.getContentPane().add(glove4Label);

        JLabel glove5Label = new JLabel("Lone Gloves  34.99$");
        glove5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        glove5Label.setForeground(new Color(254, 250, 224));
        glove5Label.setBounds(1241, 487, 290, 27);
        frame.getContentPane().add(glove5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addRidingGlovesToOrder("Edina Gloves"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addRidingGlovesToOrder("Polygrip Gloves"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addRidingGlovesToOrder("Thermo Gloves"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addRidingGlovesToOrder("Eliana Gloves"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addRidingGlovesToOrder("Lone Gloves"));
        frame.getContentPane().add(addToOrder5Button);

        JButton btnFinishOrder = new JButton("Finish Order");
        btnFinishOrder.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnFinishOrder.setBounds(1327, 28, 159, 48);
        btnFinishOrder.setBackground(new Color(221, 161, 94));
        btnFinishOrder.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(btnFinishOrder);

        JToggleButton showDescriptionToggle1 = new JToggleButton("Show Description");
        showDescriptionToggle1.setBounds(42, 583, 152, 21);
        showDescriptionToggle1.setBackground(new Color(221, 161, 94));
        showDescriptionToggle1.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle1);

        JToggleButton showDescriptionToggle2 = new JToggleButton("Show Description");
        showDescriptionToggle2.setBounds(349, 583, 152, 21);
        showDescriptionToggle2.setBackground(new Color(221, 161, 94));
        showDescriptionToggle2.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle2);

        JToggleButton showDescriptionToggle3 = new JToggleButton("Show Description");
        showDescriptionToggle3.setBounds(654, 583, 152, 21);
        showDescriptionToggle3.setBackground(new Color(221, 161, 94));
        showDescriptionToggle3.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle3);

        JToggleButton showDescriptionToggle4 = new JToggleButton("Show Description");
        showDescriptionToggle4.setBounds(933, 583, 152, 21);
        showDescriptionToggle4.setBackground(new Color(221, 161, 94));
        showDescriptionToggle4.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle4);

        JToggleButton showDescriptionToggle5 = new JToggleButton("Show Description");
        showDescriptionToggle5.setBounds(1238, 583, 152, 21);
        showDescriptionToggle5.setBackground(new Color(221, 161, 94));
        showDescriptionToggle5.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle5);

        JTextArea descriptionTextArea1 = new JTextArea();
        descriptionTextArea1.setWrapStyleWord(true);
        descriptionTextArea1.setOpaque(false);
        descriptionTextArea1.setLineWrap(true);
        descriptionTextArea1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea1.setEditable(false);
        descriptionTextArea1.setBackground(new Color(96, 108, 56));
        descriptionTextArea1.setForeground(new Color(254, 250, 224));
        descriptionTextArea1.setBounds(41, 628, 200, 182);
        frame.getContentPane().add(descriptionTextArea1);

        JTextArea descriptionTextArea2 = new JTextArea();
        descriptionTextArea2.setWrapStyleWord(true);
        descriptionTextArea2.setOpaque(false);
        descriptionTextArea2.setLineWrap(true);
        descriptionTextArea2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea2.setEditable(false);
        descriptionTextArea2.setBackground(new Color(96, 108, 56));
        descriptionTextArea2.setForeground(new Color(254, 250, 224));
        descriptionTextArea2.setBounds(348, 628, 200, 182);
        frame.getContentPane().add(descriptionTextArea2);

        JTextArea descriptionTextArea3 = new JTextArea();
        descriptionTextArea3.setWrapStyleWord(true);
        descriptionTextArea3.setOpaque(false);
        descriptionTextArea3.setLineWrap(true);
        descriptionTextArea3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea3.setEditable(false);
        descriptionTextArea3.setBackground(new Color(96, 108, 56));
        descriptionTextArea3.setForeground(new Color(254, 250, 224));
        descriptionTextArea3.setBounds(649, 628, 200, 182);
        frame.getContentPane().add(descriptionTextArea3);

        JTextArea descriptionTextArea4 = new JTextArea();
        descriptionTextArea4.setWrapStyleWord(true);
        descriptionTextArea4.setOpaque(false);
        descriptionTextArea4.setLineWrap(true);
        descriptionTextArea4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea4.setEditable(false);
        descriptionTextArea4.setBackground(new Color(96, 108, 56));
        descriptionTextArea4.setForeground(new Color(254, 250, 224));
        descriptionTextArea4.setBounds(952, 628, 200, 182);
        frame.getContentPane().add(descriptionTextArea4);

        JTextArea descriptionTextArea5 = new JTextArea();
        descriptionTextArea5.setWrapStyleWord(true);
        descriptionTextArea5.setOpaque(false);
        descriptionTextArea5.setLineWrap(true);
        descriptionTextArea5.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea5.setEditable(false);
        descriptionTextArea5.setBackground(new Color(96, 108, 56));
        descriptionTextArea5.setForeground(new Color(254, 250, 224));
        descriptionTextArea5.setBounds(1244, 628, 200, 182);
        frame.getContentPane().add(descriptionTextArea5);

        JScrollPane descriptionScrollPane2 = new JScrollPane(descriptionTextArea2);
        descriptionScrollPane2.setBounds(348, 628, 200, 182);
        descriptionScrollPane2.setOpaque(false);
        descriptionScrollPane2.getViewport().setOpaque(false);
        descriptionScrollPane2.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane2);

        JScrollPane descriptionScrollPane3 = new JScrollPane(descriptionTextArea3);
        descriptionScrollPane3.setBounds(649, 628, 200, 182);
        descriptionScrollPane3.setOpaque(false);
        descriptionScrollPane3.getViewport().setOpaque(false);
        descriptionScrollPane3.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane3);

        JScrollPane descriptionScrollPane4 = new JScrollPane(descriptionTextArea4);
        descriptionScrollPane4.setBounds(952, 628, 200, 182);
        descriptionScrollPane4.setOpaque(false);
        descriptionScrollPane4.getViewport().setOpaque(false);
        descriptionScrollPane4.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane4);

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "The ROECK-Grip is our most successful Autumn/Winter model. The classic asts not only a chic appearance, but also features light, elastic material. This glove is like a second skin, which translates to the highest level of sensitivity for controlling.");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "Stylish and functional gloves for casual riding and schooling.\n" +
                "\n" +
                "These trendy gloves have PU leather at the palm which provides a solid grip, while the back mesh panel will keep your hands from sweating and overheating. Glitter details provide the perfect final touch.\n" +
                "\n" +
                "Features:\n" +
                "• Cool, breathable summer gloves\n" +
                "• Stretchy\n" +
                "• Dirt repellent\n" +
                "• Glitter details\n" +
                "• Adjustable cuff fastener\n" +
                "• Elasticated cuff");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "Grab these warm thermal gloves for cold weather riding.\n" +
                "\n" +
                "Cold weather rides just got better with these thermal riding gloves. The windproof fabric is warm, soft and weatherproof for optimal winter riding. The stretch panel between fingers is comfortable and allows you to grip the reins. The bold B Vertigo logo looks great but is also reflective for safety.\n" +
                "\n" +
                "Features:\n" +
                "• Warm, soft winter gloves\n" +
                "• Anti slip silicone print inside palm and fingers\n" +
                "• Reflective logo print for safety\n" +
                "• Soft knitted rib opening for comfort");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Elastic kids riding gloves with easy grip.\n" +
                "\n" +
                "The Horze Eliana riding gloves are made from stretchy material, and equipped with grippy silicone on the PU leather palm. The elastic cuff holds them in place.\n" +
                "\n" +
                "Features:\n" +
                "• Stretchy material\n" +
                "• Silicone grip on PU palm\n" +
                "• Elastic cuff\n");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "This successful model from Roeck-Grip was redesigned to include two fashionable color variants for the fashionable female rider who likes to coordinate her favorite gloves with her trendy riding clothes. Of course, this model also boasts an excellent fit and function and is machine washable.");

        PageNavigator pageNavigator = new PageNavigator(frame, exitButton, btnBack);

        btnFinishOrder.addActionListener(e -> {
            new OrderFrame(OrderManagement.getInstance());
            frame.dispose();
        });

        UIManager.put("Button.select", new Color(221, 161, 94));
        SwingUtilities.updateComponentTreeUI(addToOrder1Button);
        SwingUtilities.updateComponentTreeUI(addToOrder2Button);
        SwingUtilities.updateComponentTreeUI(addToOrder3Button);
        SwingUtilities.updateComponentTreeUI(addToOrder4Button);
        SwingUtilities.updateComponentTreeUI(addToOrder5Button);
        SwingUtilities.updateComponentTreeUI(exitButton);
        SwingUtilities.updateComponentTreeUI(btnBack);
        SwingUtilities.updateComponentTreeUI(btnFinishOrder);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    private RidingGloves getRidingPantsFromDatabase(String glovesName) {
        if ("Edina Gloves".equals(glovesName)) {
            return new RidingGloves(1, glovesName, 39.99f);
        } else if ("Polygrip Gloves".equals(glovesName)) {
            return new RidingGloves(2, glovesName, 7.99f);
        } else if ("Thermo Gloves".equals(glovesName)) {
            return new RidingGloves(2, glovesName, 19.99f);
        } else if ("Eliana Gloves".equals(glovesName)) {
            return new RidingGloves(2, glovesName, 7.99f);
        } else if ("Lone Gloves".equals(glovesName)) {
            return new RidingGloves(2, glovesName, 34.99f);
        } else {
        return null;
        }
    }

    private void addRidingGlovesToOrder(String glovesName) {
        RidingGloves gloves = getRidingPantsFromDatabase(glovesName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(gloves);
        JOptionPane.showMessageDialog(frame, glovesName + " added to order.");
    }

    private void setToggleAction(JToggleButton toggleButton, JTextArea textArea, String description) {
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("Hide Description");
                    textArea.setText(description);
                    textArea.setCaretPosition(0);

                    UIManager.put("ToggleButton.select", new Color(221, 161, 94));
                    SwingUtilities.updateComponentTreeUI(toggleButton);
                } else {
                    toggleButton.setText("Show Description");
                    textArea.setText("");
                }
            }
        });
    }
}
