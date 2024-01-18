package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Pad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaddlePadFrame {
    private JFrame frame;
    private OrderManagement orderManagement;

    public SaddlePadFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Saddle Pads");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(619, 22, 438, 141);
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

        JLabel pad1 = new JLabel("");
        pad1.setBounds(41, 256, 200, 200);
        frame.getContentPane().add(pad1);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/pad1.jpg"));
        pad1.setIcon(img1);

        JLabel pad2 = new JLabel("");
        pad2.setBounds(348, 229, 200, 248);
        frame.getContentPane().add(pad2);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/pad2.jpg"));
        pad2.setIcon(img2);

        JLabel pad3 = new JLabel("");
        pad3.setBounds(649, 229, 200, 227);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/pad3.jpg"));
        frame.getContentPane().add(pad3);
        pad3.setIcon(img3);

        JLabel pad4 = new JLabel("");
        pad4.setBounds(939, 229, 200, 248);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/pad4.jpg"));
        frame.getContentPane().add(pad4);
        pad4.setIcon(img4);

        JLabel pad5 = new JLabel("");
        pad5.setBounds(1241, 229, 228, 248);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/pad5.jpg"));
        frame.getContentPane().add(pad5);
        pad5.setIcon(img5);

        JLabel pad1Label = new JLabel("Monaco Saddle Pad 67$");
        pad1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pad1Label.setForeground(new Color(254, 250, 224));
        pad1Label.setBounds(41, 487, 200, 27);
        frame.getContentPane().add(pad1Label);

        JLabel pad2Label = new JLabel("Windsor Saddle Pad 65$");
        pad2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pad2Label.setForeground(new Color(254, 250, 224));
        pad2Label.setBounds(337, 487, 221, 27);
        frame.getContentPane().add(pad2Label);

        JLabel pad3Label = new JLabel("Loire Saddle Pad 69.99$");
        pad3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pad3Label.setForeground(new Color(254, 250, 224));
        pad3Label.setBounds(632, 492, 234, 27);
        frame.getContentPane().add(pad3Label);

        JLabel pad4Label = new JLabel("Allround Saddle Pad 72.99$");
        pad4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pad4Label.setForeground(new Color(254, 250, 224));
        pad4Label.setBounds(939, 492, 234, 27);
        frame.getContentPane().add(pad4Label);

        JLabel pad5Label = new JLabel("Cooling Saddle Pad 24.99$");
        pad5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        pad5Label.setForeground(new Color(254, 250, 224));
        pad5Label.setBounds(1241, 487, 234, 27);
        frame.getContentPane().add(pad5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(41, 524, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addPadToOrder("Monaco Saddle Pad"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(348, 528, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addPadToOrder("Windsor Saddle Pad"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setBounds(632, 528, 61, 21);
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.addActionListener(e -> addPadToOrder("Loire Saddle Pad"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setBounds(939, 528, 61, 21);
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.addActionListener(e -> addPadToOrder("Allround Saddle Pad"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setBounds(1241, 524, 61, 21);
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.addActionListener(e -> addPadToOrder("Cooling Saddle Pad"));
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

        setToggleAction(showDescriptionToggle1, descriptionTextArea1, "Triple-piped trim adds a sporty look to this all purpose saddle pad.\n" +
                "The edge of this all purpose saddle pad is trimmed with three rows of cord for a high-quality, sporty look. The high-cut withers add comfort and the moisture-wicking fabric keeps your horse dry and comfortable. The small square quilting adds a nice look while the foam-lined pad cushions your ride. Hook-and-loop fastener straps hold the saddle pad in place and a girth strap with the Horze emblem is stitched into place to keep your saddle from slipping.\n" +
                "Features:\n" +
                "• Sporty all purpose saddle pad\n" +
                "• Triple piped trim with cord accent\n" +
                "• Moisture-wicking fabric\n" +
                "• Foam lined with small diamond-shaped quilted pattern\n" +
                "• Hook-and-loop fastener attachments and girth straps\n");
        setToggleAction(showDescriptionToggle2, descriptionTextArea2, "This luxurious saddle pad with subtle trim and unique quilting lives up to its name.\n" +
                "The Monaco all purpose saddle pad is the perfect addition to your horse tack. It is designed in timeless colours with elegant circle quilting and fits comfortably under your saddle. Anti-dust treatment makes sure the fabric stays neat and pretty during everyday use. Stunning cord piping along the trim adds a luxurious feature. Two straps make it super easy to attach to your saddle. Pair with the Monaco ear net (#22921) for a full look!\n" +
                "Features:\n" +
                "• All purpose saddle pad\n" +
                "• Anti-dust treatment fabric\n" +
                "• Cord piping\n" +
                "• Circle quilting\n" +
                "• Straps for attachment to the saddle\n" +
                "• Small metal logo and rubber flag label\n" +
                "• B Vertigo embroidery\n");
        setToggleAction(showDescriptionToggle3, descriptionTextArea3, "Described as the most stylish dressage pad LeMieux have ever produced. The Loire collection exudes sophistication and class - showing style without showing off! Woven Satin fabric gives a beautiful sheen to these pads whilst still benefitting from the wonderfully soft and breathable Bamboo lining.\n" +
                "Features:\n" +
                "• The 100% natural Bamboo material controls heat & sweat and wicks very efficiently\n" +
                "• The whole pad benefits from a new extensively researched soft friction-free suede binding which is specially fabricated to smoothly contour the edges\n" +
                "• This new technique helps retain the perfect saddle pad shape and binding profile\n" +
                "• The textured PU leather girth protection area is complimented by an embossed logo and carries the usual signature LeMieux lower girth strap with its inner locking loops");
        setToggleAction(showDescriptionToggle4, descriptionTextArea4, "Feel fabulous, Feel the difference with Nights Collection Saddle Pad. Lined in our new innovative and powerful waffle fabric with Welltex® technology. Our new waffle textile has the highest emissivity* values that has been made by us. This may provide your horse better conditions for performance. Infrared energy can help your horse´s muscles to carry you as a rider. May help increasing blood flow and relieving stiffness over the back and we hope that you and your horse will experience the difference. Two layer filling for shock absorbing and breathability. Made with our famous No I design to give the wither space and reduce pressure on the spine.\n" +
                "Features:\n" +
                "• Powerfull waffle textile\n" +
                "• Elegant design\n" +
                "• 2 layer filling\n" +
                "• Tailored fit\n" +
                "• Swedish design");
        setToggleAction(showDescriptionToggle5, descriptionTextArea5, "Your essential summer saddle pad.\n" +
                "This cooling saddle pad is made with special lining that prevents overheating. A panel along the spine offers extra ventilation. Soft outer and square quilting provide comfort beneath the saddle. Sporty logo tape along the spine and stylish colours match your tack perfectly.\n" +
                "Features:\n" +
                "• All purpose style\n" +
                "• Soft outer\n" +
                "• Cooling lining\n" +
                "• Extra ventilation at spine\n" +
                "• Square quilting\n" +
                "• Stylish colours\n");

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

    private Pad getPadFromDatabase(String padName) {
        if ("Monaco Saddle Pad".equals(padName)) {
            return new Pad(1, padName, 67f);
        } else if ("Windsor Saddle Pad".equals(padName)) {
            return new Pad(2, padName, 65f);
        }  else if ("Loire Saddle Pad".equals(padName)) {
            return new Pad(2, padName, 69.99f);
        }  else if ("Allround Saddle Pad".equals(padName)) {
            return new Pad(2, padName, 72.99f);
        }  else if ("Cooling Saddle Pad".equals(padName)) {
            return new Pad(2, padName, 24.99f);
        } else {
            return null;
        }
    }

    private void addPadToOrder(String padName) {
        Pad pad = getPadFromDatabase(padName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(pad);
        JOptionPane.showMessageDialog(frame, padName + " added to order.");
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
