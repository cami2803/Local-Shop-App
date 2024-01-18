package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Vests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VestsFrame {
    private JFrame frame;
    private OrderManagement orderManagement;

    public VestsFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Vests, Back Protectors");
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

        JLabel imageLabelHorse = new JLabel("");
        imageLabelHorse.setBounds(348, 279, 200, 219);
        frame.getContentPane().add(imageLabelHorse);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/vesta1.jpg"));
        imageLabelHorse.setIcon(img1);

        JLabel vesta1 = new JLabel("");
        vesta1.setBounds(41, 279, 200, 219);
        frame.getContentPane().add(vesta1);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/vesta2.jpg"));
        vesta1.setIcon(img2);

        JLabel vesta3 = new JLabel("");
        vesta3.setBounds(650, 271, 203, 242);
        frame.getContentPane().add(vesta3);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/vesta3.jpg"));
        vesta3.setIcon(img3);

        JLabel vesta4 = new JLabel("");
        vesta4.setBounds(932, 263, 200, 235);
        frame.getContentPane().add(vesta4);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/vesta4.jpg"));
        vesta4.setIcon(img4);

        JLabel vesta5 = new JLabel("");
        vesta5.setBounds(1234, 263, 203, 250);
        frame.getContentPane().add(vesta5);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/vesta5.jpg"));
        vesta5.setIcon(img5);

        JLabel vesta1Label = new JLabel("Komperdell Vest 45$");
        vesta1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        vesta1Label.setForeground(new Color(254, 250, 224));
        vesta1Label.setBounds(41, 508, 213, 27);
        frame.getContentPane().add(vesta1Label);

        JLabel vesta2Label = new JLabel("Zandona Armour 51$");
        vesta2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        vesta2Label.setForeground(new Color(254, 250, 224));
        vesta2Label.setBounds(348, 509, 200, 27);
        frame.getContentPane().add(vesta2Label);

        JLabel vesta3Label = new JLabel("Covalliero Protector 111.99$");
        vesta3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        vesta3Label.setForeground(new Color(254, 250, 224));
        vesta3Label.setBounds(621, 514, 250, 27);
        frame.getContentPane().add(vesta3Label);

        JLabel vesta4Label = new JLabel("Komperbel Vest Junior 89.99$");
        vesta4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        vesta4Label.setForeground(new Color(254, 250, 224));
        vesta4Label.setBounds(932, 509, 250, 27);
        frame.getContentPane().add(vesta4Label);

        JLabel vesta5Label = new JLabel("Reflective Riding Vest 5.99$");
        vesta5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        vesta5Label.setForeground(new Color(254, 250, 224));
        vesta5Label.setBounds(1205, 514, 250, 27);
        frame.getContentPane().add(vesta5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 545, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addVestToOrder("Komperdell Vest"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 545, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addVestToOrder("Zandona Armour"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(623, 552, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addVestToOrder("Covalliero Protector"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(932, 545, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addVestToOrder("Komperbel Vest Junior"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1207, 552, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addVestToOrder("Reflective Riding Vest"));
        frame.getContentPane().add(addToOrder5Button);

        JToggleButton showDescriptionToggle1 = new JToggleButton("Show Description");
        showDescriptionToggle1.setBounds(42, 595, 152, 21);
        showDescriptionToggle1.setBackground(new Color(221, 161, 94));
        showDescriptionToggle1.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle1);

        JToggleButton showDescriptionToggle2 = new JToggleButton("Show Description");
        showDescriptionToggle2.setBounds(349, 595, 152, 21);
        showDescriptionToggle2.setBackground(new Color(221, 161, 94));
        showDescriptionToggle2.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle2);

        JToggleButton showDescriptionToggle3 = new JToggleButton("Show Description");
        showDescriptionToggle3.setBounds(654, 595, 152, 21);
        showDescriptionToggle3.setBackground(new Color(221, 161, 94));
        showDescriptionToggle3.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle3);

        JToggleButton showDescriptionToggle4 = new JToggleButton("Show Description");
        showDescriptionToggle4.setBounds(933, 595, 152, 21);
        showDescriptionToggle4.setBackground(new Color(221, 161, 94));
        showDescriptionToggle4.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle4);

        JToggleButton showDescriptionToggle5 = new JToggleButton("Show Description");
        showDescriptionToggle5.setBounds(1238, 595, 152, 21);
        showDescriptionToggle5.setBackground(new Color(221, 161, 94));
        showDescriptionToggle5.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle5);

        JTextArea descriptionTextArea1 = new JTextArea();
        descriptionTextArea1.setLineWrap(true);
        descriptionTextArea1.setWrapStyleWord(true);
        descriptionTextArea1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea1.setEditable(false);
        descriptionTextArea1.setBackground(new Color(96, 108, 56));
        descriptionTextArea1.setForeground(new Color(254, 250, 224));
        descriptionTextArea1.setBounds(41, 642, 200, 182);
        descriptionTextArea1.setOpaque(false);
        frame.getContentPane().add(descriptionTextArea1);

        JTextArea descriptionTextArea2 = new JTextArea();
        descriptionTextArea2.setWrapStyleWord(true);
        descriptionTextArea2.setOpaque(false);
        descriptionTextArea2.setLineWrap(true);
        descriptionTextArea2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea2.setEditable(false);
        descriptionTextArea2.setBackground(new Color(96, 108, 56));
        descriptionTextArea2.setForeground(new Color(254, 250, 224));
        descriptionTextArea2.setBounds(348, 642, 200, 182);
        frame.getContentPane().add(descriptionTextArea2);

        JTextArea descriptionTextArea3 = new JTextArea();
        descriptionTextArea3.setWrapStyleWord(true);
        descriptionTextArea3.setOpaque(false);
        descriptionTextArea3.setLineWrap(true);
        descriptionTextArea3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea3.setEditable(false);
        descriptionTextArea3.setBackground(new Color(96, 108, 56));
        descriptionTextArea3.setForeground(new Color(254, 250, 224));
        descriptionTextArea3.setBounds(653, 642, 200, 182);
        frame.getContentPane().add(descriptionTextArea3);

        JTextArea descriptionTextArea4 = new JTextArea();
        descriptionTextArea4.setWrapStyleWord(true);
        descriptionTextArea4.setOpaque(false);
        descriptionTextArea4.setLineWrap(true);
        descriptionTextArea4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea4.setEditable(false);
        descriptionTextArea4.setBackground(new Color(96, 108, 56));
        descriptionTextArea4.setForeground(new Color(254, 250, 224));
        descriptionTextArea4.setBounds(932, 642, 200, 182);
        frame.getContentPane().add(descriptionTextArea4);

        JTextArea descriptionTextArea5 = new JTextArea();
        descriptionTextArea5.setWrapStyleWord(true);
        descriptionTextArea5.setOpaque(false);
        descriptionTextArea5.setLineWrap(true);
        descriptionTextArea5.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        descriptionTextArea5.setEditable(false);
        descriptionTextArea5.setBackground(new Color(96, 108, 56));
        descriptionTextArea5.setForeground(new Color(254, 250, 224));
        descriptionTextArea5.setBounds(1237, 642, 200, 182);
        frame.getContentPane().add(descriptionTextArea5);

        JScrollPane descriptionScrollPane1 = new JScrollPane(descriptionTextArea1);
        descriptionScrollPane1.setBounds(41, 642, 200, 182);
        descriptionScrollPane1.setOpaque(false);
        descriptionScrollPane1.getViewport().setOpaque(false);
        descriptionScrollPane1.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane1);

        JScrollPane descriptionScrollPane2 = new JScrollPane(descriptionTextArea2);
        descriptionScrollPane2.setBounds(348, 642, 200, 182);
        descriptionScrollPane2.setOpaque(false);
        descriptionScrollPane2.getViewport().setOpaque(false);
        descriptionScrollPane2.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane2);

        JScrollPane descriptionScrollPane3 = new JScrollPane(descriptionTextArea3);
        descriptionScrollPane3.setBounds(653, 642, 200, 182);
        descriptionScrollPane3.setOpaque(false);
        descriptionScrollPane3.getViewport().setOpaque(false);
        descriptionScrollPane3.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane3);

        JScrollPane descriptionScrollPane4 = new JScrollPane(descriptionTextArea4);
        descriptionScrollPane4.setBounds(932, 642, 200, 182);
        descriptionScrollPane4.setOpaque(false);
        descriptionScrollPane4.getViewport().setOpaque(false);
        descriptionScrollPane4.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane4);

        JScrollPane descriptionScrollPane5 = new JScrollPane(descriptionTextArea5);
        descriptionScrollPane5.setBounds(1237, 642, 200, 182);
        descriptionScrollPane5.setOpaque(false);
        descriptionScrollPane5.getViewport().setOpaque(false);
        descriptionScrollPane5.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane5);


        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "Multilayer Cross 6.0 back protector, made of adaptive dual-density foam\n" +
        "• Back protector with side protection area - with generous preforation for maximum breathability\n" +
                "• Extremely lightweight & breathable protector\n" +
                "• Best safety values\n" +
                "• With front zipper - easier to put on and take off\n" +
                "• Unlimited freedom of movement\n" +
                "• Improved ergonomics\n" +
                "• Design made in Austria");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "Maximum wearing comfort and ultimate freedom of movement\n" +
                "Back protector\n" +
                "• Ballistic\n" +
                "• Slim design\n" +
                "• Safest back protection\n" +
                "• Level 2\n" +
                "• Width adjustment\n" +
                "• Lateral protection zone\n" +
                "• Particularly light & flexible\n" +
                "• Best protection values\n" +
                "• Front zip for easy on and off");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "The panel-like protective cushions guarantee maximum protection upon impact on the one hand, and a perfect fit on the other.\n" +
                "• The special arrangement of the protective cushions ensures complete freedom of movement with the highest safety standards\n" +
                "• The newly developed features for easy adjustment not only enhance safety but also increase the vest's visual appeal\n" +
                "• The cut, material and functionality ensure the highest standards amongst the protective vests available on the market\n" +
                "• Zip for easy on & off\n" +
                "• Honeycomb design for optimal freedom of movement\n" +
                "• Double safety hook and loop fastener for individual adjustment");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Features:\n" +
                "• Back protector with side protection area - with generous preforation for maximum breathability\n" +
                "• Extremely lightweight & breathable protector\n" +
                "• Best safety values\n" +
                "• With front zipper - easier to put on and take off\n" +
                "• Unlimited freedom of movement\n" +
                "• Improved ergonomics\n" +
                "• Design made in Austria");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "Be careful and visible while riding after dark with this bright neon yellow vest.\n" +
                "The Horze Supreme reflective list ensures visibility on evening rides and in gloomy weather.\n" +
                "Features:\n" +
                "• Reflective material\n" +
                "• Easy to use\n" +
                "• Zip at front\n" +
                "• 100% Polyester");

        JButton btnFinishOrder = new JButton("Finish Order");
        btnFinishOrder.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnFinishOrder.setBackground(new Color(221, 161, 94));
        btnFinishOrder.setForeground(new Color(40, 54, 24));
        btnFinishOrder.setBounds(1327, 28, 159, 48);
        frame.getContentPane().add(btnFinishOrder);

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

    private Vests getVestFromDatabase(String vestName) {
        if ("Komperdell Vest".equals(vestName)) {
            return new Vests(1, vestName, 61.2f);
        } else if ("Zandona Armour".equals(vestName)) {
            return new Vests(2, vestName, 56.8f);
        } else if ("Covalliero Protector".equals(vestName)) {
            return new Vests(3, vestName, 111.99f);
        } else if ("Komperbel Vest Junior".equals(vestName)) {
            return new Vests(4, vestName, 89.99f);
        } else if ("Reflective Riding Vest".equals(vestName)) {
            return new Vests(5, vestName, 5.99f);
        } else {
            return null;
        }
    }

    private void addVestToOrder(String vestName) {
        Vests vest = getVestFromDatabase(vestName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(vest);
        JOptionPane.showMessageDialog(frame, vestName + " added to order.");
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