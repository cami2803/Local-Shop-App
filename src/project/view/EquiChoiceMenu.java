package project.view;

import project.DatabaseConnection;
import project.controller.PageNavigator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This class lets the user choose between browsing horse accessories or rider accessories and provides a search bar
public class EquiChoiceMenu {

    private JFrame frame;// The main window
    private JTextField searchTextField;// The text field for entering search queries
    private JPanel resultsPanel;// The panel where search results are displayed

    // Constructor sets up the GUI components.
    public EquiChoiceMenu() {
        frame = new JFrame();

        frame.getContentPane().setBackground(new Color(96, 108, 56));
        frame.getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("EquiChoice");
        titleLabel.setForeground(new Color(254, 250, 224));
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        titleLabel.setBounds(627, 25, 377, 141);
        frame.getContentPane().add(titleLabel);

        // ComboBox for horse accessories selection with predefined options
        String[] horseOptions = {"", "Saddles", "Saddle Pads", "Bridles and Reins", "Horse Rugs", "Horse Health Care"};
        JComboBox horseComboBox = new JComboBox(horseOptions);
        horseComboBox.setForeground(new Color(254, 250, 224));
        horseComboBox.setBackground(new Color(40, 54, 24));
        horseComboBox.setFont(new Font("Monospaced", Font.BOLD, 15));
        horseComboBox.setBounds(376, 298, 290, 31);
        frame.getContentPane().add(horseComboBox);

        // Action listener for horseComboBox to handle user selection
        horseComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JComboBox cb = (JComboBox) e.getSource();
                    String msg = (String) cb.getSelectedItem();

                    switch (msg) {
                        case "Saddles" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            SaddlesFrame saddlesFrame = new SaddlesFrame();
                        }
                        case "Saddle Pads" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            SaddlePadFrame saddlePadFrame = new SaddlePadFrame();
                        }
                        case "Bridles and Reins" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            BridleFrame bridleFrame = new BridleFrame();
                        }
                        case "Horse Rugs" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            RugFrame rugFrame = new RugFrame();
                        }
                        case "Horse Health Care" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            HealthFrame healthFrame = new HealthFrame();
                        }
                        default -> JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JLabel horseLabel = new JLabel("Horse Accesories:");
        horseLabel.setForeground(new Color(254, 250, 224));
        horseLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        horseLabel.setBounds(44, 290, 322, 40);
        frame.getContentPane().add(horseLabel);

        JLabel riderLabel = new JLabel("Rider Accesories:");
        riderLabel.setForeground(new Color(254, 250, 224));
        riderLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
        riderLabel.setBounds(855, 289, 322, 40);
        frame.getContentPane().add(riderLabel);

        // ComboBox for rider accessories selection with predefined options
        String[] riderOptions = {"", "Riding Pants", "Riding Footwear", "Riding Gloves", "Helmets", "Vests, Back Protectors"};
        JComboBox riderComboBox = new JComboBox(riderOptions);
        riderComboBox.setForeground(new Color(254, 250, 224));
        riderComboBox.setBackground(new Color(40, 54, 24));
        riderComboBox.setFont(new Font("Monospaced", Font.BOLD, 15));
        riderComboBox.setBounds(1187, 297, 294, 31);
        frame.getContentPane().add(riderComboBox);
        frame.setBounds(100, 100, 1600, 1026);


        // Action listener for riderComboBox to handle user selection
        riderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JComboBox cb = (JComboBox) e.getSource();
                    String msg = (String) cb.getSelectedItem();

                    switch (msg) {
                        case "Riding Pants" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            RidingPantsFrame ridingPantsFrame = new RidingPantsFrame();
                        }
                        case "Riding Footwear" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            RidingFootwearFrame ridingFootwearFrame = new RidingFootwearFrame();
                        }
                        case "Riding Gloves" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            RidingGlovesFrame ridingGlovesFrame = new RidingGlovesFrame();
                        }
                        case "Helmets" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            HelmetFrame helmetFrame = new HelmetFrame();
                        }
                        case "Vests, Back Protectors" -> {
                            frame.getContentPane().setVisible(false);
                            frame.dispose();
                            VestsFrame vestsFrame = new VestsFrame();
                        }
                        default -> JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        exitButton.setBackground(new Color(221, 161, 94));
        exitButton.setForeground(new Color(40, 54, 24));
        exitButton.setBounds(28, 10, 81, 62);
        frame.getContentPane().add(exitButton);

        JLabel imageLabelHorse = new JLabel("");
        imageLabelHorse.setBounds(40, 391, 626, 425);
        frame.getContentPane().add(imageLabelHorse);

        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/images/sa.jpg"));
        imageLabelHorse.setIcon(img1);

        JLabel imageLabelRider = new JLabel("");
        imageLabelRider.setBounds(855, 391, 626, 425);
        frame.getContentPane().add(imageLabelRider);

        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/images/cowboy.jpg"));
        imageLabelRider.setIcon(img2);
        PageNavigator pageNavigator = new PageNavigator(frame, exitButton, new JButton());

        //button for generating a random fun fact
        JButton randomFactButton = new JButton("Did you know...?");
        randomFactButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        randomFactButton.setBackground(new Color(221, 161, 94));
        randomFactButton.setForeground(new Color(40, 54, 24));
        randomFactButton.setBounds(1280, 20, 200, 50);
        frame.getContentPane().add(randomFactButton);

        //function that calls the button in order to generate a random fun fact about horses and horse riding
        getRandomFunFact(randomFactButton);

        //Create the search bar for input
        searchTextField = new JTextField();
        searchTextField.setFont(new Font("Monospaced", Font.BOLD, 15));
        searchTextField.setBounds(1100, 80, 281, 36);
        searchTextField.setForeground(new Color(254, 250, 224));
        searchTextField.setBackground(new Color(40, 54, 24));
        searchTextField.setCaretColor(new Color(254, 250, 224));
        frame.getContentPane().add(searchTextField);
        searchTextField.setColumns(10);

        //Button that when is pressed, searches for desired item
        JButton searchButton = new JButton("Search");
        searchButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        searchButton.setBackground(new Color(221, 161, 94));
        searchButton.setForeground(new Color(40, 54, 24));
        searchButton.setBounds(1380, 80, 100, 36);
        frame.getContentPane().add(searchButton);

        //Panel where the search results can be seen
        resultsPanel = new JPanel(new BorderLayout());
        resultsPanel.setBounds(1100, 120, 380, 120);
        resultsPanel.setVisible(false); // Initially hidden
        frame.getContentPane().add(resultsPanel);

        // Search button action listener to execute a search and display results
        searchButton.addActionListener(e -> searchProducts(searchTextField.getText()));


        //UIManager configurations and updates for the UI components
        UIManager.put("Button.select", new Color(221, 161, 94));
        SwingUtilities.updateComponentTreeUI(exitButton);
        SwingUtilities.updateComponentTreeUI(randomFactButton);
        SwingUtilities.updateComponentTreeUI(searchButton);

        UIManager.put("ComboBox.selectionBackground", new Color(96, 108, 56));
        UIManager.put("ComboBox.selectionForeground", new Color(254, 250, 224));

        SwingUtilities.updateComponentTreeUI(horseComboBox);
        SwingUtilities.updateComponentTreeUI(riderComboBox);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    //Function to generate a random fact by pressing a button
    private void getRandomFunFact(JButton button) {
        //Add an action listener on the button
        button.addActionListener(e -> {
            //Create the string containing the fun facts about horses
            String[] randomFunFacts = {"Horses Sleep Standing Up",
                    "You Can Estimate a Horse's Age by Their Teeth",
                    "Horses Can Live to Be More Than 30 Years Old",
                    "The American Quarter Horse Is the World's Most Popular Breed",
                    "Arabian Horses Have Fewer Bones Than Other Breeds",
                    "Humans Domesticated Horses More Than 3,000 Years Ago",
                    "Horses Are Measured in Hands",
                    "A Horse's Resting Respiratory Rate Is About 8-14 Breaths per Minute",
                    "The Original \"Horse\" Was the Size of a Golden Retriever",
                    "Horses Can Only Breathe Through Their Nose",
                    "Horseback riding is one of the oldest forms of transportation.",
                    "Horseback riding offers numerous health benefits."};
            //Generate a random number
            Random r = new Random();
            int randomNumber = r.nextInt(randomFunFacts.length);
            //Show the random fun fact in a message dialog
            showMessage(randomFunFacts[randomNumber]);
        });
    }

    // This method searches the database for products based on the user's query.
    private void searchProducts(String query) {
        // Create an ArrayList to hold the search results.
        ArrayList<String> results = new ArrayList<>();
        // SQL query to search across multiple tables using UNION. It looks for items that include the search term.
        String sql = "SELECT bridleName AS name, price FROM bridle WHERE bridleName LIKE ? " +
                "UNION SELECT healthName AS name, price FROM care WHERE healthName LIKE ? " +
                "UNION SELECT helmetName AS name, price FROM helmet WHERE helmetName LIKE ? " +
                "UNION SELECT padName AS name, price FROM pads WHERE padName LIKE ? " +
                "UNION SELECT footwearName AS name, price FROM ridingfootwear WHERE footwearName LIKE ? " +
                "UNION SELECT gloveName AS name, price FROM ridinggloves WHERE gloveName LIKE ? " +
                "UNION SELECT pantsName AS name, price FROM ridingpants WHERE pantsName LIKE ? " +
                "UNION SELECT rugName AS name, price FROM rug WHERE rugName LIKE ? " +
                "UNION SELECT saddleName AS name, price FROM saddle WHERE saddleName LIKE ? " +
                "UNION SELECT vestName AS name, price FROM vests WHERE vestName LIKE ?";
        // Establish a connection to the database.
        DatabaseConnection db = new DatabaseConnection();

        try (Connection conn = db.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the search term in the prepared statement, using wildcards for partial matches.
            for (int i = 1; i <= 10; i++) {
                pstmt.setString(i, "%" + query + "%");
            }

            // Execute the query.
            ResultSet rs = pstmt.executeQuery();

            // Iterate over the result set and add each item to the results list.
            while (rs.next()) {
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                results.add(name + " - $" + price);
            }
        } catch (Exception e) {
            // Print the stack trace if there's an exception.
            e.printStackTrace();
        }
        // Display the search results in the UI.
        displaySearchResults(results, query);
    }

    // This method updates the UI to display search results.
    private void displaySearchResults(ArrayList<String> results, String searchQuery) {
        resultsPanel.removeAll(); // Clear any existing content in the results panel.

        // Create a text pane for displaying HTML content.
        JTextPane resultsTextPane = new JTextPane();
        resultsTextPane.setContentType("text/html");
        resultsTextPane.setEditable(false);
        resultsTextPane.setBackground(new Color(40, 54, 24));
        resultsTextPane.setForeground(new Color(254, 250, 224));

        // Sort the results alphabetically before displaying.
        Collections.sort(results, String.CASE_INSENSITIVE_ORDER);

        // If no results were found, display a "No results found" message.
        if (results.isEmpty()) {
            searchTextField.setText(""); // Clear the search field.
            resultsTextPane.setText("<html><body style='font-family:Monospaced; color:#FEFAD0; background-color:#283618;'>No results found.</body></html>");
        } else {
            // If results were found, format them with HTML and display.
            String styledText = highlightSearchWord(results, searchQuery);
            resultsTextPane.setText(styledText);
        }

        // Add the text pane to a scroll pane to enable scrolling.
        JScrollPane scrollPane = new JScrollPane(resultsTextPane);
        scrollPane.getViewport().setBackground(new Color(40, 54, 24));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the results panel.
        resultsPanel.add(scrollPane, BorderLayout.CENTER);

        // Add a "Close" button to hide the results panel.
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> resultsPanel.setVisible(false));
        resultsPanel.add(closeButton, BorderLayout.SOUTH);

        // Make the results panel visible and refresh the UI.
        resultsPanel.setVisible(true);
        resultsPanel.revalidate();
        resultsPanel.repaint();
    }

    // This method creates a string with HTML content to highlight the search word in the results.
    private String highlightSearchWord(ArrayList<String> results, String searchWord) {
        // Escape any regex special characters in the search term.
        String escapedSearchWord = Pattern.quote(searchWord);

        // Compile a pattern to find the search term, ignoring case.
        Pattern pattern = Pattern.compile(escapedSearchWord, Pattern.CASE_INSENSITIVE);

        // Start building the HTML string to display the results.
        StringBuilder highlightedText = new StringBuilder(
                "<html><body style='font-family:Monospaced; color:#FEFAD0; background-color:#283618;'>"
        );

        // Iterate over the results.
        for (String result : results) {
            // Create a matcher to find the search term in the result string.
            Matcher matcher = pattern.matcher(result);

            // Buffer to hold the intermediate result.
            StringBuffer buffer = new StringBuffer();
            while (matcher.find()) {
                // Highlight the search term using a span tag with a semi-transparent white background.
                matcher.appendReplacement(buffer, "<span style='background-color: rgba(255, 255, 255, 0.5);'>$0</span>");
            }
            // Append the rest of the string.
            matcher.appendTail(buffer);

            // Add the highlighted result to the HTML string, with a line break after each entry.
            highlightedText.append(buffer.toString()).append("<br>");
        }
        // This line closes the HTML and body tags that were opened at the beginning of the `highlightedText`.
        // It signals the end of the HTML content that will be displayed in the JTextPane.
        highlightedText.append("</body></html>");

        // This line converts the StringBuilder object `highlightedText` to a String.
        // The `toString()` method is necessary because while StringBuilder is used for efficient string manipulation,
        // the final result needs to be a standard String to be used elsewhere, such as setting the text of a JTextPane.
        return highlightedText.toString();
    }

    //Method that write in a message dialog the String s
    public void showMessage(String s) {
        JOptionPane.showMessageDialog(frame, s, "Did you know...?", JOptionPane.INFORMATION_MESSAGE);
    }
}