package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.RidingFootwear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RidingFootwearFrame {
    private JFrame frame;
    public RidingFootwearFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Riding Footwear");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(627, 25, 602, 141);
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

        JLabel footwear1 = new JLabel("");
        footwear1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(footwear1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/papuci.jpg"));
        footwear1.setIcon(img1);

        JLabel footwear2 = new JLabel("");
        footwear2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(footwear2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/papuci2.jpg"));
        footwear2.setIcon(img2);

        JLabel footwear3 = new JLabel("");
        footwear3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/papuci3.jpg"));
        frame.getContentPane().add(footwear3);
        footwear3.setIcon(img3);

        JLabel footwear4 = new JLabel("");
        footwear4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/papuci4.jpg"));
        frame.getContentPane().add(footwear4);
        footwear4.setIcon(img4);

        JLabel footwear5 = new JLabel("");
        footwear5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/papuci5.jpg"));
        frame.getContentPane().add(footwear5);
        footwear5.setIcon(img5);

        JLabel footwear1Label = new JLabel("Aspen Tall Boots 129.99$");
        footwear1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        footwear1Label.setForeground(new Color(254, 250, 224));
        footwear1Label.setBounds(41, 487, 240, 27);
        frame.getContentPane().add(footwear1Label);

        JLabel footwear2Label = new JLabel("Nova Tall Boots 119.99$");
        footwear2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        footwear2Label.setForeground(new Color(254, 250, 224));
        footwear2Label.setBounds(337, 487, 230, 27);
        frame.getContentPane().add(footwear2Label);

        JLabel footwear3Label = new JLabel("Merino Tall Boots  314.99$");
        footwear3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        footwear3Label.setForeground(new Color(254, 250, 224));
        footwear3Label.setBounds(632, 492, 240, 27);
        frame.getContentPane().add(footwear3Label);

        JLabel footwear4Label = new JLabel("Muck Boots 129.99$");
        footwear4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        footwear4Label.setForeground(new Color(254, 250, 224));
        footwear4Label.setBounds(939, 492, 240, 27);
        frame.getContentPane().add(footwear4Label);

        JLabel footwear5Label = new JLabel("Side Buckle Boots 79.99$");
        footwear5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        footwear5Label.setForeground(new Color(254, 250, 224));
        footwear5Label.setBounds(1241, 487, 290, 27);
        frame.getContentPane().add(footwear5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addFootwearToOrder("Aspen Tall Boots"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addFootwearToOrder("Nova Tall Boots"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addFootwearToOrder("Merino Tall Boots"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addFootwearToOrder("Muck Boots"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addFootwearToOrder("Side Buckle Boots"));
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

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "Stay warm and dry in these superb winter tall boots!\n" +
                "\n" +
                "A cosy faux fur lining will keep your feet and lower legs warm and cosy when out and about this winter. The stout sole is non-slip so you can walk in frosty, icy or snowy conditions with more safety. The punch details up and down the boot adds a nice touch of character to the gentle sheen of the boot.\n" +
                "\n" +
                "Features:\n" +
                "• Warm and cosy\n" +
                "• Added oil finish for extra water repellency\n" +
                "• Water resistant\n" +
                "• Perfect for winter weather\n" +
                "• Attractive tall boots\n" +
                "• Punch out design on leg and foot\n" +
                "• Full length YKK zip? in curved design\n" +
                "• Snug faux fur lining\n" +
                "• Chunky super grip sole\n" +
                "• Calf width: regular");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "Suedwind Basics are basic, but therefore the best basics on the market. The quality and the focus on detail make the difference! They provide you with comfort and flexibility in the stirrup, to have fun from the beginning on. If you are looking for an affordable, durable riding boot, that you can use every day - Suedwind Basics are the right choice!\n" +
                "\n" +
                "Features:\n" +
                "• Vegan Leatherette\n" +
                "• Breathable Mesh Lining\n" +
                "• High Top Line\n" +
                "• Ergonomically designed\n" +
                "• Strong and durable YKK® zipper in the back\n" +
                "• Elastic along the back of the shaft for a better individual fit\n" +
                "• NOVA Sole Technology for Comfort and maximum Grip\n" +
                "• Midsole with Shank");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "The LEGACY series provides the ideal combination of classic look, comfort and quality. The rubber outsole, midsole with integrated thermoplastic shank and the EVA heel cushioning foam provide the ultimate foothold, durability and flexibility, while delivering a broken-in feel from the beginning on. World-class performance in a classic look and relaxed comfort. Fit and strong foothold are what make a great pair of boots great - our shock absorbent rubber compound and real MERINO Wool provide just that while keeping your feet as comfortable as a pair of sneakers. Enjoy all-day comfort without sacrificing a classic look, durability or sure foothold.\n" +
                "\n" +
                "Features:\n" +
                "• Ultima RS® Sole Technology for Comfort and Stability\n" +
                "• European Full-Grain Leather Upper\n" +
                "• MERINO Wool Lining along Shaft and Foot\n" +
                "• High Spanish Topline\n" +
                "• Classic Square Toe\n" +
                "• Front Laces\n" +
                "• Midsole with Thermoplastic Shank\n" +
                "• EVA Heel Cushioning");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Designed for some of the coldest conditions, the Arctic Sport II works great in nearly every environment. These fun, sporty colours make them perfect for trekking in the back woods but also for enjoying the great outdoors.\n" +
                "\n" +
                "Features:\n" +
                "• 100% Waterproof\n" +
                "• 5mm Neoprene Bootie\n" +
                "• Warm Fleece Lining\n" +
                "• Extended Rubber Exterior\n" +
                "• Comfort Insole\n" +
                "• Dual Density EVA Footbed\n" +
                "• Warm Fleece Lining");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "Eye-catching polo boots with laces and front buckle.\n" +
                "\n" +
                "Fancy some really fancy boots? Well, here they are! These two-tone boots are inspired by the classic polo boot look with the front buckle closure. In addition they feature decorative laces. At the back an elastic insert makes sure that the boot adapts perfectly to your calf and creates a snug fit. The breathable mesh lining on the inside adds to the wearing comfort.\n" +
                "\n" +
                "Features:\n" +
                "• Synthetic leather\n" +
                "• Two-tone\n" +
                "• Decorative laces\n" +
                "• Elastic insert\n" +
                "• No spur rest\n" +
                "• Full-length back zip");

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

    private RidingFootwear getFootwearFromDatabase(String footwearName) {
        if ("Aspen Tall Boots".equals(footwearName)) {
            return new RidingFootwear(1, footwearName, 129.99f);
        } else if ("Nova Tall Boots".equals(footwearName)) {
            return new RidingFootwear(2, footwearName, 119.99f);
        }  else if ("Merino Tall Boots".equals(footwearName)) {
            return new RidingFootwear(2, footwearName, 314.99f);
        }  else if ("Muck Boots".equals(footwearName)) {
            return new RidingFootwear(2, footwearName, 129.99f);
        }  else if ("Side Buckle Boots".equals(footwearName)) {
            return new RidingFootwear(2, footwearName, 79.99f);
        } else {
            return null;
        }
    }

    private void addFootwearToOrder(String footwearName) {
        RidingFootwear footwear = getFootwearFromDatabase(footwearName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(footwear);
        JOptionPane.showMessageDialog(frame, footwearName + " added to order.");
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
