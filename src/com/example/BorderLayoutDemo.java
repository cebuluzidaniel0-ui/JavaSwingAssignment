package com.example;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        // Run the GUI codes in the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(BorderLayoutDemo::createAndShowGui);
    }

    static void createAndShowGui() {
        // 5. Frame Settings
        JFrame frame = new JFrame("BorderLayout Demo");
        // Using WindowConstants to fix the static access warning
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // 1. NORTH region: Title with centered alignment
        JLabel titleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        // Optional: Adding a small border for better visual separation
        titleLabel.setBorder(BorderFactory.createTitledBorder(""));
        frame.add(titleLabel, BorderLayout.NORTH);

        // 2. WEST region: JPanel containing three JButtons stacked vertically
        // Using GridLayout(3, 1) to make buttons fill the height equally
        JPanel westPanel = new JPanel(new GridLayout(3, 1));
        westPanel.add(new JButton("Option 1"));
        westPanel.add(new JButton("Option 2"));
        westPanel.add(new JButton("Option 3"));
        frame.add(westPanel, BorderLayout.WEST);

        // 3. CENTER region: Scrollable JTextArea
        JTextArea textArea = new JTextArea();
        // Wrapping the text area in a JScrollPane as required
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 4. SOUTH region: Submit Button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Making the frame visible
        frame.setVisible(true);
    }
}