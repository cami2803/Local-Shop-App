package project.view;

import project.controller.OrderManagement;
import project.controller.PageNavigator;
import project.model.Rug;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RugFrame {

    private JFrame frame;
    private OrderManagement orderManagement;

    public RugFrame(){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1600, 1026);

        JLabel titleLabel = new JLabel("Horse Rugs");
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setBounds(649, 22, 388, 141);
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

        JLabel rug1 = new JLabel("");
        rug1.setBounds(45, 230, 200, 219);
        frame.getContentPane().add(rug1);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/rug2.jpg"));
        rug1.setIcon(img2);

        JLabel rug2 = new JLabel("");
        rug2.setBounds(352, 230, 200, 219);
        frame.getContentPane().add(rug2);
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/rug1.jpg"));
        rug2.setIcon(img1);

        JLabel rug3 = new JLabel("");
        rug3.setBounds(621, 230, 200, 219);
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/images/rug3.jpg"));
        rug3.setIcon(img3);
        frame.getContentPane().add(rug3);

        JLabel rug4 = new JLabel("");
        rug4.setBounds(928, 230, 200, 219);
        frame.getContentPane().add(rug4);
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/images/rug4.jpg"));
        rug4.setIcon(img4);

        JLabel rug5 = new JLabel("");
        rug5.setBounds(1231, 230, 200, 219);
        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/images/rug5.jpg"));
        rug5.setIcon(img5);
        frame.getContentPane().add(rug5);

        JLabel rug1Label = new JLabel("Turnout Rug 43$");
        rug1Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        rug1Label.setForeground(new Color(254, 250, 224));
        rug1Label.setBounds(45, 460, 235, 27);
        frame.getContentPane().add(rug1Label);

        JLabel rug2Label = new JLabel("Winter Rug 34$");
        rug2Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        rug2Label.setForeground(new Color(254, 250, 224));
        rug2Label.setBounds(352, 460, 200, 27);
        frame.getContentPane().add(rug2Label);

        JLabel rug3Label = new JLabel("Lucerne Rug 64.99$");
        rug3Label.setForeground(new Color(254, 250, 224));
        rug3Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        rug3Label.setBounds(621, 460, 235, 27);
        frame.getContentPane().add(rug3Label);

        JLabel rug4Label = new JLabel("Waterproof Rug 171.99$");
        rug4Label.setForeground(new Color(254, 250, 224));
        rug4Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        rug4Label.setBounds(928, 460, 210, 27);
        frame.getContentPane().add(rug4Label);

        JLabel rug5Label = new JLabel("Kentucky Rug  163.99");
        rug5Label.setForeground(new Color(254, 250, 224));
        rug5Label.setFont(new Font("Monospaced", Font.BOLD, 15));
        rug5Label.setBounds(1231, 460, 200, 27);
        frame.getContentPane().add(rug5Label);

        JButton addToOrder1Button = new JButton("Add");
        addToOrder1Button.setBounds(45, 496, 61, 21);
        addToOrder1Button.setBackground(new Color(221, 161, 94));
        addToOrder1Button.setForeground(new Color(40, 54, 24));
        addToOrder1Button.addActionListener(e -> addRugToOrder("Turnout Rug"));
        frame.getContentPane().add(addToOrder1Button);

        JButton addToOrder2Button = new JButton("Add");
        addToOrder2Button.setBounds(352, 496, 61, 21);
        addToOrder2Button.setBackground(new Color(221, 161, 94));
        addToOrder2Button.setForeground(new Color(40, 54, 24));
        addToOrder2Button.addActionListener(e -> addRugToOrder("Winter Rug"));
        frame.getContentPane().add(addToOrder2Button);

        JButton addToOrder3Button = new JButton("Add");
        addToOrder3Button.setForeground(new Color(40, 54, 24));
        addToOrder3Button.setBackground(new Color(221, 161, 94));
        addToOrder3Button.setBounds(621, 496, 61, 21);
        addToOrder3Button.addActionListener(e -> addRugToOrder("Lucerne Rug"));
        frame.getContentPane().add(addToOrder3Button);

        JButton addToOrder4Button = new JButton("Add");
        addToOrder4Button.setForeground(new Color(40, 54, 24));
        addToOrder4Button.setBackground(new Color(221, 161, 94));
        addToOrder4Button.setBounds(928, 496, 61, 21);
        addToOrder4Button.addActionListener(e -> addRugToOrder("Waterproof Rug"));
        frame.getContentPane().add(addToOrder4Button);

        JButton addToOrder5Button = new JButton("Add");
        addToOrder5Button.setForeground(new Color(40, 54, 24));
        addToOrder5Button.setBackground(new Color(221, 161, 94));
        addToOrder5Button.setBounds(1231, 496, 61, 21);
        addToOrder5Button.addActionListener(e -> addRugToOrder("Kentucky Rug"));
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

        setToggleAction(showDescriptionToggle1, textArea1, "This medium weight turnout rug protects your horse and keeps it dry.\n" +
                "This rug is made from a waterproof, breathable fabric. The good fit at the neck and shoulder area makes it comfortable, and the high gussets allow freedom of movement. The front buckles, X-surcingles, leg straps and tail flap secure the turnout.\n" +
                "Features:\n" +
                "• Filling 350gsm\n" +
                "• Waterproof\n" +
                "• Breathable fabric\n" +
                "• High gussets\n" +
                "• Two front buckles\n" +
                "• X-surcingles\n" +
                "• Leg straps with snaps\n" +
                "• Tail flap");
        setToggleAction(showDescriptionToggle2, textArea2, "This heavyweight rug is thick and dense and will allow your horse to regulate his body temperature without overheating. The style is designed to create an igloo against the cold for horses who enjoy plenty of healthy outdoor turnout. You can sleep well knowing your horse is warm and happy wearing this premium turnout rug.\n" +
                "Features:\n" +
                "• 1200D polyester square rip stop outer shell to preserve waterproof/breathability/windproof benefits\n" +
                "• Full coverage neck with shaped shoulders for the ultimate cold weather protection\n" +
                "• Buckles made of high-quality, durable material\n" +
                "• Taped seams for waterproof durability\n" +
                "• Detachable elastic leg straps\n" +
                "• Large tail flap attached deep on the back of the rug for full coverage and wind protection\n" +
                "• Fit allows extra comfort at the withers and prevents rubbing\n" +
                "• Hook-and-loop fasteners front closure with T-buckles overlaid for quick and easy fastening\n" +
                "• Extra high gusset is moved forward to allow maximum freedom\n" +
                "• Cross surcingles with elastic for added flexibility\n" +
                "• Reflective trim\n" +
                "• U-cut fit in front allows more room for the horse's legs");
        setToggleAction(showDescriptionToggle3, textArea3, "Your new well thought out turnout rug in a sporty look with advanced fit.\n" +
                "The Horze Lucerne turnout rug keeps your horse dry, and the filling is warm and comfortable. Elastic holds the rug in place and ensures the perfect fit. Double front buckles and x-surcingles close safely. A neck piece can be attached to the hook-and-loop fastener. The sporty design can be easily incorporated into your tack.\n" +
                "Features:\n" +
                "• Waterproof\n" +
                "• Breathable\n" +
                "• Sporty look with two-toned design\n" +
                "• Advanced cut\n" +
                "• Soft faux fur at withers\n" +
                "• Hook-and-loop closure for easy neck attachment\n" +
                "• Double front closure with quick snaps\n" +
                "• X-surcingles with t-buckles\n" +
                "• High gussets with elastic\n" +
                "• Elastic leg straps\n" +
                "• Tail flap\n" +
                "• Small Horze rubber logo");
        setToggleAction(showDescriptionToggle4, textArea4, "Protect your horse against rain, cold weather and rubbing marks with the Turnout Rug All Weather Waterproof Pro.\n " +
                "Thanks to the artificial rabbit skin, the rug always moves back into the right place after rolling. The rug features a hook and loop closure with 2 front closures, 2 cross surcingles of seatbelt webbing material, and a plastic-covered bungee cord (for easy cleaning). For more coverage, a separate neckpiece can be bought.\n" +
                "Features:\n" +
                "• 1680D outside\n" +
                "• Artificial rabbit skin lining\n" +
                "• No seam in the back to avoid leakage\n" +
                "• Strong and breathable\n" +
                "• Rug moves always back into the right place" );
        setToggleAction(showDescriptionToggle5, textArea5, "The show rug features double front closures and two detachable cross surcingles that are reinforced with artificial leather. The bungee cord is also detachable and has a plastic cover which allows easy cleaning. The show rug is machine washable at 30°.\n" +
                "Features:\n" +
                "• Anatomically shaped for a perfect fit\n" +
                "• Artificial sheepskin all around the neck, withers and chest\n" +
                "• Extremely soft artificial rabbit skin to avoid rubbing\n" +
                "• The artificial rabbit skin creates tiny air pockets that trap & retain the body heat\n" +
                "• The horse’s coat get shinier thanks to the soft hairs of the artificial rabbit skin\n" +
                "• Very strong thanks to the three layered diamond quilting pattern\n" +
                "• High warmth to weight ratio to maximize comfort\n" +
                "• No hairs stick in the artificial rabbit skin lining\n" +
                "• Outer fabric prevents shavings from sticking to the fabric\n" +
                "• Double front closures-Detachable cross surcingles\n" +
                "• Bungee tail cord with a plastic cover (detachable, easy to clean)\n");

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

    private Rug getRugFromDatabase(String rugName) {
        if ("Turnout Rug".equals(rugName)) {
            return new Rug(1, rugName, 43f);
        } else if ("Winter Rug".equals(rugName)) {
            return new Rug(2, rugName, 34f);
        } else if ("Lucerne Rug".equals(rugName)) {
            return new Rug(2, rugName, 64.99f);
        } else if ("Kentucky Rug".equals(rugName)) {
            return new Rug(2, rugName, 163.99f);
        } else if ("Waterproof Rug".equals(rugName)) {
            return new Rug(2, rugName, 171.99f);
        } else {
        return null;
        }
    }

    private void addRugToOrder(String rugName) {
        Rug rug = getRugFromDatabase(rugName);
        OrderManagement orderManagement = OrderManagement.getInstance();
        orderManagement.addItem(rug);
        JOptionPane.showMessageDialog(frame, rugName + " added to order.");
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
