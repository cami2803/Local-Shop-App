package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Bridle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BridleFrame {
    private JFrame frame;
    private OrderManagement orderManagement;

    public BridleFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Bridles and Reins");
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

        JLabel bridle1 = new JLabel("");
        bridle1.setBounds(45, 230, 200, 219);
        frame.getContentPane().add(bridle1);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/ham.jpg"));
        bridle1.setIcon(img2);

        JLabel bridle2 = new JLabel("");
        bridle2.setBounds(352, 230, 200, 219);
        frame.getContentPane().add(bridle2);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/ham1.jpg"));
        bridle2.setIcon(img1);

        JLabel bridle3 = new JLabel("");
        bridle3.setBounds(621, 230, 200, 219);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/ham2.jpg"));
        bridle3.setIcon(img3);
        frame.getContentPane().add(bridle3);

        JLabel bridle4 = new JLabel("");
        bridle4.setBounds(928, 230, 200, 219);
        frame.getContentPane().add(bridle4);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/ham3.jpg"));
        bridle4.setIcon(img4);

        JLabel bridle5 = new JLabel("");
        bridle5.setBounds(1231, 230, 200, 219);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/ham4.jpg"));
        bridle5.setIcon(img5);
        frame.getContentPane().add(bridle5);

        JLabel bridle1Label = new JLabel("Buxton Bridle 60$");
        bridle1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        bridle1Label.setForeground(new Color(254, 250, 224));
        bridle1Label.setBounds(45, 460, 235, 27);
        frame.getContentPane().add(bridle1Label);

        JLabel bridle2Label = new JLabel("Arika Bridle 55$");
        bridle2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        bridle2Label.setForeground(new Color(254, 250, 224));
        bridle2Label.setBounds(352, 460, 200, 27);
        frame.getContentPane().add(bridle2Label);

        JLabel bridle3Label = new JLabel("Swedish Bridle 299.99$");
        bridle3Label.setForeground(new Color(254, 250, 224));
        bridle3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        bridle3Label.setBounds(621, 460, 235, 27);
        frame.getContentPane().add(bridle3Label);

        JLabel bridle4Label = new JLabel("Rambo Bridle 119.99$");
        bridle4Label.setForeground(new Color(254, 250, 224));
        bridle4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        bridle4Label.setBounds(928, 460, 210, 27);
        frame.getContentPane().add(bridle4Label);

        JLabel bridle5Label = new JLabel("Imperial Bridle  199.99");
        bridle5Label.setForeground(new Color(254, 250, 224));
        bridle5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        bridle5Label.setBounds(1231, 460, 220, 27);
        frame.getContentPane().add(bridle5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(45, 496, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addBridleToOrder("Buxton Bridle"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(352, 496, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addBridleToOrder("Arika Bridle"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setBounds(621, 496, 61, 21);
        addToOrder3Button.addActionListener(e -> addBridleToOrder("Swedish Bridle"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setBounds(928, 496, 61, 21);
        addToOrder4Button.addActionListener(e -> addBridleToOrder("Rambo Bridle"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setBounds(1231, 496, 61, 21);
        addToOrder5Button.addActionListener(e -> addBridleToOrder("Imperial Bridle"));
        frame.getContentPane().add(addToOrder5Button);

        JButton btnFinishOrder = new JButton("Finish Order");
        btnFinishOrder.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnFinishOrder.setBounds(1327, 28, 159, 48);
        btnFinishOrder.setBackground(new Color(221, 161, 94));
        btnFinishOrder.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(btnFinishOrder);

        JToggleButton showDescriptionToggle1 = new JToggleButton("Show Description");
        showDescriptionToggle1.setBounds(46, 561, 152, 21);
        showDescriptionToggle1.setBackground(new Color(221, 161, 94));
        showDescriptionToggle1.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle1);

        JToggleButton showDescriptionToggle2 = new JToggleButton("Show Description");
        showDescriptionToggle2.setBounds(353, 561, 152, 21);
        showDescriptionToggle2.setBackground(new Color(221, 161, 94));
        showDescriptionToggle2.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle2);

        JToggleButton showDescriptionToggle3 = new JToggleButton("Show Description");
        showDescriptionToggle3.setBounds(635, 561, 152, 21);
        showDescriptionToggle3.setBackground(new Color(221, 161, 94));
        showDescriptionToggle3.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle3);

        JToggleButton showDescriptionToggle4 = new JToggleButton("Show Description");
        showDescriptionToggle4.setBounds(937, 561, 152, 21);
        showDescriptionToggle4.setBackground(new Color(221, 161, 94));
        showDescriptionToggle4.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle4);

        JToggleButton showDescriptionToggle5 = new JToggleButton("Show Description");
        showDescriptionToggle5.setBounds(1242, 561, 152, 21);
        showDescriptionToggle5.setBackground(new Color(221, 161, 94));
        showDescriptionToggle5.setForeground(new Color(40, 54, 24));
        frame.getContentPane().add(showDescriptionToggle5);


        JTextArea textArea1 = new JTextArea();
        textArea1.setWrapStyleWord(true);
        textArea1.setOpaque(false);
        textArea1.setLineWrap(true);
        textArea1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(96, 108, 56));
        textArea1.setForeground(new Color(254, 250, 224));
        textArea1.setBounds(45, 606, 200, 182);
        frame.getContentPane().add(textArea1);

        JTextArea textArea2 = new JTextArea();
        textArea2.setWrapStyleWord(true);
        textArea2.setOpaque(false);
        textArea2.setLineWrap(true);
        textArea2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        textArea2.setEditable(false);
        textArea2.setBackground(new Color(96, 108, 56));
        textArea2.setForeground(new Color(254, 250, 224));
        textArea2.setBounds(352, 606, 200, 182);
        frame.getContentPane().add(textArea2);

        JTextArea textArea3 = new JTextArea();
        textArea3.setWrapStyleWord(true);
        textArea3.setOpaque(false);
        textArea3.setLineWrap(true);
        textArea3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        textArea3.setEditable(false);
        textArea3.setBackground(new Color(96, 108, 56));
        textArea3.setForeground(new Color(254, 250, 224));
        textArea3.setBounds(635, 606, 200, 182);
        frame.getContentPane().add(textArea3);

        JTextArea textArea4 = new JTextArea();
        textArea4.setWrapStyleWord(true);
        textArea4.setOpaque(false);
        textArea4.setLineWrap(true);
        textArea4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        textArea4.setEditable(false);
        textArea4.setBackground(new Color(96, 108, 56));
        textArea4.setForeground(new Color(254, 250, 224));
        textArea4.setBounds(937, 606, 200, 182);
        frame.getContentPane().add(textArea4);

        JTextArea textArea5 = new JTextArea();
        textArea5.setWrapStyleWord(true);
        textArea5.setOpaque(false);
        textArea5.setLineWrap(true);
        textArea5.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 15));
        textArea5.setEditable(false);
        textArea5.setBackground(new Color(96, 108, 56));
        textArea5.setForeground(new Color(254, 250, 224));
        textArea5.setBounds(1248, 606, 200, 182);
        frame.getContentPane().add(textArea5);

        JScrollPane descriptionScrollPane1 = new JScrollPane(textArea1);
        descriptionScrollPane1.setBounds(45, 606, 200, 182);
        descriptionScrollPane1.setOpaque(false);
        descriptionScrollPane1.getViewport().setOpaque(false);
        descriptionScrollPane1.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane1);

        JScrollPane descriptionScrollPane2 = new JScrollPane(textArea2);
        descriptionScrollPane2.setBounds(352, 606, 200, 182);
        descriptionScrollPane2.setOpaque(false);
        descriptionScrollPane2.getViewport().setOpaque(false);
        descriptionScrollPane2.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane2);

        JScrollPane descriptionScrollPane3 = new JScrollPane(textArea3);
        descriptionScrollPane3.setBounds(635, 606, 200, 182);
        descriptionScrollPane3.setOpaque(false);
        descriptionScrollPane3.getViewport().setOpaque(false);
        descriptionScrollPane3.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane3);

        JScrollPane descriptionScrollPane4 = new JScrollPane(textArea4);
        descriptionScrollPane4.setBounds(937, 606, 200, 182);
        descriptionScrollPane4.setOpaque(false);
        descriptionScrollPane4.getViewport().setOpaque(false);
        descriptionScrollPane4.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane4);

        JScrollPane descriptionScrollPane5 = new JScrollPane(textArea5);
        descriptionScrollPane5.setBounds(1248, 606, 200, 182);
        descriptionScrollPane5.setOpaque(false);
        descriptionScrollPane5.getViewport().setOpaque(false);
        descriptionScrollPane5.setBorder(null);
        frame.getContentPane().add(descriptionScrollPane5);

        setToggleAction(showDescriptionToggle1, textArea1, "This bridle is not only very comfortable and flexible, but also effective and therefore loved by horses, riders and trainers. It is designed to comfortably fit your horse's head without applying any pressure on sensitive areas. The tongue protection bit clips help connecting the bit with the side rings. The durable leather is longlasting, easy to maintain and breathable. This bridle is suitable for riders and horses at every level.\n" +
                "Features:\n" +
                "• Unique bridle designed to comfortably fit the shape of the horse's skull\n" +
                "• Anatomic fit\n" +
                "• FEI approved\n" +
                "• High quality leather\n" +
                "• Suitable for horses and riders at every level, from professionals to pleasure and pony riders\n" +
                "• No reins included");
        setToggleAction(showDescriptionToggle2, textArea2, "This kind of tanning avoids heavy metals and salts and is thus significantly more eco-friendly than conventional methods. Furthermore allergic reactions to the leather are quite unlikely to occur.\n" +
                "Features:\n" +
                "• Bridle with wide crank noseband\n" +
                "• Tapered to sides for more space for cheek bones and bit\n" +
                "• Flat side parts\n" +
                "• Striking, curved diamond browband\n" +
                "• Anatomical head piece, pressure reducing\n" +
                "• Softly padded\n" +
                "• Throatlash adjustable on both sides\n" +
                "• Cheekpieces with hook and stud");
        setToggleAction(showDescriptionToggle3, textArea3, "This innovative bridle has been designed mainly for jumping and schooling. Made in exclusive English vegetable tanned leather. Noseband The design of the noseband allows full freedom for the cheekbones and the sensitive nerve endings. Its upper part is fastened by regular pullback fastening. Headpiece The shape of the patent pending crownpiece reduces the pressure behind the sensitive ears and top of the neck of the horse. The extra padding offers more space for the ears to move naturally.\n" +
                "Features:\n" +
                "• Avoids pressure\n" +
                "• Leaves the sensitive nerve endings free\n" +
                "• Pullbackstrap\n" +
                "• Flat, English, vegetable tanned leather\n" +
                "• FEI approved for both horse and pony in all disciplines");
        setToggleAction(showDescriptionToggle4, textArea4, "Beautiful baroque hackamore bridle made of high quality English leather, with throat lash, decorations, soft leather reins and hackamore shanks barco. The F.R.A imperial bridle is made of high-quality leather and, like any classic hackamore, exerts pressure on the horse's nose when the reins are tightened. The rein control remains direct, making this model the perfect beginner's model for bitless riding. Horses that have only been ridden with a bit so far usually have no problems with a change to a hackamore.\n" +
                "Features:\n" +
                "• Version: baroque hackamrore bridle made of English leather\n" +
                "• Headpiece: anatomical design with baroque ornaments on nosepiece and browband\n" +
                "• Padding: F.R.A. supersoft padded finish under crown, nosepiece and browband\n" +
                "• Shanks nand ornaments: richly crafted, stainless steel for black leather and brass for brown leather\n" +
                "• Reins: soft leather 15mm");
        setToggleAction(showDescriptionToggle5, textArea5, "Classic bridle with comfortable padding.\n" +
                "This bridle is made from soft leather. Brass gold snaps close at the sides and offer a secure fit. Padding on nose, crown and browband is comfortable on your horse's sensitive head and won't rub. The classic design will never go out of style. Pair with Kerry reins (#10617).\n" +
                "Features:\n" +
                "• High quality leather\n" +
                "• Padded noseband, crown and browband\n" +
                "• Snaps for attachment\n" +
                "• Brass fittings\n" +
                "• Metal logo pins on browband\n" +
                "• Reins not included");

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

    private Bridle getBridleFromDatabase(String bridleName) {
        if ("Buxton Bridle".equals(bridleName)) {
            return new Bridle(1, bridleName, 60f);
        } else if ("Arika Bridle".equals(bridleName)) {
            return new Bridle(2, bridleName, 55f);
        } else if ("Swedish Bridle".equals(bridleName)) {
            return new Bridle(2, bridleName, 299.99f);
        } else if ("Rambo Bridle".equals(bridleName)) {
            return new Bridle(2, bridleName, 119.99f);
        } else if ("Imperial Bridle".equals(bridleName)) {
            return new Bridle(2, bridleName, 199.99f);
        } else {
            return null;
        }
    }

    private void addBridleToOrder(String bridleName) {
        Bridle bridle = getBridleFromDatabase(bridleName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(bridle);
        JOptionPane.showMessageDialog(frame, bridleName + " added to order.");
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

