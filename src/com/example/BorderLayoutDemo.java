package com.example;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutDemo {

    /**
     * Set up the Graphical User Interface.
     */
    static void createAndShowGui() {
        // Main window configuration
        JFrame frame = new JFrame("BorderLayout Demo");

        // Use WindowConstants as recommended by SonarLint
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Adding buttons to the layout
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the event-dispatching thread
        SwingUtilities.invokeLater(BorderLayoutDemo::createAndShowGui);
    }
}