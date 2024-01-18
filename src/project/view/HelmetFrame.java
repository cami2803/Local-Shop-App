package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Helmet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelmetFrame {
    private JFrame frame;
    private OrderManagement orderManagement;

    public HelmetFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Helmets");
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

        JLabel helmet1 = new JLabel("");
        helmet1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(helmet1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/helmet1.jpg"));
        helmet1.setIcon(img1);

        JLabel helmet2 = new JLabel("");
        helmet2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(helmet2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/helmet2.jpg"));
        helmet2.setIcon(img2);

        JLabel helmet3 = new JLabel("");
        helmet3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/helmet3.jpg"));
        frame.getContentPane().add(helmet3);
        helmet3.setIcon(img3);

        JLabel helmet4 = new JLabel("");
        helmet4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/helmet4.jpg"));
        frame.getContentPane().add(helmet4);
        helmet4.setIcon(img4);

        JLabel helmet5 = new JLabel("");
        helmet5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/helmet5.jpg"));
        frame.getContentPane().add(helmet5);
        helmet5.setIcon(img5);

        JLabel helmet1Label = new JLabel("Harry's Helmet  104.95$");
        helmet1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        helmet1Label.setForeground(new Color(254, 250, 224));
        helmet1Label.setBounds(41, 487, 240, 27);
        frame.getContentPane().add(helmet1Label);

        JLabel helmet2Label = new JLabel("Orbital Helmet  69.99$");
        helmet2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        helmet2Label.setForeground(new Color(254, 250, 224));
        helmet2Label.setBounds(337, 487, 230, 27);
        frame.getContentPane().add(helmet2Label);

        JLabel helmet3Label = new JLabel("Mont Blanc Helmet  159.95$");
        helmet3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        helmet3Label.setForeground(new Color(254, 250, 224));
        helmet3Label.setBounds(632, 492, 240, 27);
        frame.getContentPane().add(helmet3Label);

        JLabel helmet4Label = new JLabel("Defenze Helmet  39.99$");
        helmet4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        helmet4Label.setForeground(new Color(254, 250, 224));
        helmet4Label.setBounds(939, 492, 240, 27);
        frame.getContentPane().add(helmet4Label);

        JLabel helmet5Label = new JLabel("OneK Helmet  359.99$");
        helmet5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        helmet5Label.setForeground(new Color(254, 250, 224));
        helmet5Label.setBounds(1241, 487, 290, 27);
        frame.getContentPane().add(helmet5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addRidingGlovesToOrder("Harry's Helmet"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addRidingGlovesToOrder("Orbital Helmet"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addRidingGlovesToOrder("Mont Blanc Helmet"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addRidingGlovesToOrder("Defenze Helmet"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addRidingGlovesToOrder("OneK Helmet"));
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

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "This helmet provides the highest safety and looks elegant due to its matte finish.\n" +
                "\n" +
                "Very lightweight and comfortable safety helmet with removable and washable Coolmax® liner. Provided with leather lid and harness and several vents for optimal ventilation. Easy-to-fit dial system. This helmet is not BSI Kitemarked.\n" +
                "\n" +
                "Features:\n" +
                "• Light and comfortable\n" +
                "• Removable lining\n" +
                "• Shield and straps\n" +
                "• Air Slots\n" +
                "• Adjustment wheel");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "The Horze Orbital helmet brings ventilation to the next level!\n" +
                "\n" +
                "This sporty riding helmet can withstand high impact, and ventilation slots offer comfort with plenty of air flow to keep your head cool. The visor provides ideal protection. The dial system allows you to adjust it for a perfect fit. Memory foam lining cradles your head in comfort while offering protection in the event of a fall. A flexible peak brim adds more safety.\n" +
                "\n" +
                "Features:\n" +
                "• Super high impact strength\n" +
                "• Lightweight\n" +
                "• Optimal ventilation with foam padding\n" +
                "• Removable, washable liner\n" +
                "• Adjustable for a custom fit");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "With removable, washable liner. Easy to adjust by means of a rotary knob. Also equipped with several ventilation slots. The outer shell has a matte finish, the inner track is finished with glittering glitter. This model has a wide brim for protection against the sun and rain.");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "A bright blue arrow on this helmet adds a sporty touch.\n" +
                "\n" +
                "A sporty style highlights this well-constructed protective helmet to provide confidence and safety during your ride. The adjustable helmet includes a 3-point fitting system and disc control for ultimate fit. The high tech ventilation provides optimal cooling and comfort on even the hottest days. This low-profile riding helmet has a premium look for high fashion as well as complete functionality. This helmet is not approved for BHS, BRC, British Eventing or The Pony Club.\n" +
                "\n" +
                "Features:\n" +
                "• Tested and approved according to EU regulation standards\n" +
                "• Strong shell\n" +
                "• Sporty style\n" +
                "• Well-ventilated design");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "The OneK Riding Helmet feature State of the Art design as well as maximum safety and comfort!\n" +
                "\n" +
                "Safety first! The OneK helmets are composed of a Polycarbonate and advance ABS composite injection molded outer shell combined with an EPS liner. The EPS liner is the main part for impact absorption in a helmet. OneK uses only EPS of a high quality with a density making the helmet perfect for impact absorption. VG01 approved. Comfort The OneK helmet provides you with a very high level of ventilation featuring two front ventilations, two side, one back and two center stripe ventilations. The helmet has comfort padded harness with synthetic suede lining, hook and loop adjustment and a fast-tex buckle. The OneK helmets are available in 3 shell sizes. By using the OneK liner which is available from XS to XL you can achieve the perfect fit. The OneK liner is made of a washable quick-dry fabric; it is moisture wicking and anti-microbial. Attention! Liner is sold separately and is not included with the helmet. Design OneK Helmets boast the perfect synergy between advanced technology and aesthetically pleasing design. With enough features to appeal to those seeking everything a helmet could possibly offer, wrapped in a package that traditionalists can appreciate, One K has the best of both worlds.");

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

    private Helmet getHelmetFromDatabase(String helmetName) {
        if ("Harry's Helmet".equals(helmetName)) {
            return new Helmet(1, helmetName, 104.95f);
        } else if ("Orbital Helmet".equals(helmetName)) {
            return new Helmet(2, helmetName, 69.99f);
        } else if ("Mont Blanc Helmet".equals(helmetName)) {
            return new Helmet(2, helmetName, 159.99f);
        } else if ("Defenze Helmet".equals(helmetName)) {
            return new Helmet(2, helmetName, 39.99f);
        } else if ("OneK Helmet".equals(helmetName)) {
            return new Helmet(2, helmetName, 359.99f);
        } else {
        return null;
        }
    }

    private void addRidingGlovesToOrder(String helmetName) {
        Helmet helmet = getHelmetFromDatabase(helmetName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(helmet);
        JOptionPane.showMessageDialog(frame, helmetName + " added to order.");
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
