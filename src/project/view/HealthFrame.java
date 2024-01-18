package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Care;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthFrame {

    private JFrame frame;
    private OrderManagement orderManagement;

    public HealthFrame() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Horse Health Care");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(424, 22, 840, 141);
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

        JLabel health1 = new JLabel("");
        health1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(health1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/perie.jpg"));
        health1.setIcon(img1);

        JLabel health2 = new JLabel("");
        health2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(health2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/burete.jpg"));
        health2.setIcon(img2);

        JLabel health3 = new JLabel("");
        health3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/health3.jpg"));
        frame.getContentPane().add(health3);
        health3.setIcon(img3);

        JLabel health4 = new JLabel("");
        health4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/health4.jpg"));
        frame.getContentPane().add(health4);
        health4.setIcon(img4);

        JLabel health5 = new JLabel("");
        health5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/health5.jpg"));
        frame.getContentPane().add(health5);
        health5.setIcon(img5);

        JLabel health1Label = new JLabel("Firm Brush 13.99$");
        health1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        health1Label.setForeground(new Color(254, 250, 224));
        health1Label.setBounds(41, 487, 200, 27);
        frame.getContentPane().add(health1Label);

        JLabel health2Label = new JLabel("Curry Comb 9.99$");
        health2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        health2Label.setForeground(new Color(254, 250, 224));
        health2Label.setBounds(337, 487, 221, 27);
        frame.getContentPane().add(health2Label);

        JLabel health3Label = new JLabel("Grooming Set  21.99$");
        health3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        health3Label.setForeground(new Color(254, 250, 224));
        health3Label.setBounds(632, 492, 234, 27);
        frame.getContentPane().add(health3Label);

        JLabel health4Label = new JLabel("Transparent Comb 2.99$");
        health4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        health4Label.setForeground(new Color(254, 250, 224));
        health4Label.setBounds(939, 492, 234, 27);
        frame.getContentPane().add(health4Label);

        JLabel health5Label = new JLabel("Hoof Pick with Brush 1.99$");
        health5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        health5Label.setForeground(new Color(254, 250, 224));
        health5Label.setBounds(1241, 487, 234, 27);
        frame.getContentPane().add(health5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addHealtItemToOrder("Firm Brush"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addHealtItemToOrder("Curry Comb"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addHealtItemToOrder("Grooming Set"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addHealtItemToOrder("Transparent Comb"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addHealtItemToOrder("Hoof Pick with Brush"));
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

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "A classic brush with firm bristles made of mixed natural Tampic material and a braided wooden handle. Tampic helps prevent shocks when brushing. 5cm bristles.");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "Description\n" +
                "We are eager to expand our sustainable Horze collection with this brush. For horse care with good conscience.\n" +
                "\n" +
                "Part of the eco grooming collection. Care for your horse's coat while also taking care of the environment? No problem wiht this sustainable body brush. With printed Aztec inspired pattern on the back.\n" +
                "\n" +
                "Features:\n" +
                "• Sustainable - made from straw\n" +
                "• Aztec print\n" +
                "• Soft bristles\n" +
                "• Easy to clean\n" +
                "• Technical description:\n" +
                "• Straw.\n" +
                "\n" +
                "Washing instructions:\n" +
                "• Hand wash in cold water.");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "Description\n" +
                "New soft-touch grooming set. Comes in a clear PVC zipper bag. 6 different and useful grooming tools in unique colour combinations.\n" +
                "\n" +
                "Features:\n" +
                "• Soft-touch grooming set\n" +
                "• Clear PVC zipper bag\n" +
                "• 6 different and useful grooming tools\n" +
                "• High quality\n" +
                "• Plastic tools\n" +
                "Technical description:\n" +
                "• 100% polyester.");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Transparent rubber curry comb. Moulds easily to the palm with its flexibility, making grooming more effective. Fits small hands.");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "Plastic handle with integrated hoof pick.");

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

    private Care getHealthCareFromDatabase(String healthName) {
        if ("Firm Brush".equals(healthName)) {
            return new Care(1, healthName, 13.99f);
        } else if ("Curry Comb".equals(healthName)) {
            return new Care(2, healthName, 9.99f);
        } else if ("Grooming Set".equals(healthName)) {
            return new Care(2, healthName, 21.99f);
        } else if ("Transparent Comb".equals(healthName)) {
            return new Care(2, healthName, 2.99f);
        } else if ("Hoof Pick with Brush".equals(healthName)) {
            return new Care(2, healthName, 1.99f);
        } else {
            return null;
        }
    }

    private void addHealtItemToOrder(String healthName) {
        Care health = getHealthCareFromDatabase(healthName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(health);
        JOptionPane.showMessageDialog(frame, healthName + " added to order.");
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

