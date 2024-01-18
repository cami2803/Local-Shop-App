package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.RidingPants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RidingPantsFrame {

    private JFrame frame;
    private OrderManagement orderManagement;

    public RidingPantsFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Riding Pants");
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

        JLabel pants1 = new JLabel("");
        pants1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(pants1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/pantaloni.jpg"));
        pants1.setIcon(img1);

        JLabel pants2 = new JLabel("");
        pants2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(pants2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/pantaloni2.jpg"));
        pants2.setIcon(img2);

        JLabel pants3 = new JLabel("");
        pants3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/pantaloni3.jpg"));
        frame.getContentPane().add(pants3);
        pants3.setIcon(img3);

        JLabel pants4 = new JLabel("");
        pants4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/pantaloni4.jpg"));
        frame.getContentPane().add(pants4);
        pants4.setIcon(img4);

        JLabel pants5 = new JLabel("");
        pants5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/pantaloni5.jpg"));
        frame.getContentPane().add(pants5);
        pants5.setIcon(img5);

        JLabel pants1Label = new JLabel("High Waist Breeches 49.99$");
        pants1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pants1Label.setForeground(new Color(254, 250, 224));
        pants1Label.setBounds(41, 487, 240, 27);
        frame.getContentPane().add(pants1Label);

        JLabel pants2Label = new JLabel("Grand Prix Breeches 49.99$");
        pants2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pants2Label.setForeground(new Color(254, 250, 224));
        pants2Label.setBounds(337, 487, 230, 27);
        frame.getContentPane().add(pants2Label);

        JLabel pants3Label = new JLabel("Covalliero Breeches  44.99$");
        pants3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pants3Label.setForeground(new Color(254, 250, 224));
        pants3Label.setBounds(632, 492, 240, 27);
        frame.getContentPane().add(pants3Label);

        JLabel pants4Label = new JLabel("Knee Grip Tights 29.99$");
        pants4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pants4Label.setForeground(new Color(254, 250, 224));
        pants4Label.setBounds(939, 492, 240, 27);
        frame.getContentPane().add(pants4Label);

        JLabel pants5Label = new JLabel("Thermo Silicone Breeches 109.99$");
        pants5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pants5Label.setForeground(new Color(254, 250, 224));
        pants5Label.setBounds(1241, 487, 290, 27);
        frame.getContentPane().add(pants5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addRidingPantsToOrder("High Waist Breeches"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addRidingPantsToOrder("Grand Prix Breeches"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addRidingPantsToOrder("Covalliero Breeches"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addRidingPantsToOrder("Knee Grip Tights"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addRidingPantsToOrder("Thermo Silicone Breeches"));
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

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "Everyday fullgrip breeches with high waist and comfortably wide waistband.\n" +
                "\n" +
                "The full grip breeches are perfect for everyday rides. Thanks to the silicon grip no seams in the knee area are necessary. The generous waistband closes with two Gutos buttons and features wide belt loops so you can combine the breeches with a belt of your choice. Fake back pockets and the shaped back seam create flattering figure.\n" +
                "\n" +
                "Features:\n" +
                "• High waist\n" +
                "• Silicon full grip\n" +
                "• Phone pocktes on both thighs\n" +
                "• Wide waistband shaped at back\n" +
                "• Belt loops");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "Choose these updated breeches for ultimate comfort with a trendy check pattern on the full seat.\n" +
                "\n" +
                "These full seat breeches have a number of technical features, including a silicone pattern printed directly on the full seat without a separate leather seat. A lovely checked design is added for a touch of style. The classic Desiree is now offered without belt loops for a clean, sleek appearance. The high waist and breathable bi-stretch fabric make them a pure comfort to wear. These high-quality breeches will retain their shape while repelling dirt and moisture.\n" +
                "\n" +
                "Features:\n" +
                "• Trendy women's breeches in a special silicone checked pattern full seat which allows a good grip in the saddle\n" +
                "• Fabric is UV protected (UPF 50+)\n" +
                "• New smoother high waist\n" +
                "• Now with longer side pockets perfect for a mobile phone\n" +
                "• No belt loops\n" +
                "• Functional, breathable bi-stretch fabric\n" +
                "• Retains shape\n" +
                "• Water and dirt repellent\n" +
                "• Elastic leg bottoms\n" +
                "• Inseam is 72 cm");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "Features:\n" +
                "• Classic, all-year-round riding breeches made from ultra-elastic microfibre\n" +
                "• Practical mobile phone pocket\n" +
                "• Regular rise waistband for superb wearing comfort\n" +
                "Technical description:\n" +
                "• Polyester 90 %, Elastane 10 %.");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Plain ridign tights with eye-catching piping along the front pocktes.\n" +
                "\n" +
                "Large pockets on the front of each thigh keep your phone from getting in the way while riding. The pockets feature a colourful piping and are a real eye-catcher on the otherwise plain tights. The elastic material and the wide waistband make them super comfortable to wear. Thanks to the belt loops you can also add a belt for increased style. A small logo charm is situated beneath the front waistband.\n" +
                "\n" +
                "Features:\n" +
                "• High waist\n" +
                "• Silicone knee grip\n" +
                "• Large thigh pockets with contrasting piping\n" +
                "• Bold colours\n" +
                "• Belt loops\n");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "Warm winter breeches will be your best friend for cold weather riding. These high waist breeches have a nice stretch, a hidden zipper pocket on each thigh with space for a phone. The B Vertigo Thermo Silicone Full Seat Breeches have a special shaped back seat seam for a comfortable fit.\n" +
                "\n" +
                "Features:\n" +
                "• High waist\n" +
                "• Shaped front seams\n" +
                "• Warm, insulating fabric\n" +
                "• Fabric is UV protected (UPF 50+)\n" +
                "• Pocket fits mobile phones\n" +
                "• Fabric is water resistant; no taped seams\n" +
                "• Silicone print at full seat for grip\n" +
                "• Hidden zipper pockets at thighs\n");

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

    private RidingPants getRidingPantsFromDatabase(String pantsName) {
        if ("High Waist Breeches".equals(pantsName)) {
            return new RidingPants(1, pantsName, 49.99f);
        } else if ("Grand Prix Breeches".equals(pantsName)) {
            return new RidingPants(2, pantsName, 49.99f);
        } else if ("Covalliero Breeches".equals(pantsName)) {
            return new RidingPants(2, pantsName, 44.99f);
        } else if ("Knee Grip Tights".equals(pantsName)) {
            return new RidingPants(2, pantsName, 29.99f);
        } else if ("Thermo Silicone Breeches".equals(pantsName)) {
            return new RidingPants(2, pantsName, 109.99f);
        } else {
        return null;
        }
    }

    private void addRidingPantsToOrder(String pantsName) {
        RidingPants pants = getRidingPantsFromDatabase(pantsName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(pants);
        JOptionPane.showMessageDialog(frame, pantsName + " added to order.");
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
