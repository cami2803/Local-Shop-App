package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Saddle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaddlesFrame {

    private JFrame frame;
    private OrderManagement orderManagement;

    public SaddlesFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Saddles");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(627, 25, 285, 141);
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

        JLabel saddle1 = new JLabel("");
        saddle1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(saddle1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/sa1.jpg"));
        saddle1.setIcon(img1);

        JLabel saddle2 = new JLabel("");
        saddle2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(saddle2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/sa3.jpg"));
        saddle2.setIcon(img2);

        JLabel saddle3 = new JLabel("");
        saddle3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/sa2.jpg"));
        frame.getContentPane().add(saddle3);
        saddle3.setIcon(img3);

        JLabel saddle4 = new JLabel("");
        saddle4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/sa4.jpg"));
        frame.getContentPane().add(saddle4);
        saddle4.setIcon(img4);

        JLabel saddle5 = new JLabel("");
        saddle5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/sa5.jpg"));
        frame.getContentPane().add(saddle5);
        saddle5.setIcon(img5);

        JLabel sa1Label = new JLabel("Leather Saddle   432$");
        sa1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        sa1Label.setForeground(new Color(254, 250, 224));
        sa1Label.setBounds(41, 487, 200, 27);
        frame.getContentPane().add(sa1Label);

        JLabel sa2Label = new JLabel("Icelandic Saddle  2368$");
        sa2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        sa2Label.setForeground(new Color(254, 250, 224));
        sa2Label.setBounds(337, 487, 221, 27);
        frame.getContentPane().add(sa2Label);

        JLabel sa3Label = new JLabel("All Purpose Saddle 241.99$");
        sa3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        sa3Label.setForeground(new Color(254, 250, 224));
        sa3Label.setBounds(632, 492, 234, 27);
        frame.getContentPane().add(sa3Label);

        JLabel sa4Label = new JLabel("Bareback Saddle  55.99$");
        sa4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        sa4Label.setForeground(new Color(254, 250, 224));
        sa4Label.setBounds(939, 492, 234, 27);
        frame.getContentPane().add(sa4Label);

        JLabel sa5Label = new JLabel("Western Saddle  2599.99$");
        sa5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        sa5Label.setForeground(new Color(254, 250, 224));
        sa5Label.setBounds(1241, 487, 234, 27);
        frame.getContentPane().add(sa5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addSaddleToOrder("Leather Saddle"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addSaddleToOrder("Icelandic Saddle"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addSaddleToOrder("All Purpose Saddle"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addSaddleToOrder("Bareback Saddle"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addSaddleToOrder("Western Saddle"));
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

        JScrollPane descriptionScrollPane1 = new JScrollPane(descriptionTextArea1);
        descriptionScrollPane1.setBounds(41, 628, 200, 182);
        descriptionScrollPane1.setOpaque(false);
        descriptionScrollPane1.getViewport().setOpaque(false);
        descriptionScrollPane1.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane1);

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

        JScrollPane descriptionScrollPane5 = new JScrollPane(descriptionTextArea5);
        descriptionScrollPane5.setBounds(1244, 628, 200, 182);
        descriptionScrollPane5.setOpaque(false);
        descriptionScrollPane5.getViewport().setOpaque(false);
        descriptionScrollPane5.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane5);

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "The Eldorado Easy-Fit Saddle by High Horse Saddles is made with the ladies in mind. This lightweight saddle features a Cordura skirt and fenders for easier agility. The Ralide flexible tree allows your horse freedom of movement while the adjustable position rigging gives the perfect fit. The all leather swell and cantle has a smooth finish. Features a fleece lined skirt, padded seat and ralide trail stirrups.");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "A very nice saddle with adjustable and exchangeable knee rolls, as well as exchangeable gullet iron, in a very flexible high-tech synthetic saddle tree, with great shock absorption and weight distribution." + "• Exchangeable gullet plates\n" +
                "• Soft and supportive seat\n" +
                "• High-tech flexible saddle tree\n" +
                "• Specialized for Icelandic Horse\n" +
                "• Special shoulder freedom\n" +
                "• Made in top quality european leather\n" +
                "• 2 long girth straps with a Y-system\n" +
                "• Two sets of knee rolls are included");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "Real leather saddle for beginners at an affordable price.\n" +
                "A comfortable, genuine leather saddle at an affordable price! Available in two colors, the saddle has a plastic tree and is padded with wool. This is a reliable medium-standard saddle that is suitable for all riders. N=31cm, W=32cm, XW=33cm.\n" +
                "Features:\n" +
                "• All purpose leather saddle\n" +
                "• Simple knee rolls\n" +
                "• Plenty of support\n" + "Technical description:\n" +
                "• Genuine Leather.\n" +
                "\n" +
                "Washing instructions:\n" +
                "• Wipe clean with warm water to remove dirt and sweat, then wipe with leather cleaner.");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Choose this bareback saddle for a natural riding experience with a more cushioned ride.\n" +
                "Don't miss out on this superb package which includes stirrups, leathers and girth. The suede finish shell gives you added grip, and the faux fur padding looks exclusive and prevents chafing. This bareback saddle will give you the wonderful experience of a more casual, comfortable riding manor and enable you to establish a closer bond with your horse.\n" +
                "Features:\n" +
                "• Limited edition\n" +
                "• Softly padded\n" +
                "• Faux fur lining\n" +
                "• Stylish look\n" +
                "• Suede shell for ultra grip\n" +
                "• Handle grip at front\n" +
                "• Comes as a set - includes stirrups, leathers and girth");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "The Trail Blazer saddle is not just for the trail. Its sleek design and high quality construction make it the ultimate utility saddle.\n Great for everyday exercising, colt-starting, reining and western pleasure disciplines.\n Built on an AXIS tree, which is designed to allow your horse to move and perform as nature intended. Bars are designed to provide full and even contact to the horse’s back while the tips flare up and away from the horse’s shoulder, eliminating any interference of natural movement.");

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

    private Saddle getSaddleFromDatabase(String saddleName) {
        if ("Leather Saddle".equals(saddleName)) {
            return new Saddle(2, saddleName, 432.0f);
        } else if ("Icelandic Saddle".equals(saddleName)) {
            return new Saddle(1, saddleName, 124.0f);
        } else if ("All Purpose Saddle".equals(saddleName)){
            return new Saddle(3, saddleName, 241.99f);
        } else if ("Bareback Saddle".equals(saddleName)){
            return new Saddle(4, saddleName, 55.99f);
        } else if ("Western Saddle".equals(saddleName)){
            return new Saddle(5, saddleName, 2599.99f);
        } else {
            return null;
        }
    }
    private void addSaddleToOrder(String saddleName) {
        Saddle saddle = getSaddleFromDatabase(saddleName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(saddle);
        JOptionPane.showMessageDialog(frame, saddleName + " added to order.");
        System.out.println(orderManagement.getCurrentOrderDetails());

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
