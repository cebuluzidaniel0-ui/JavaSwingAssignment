package com.example;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void createAndShowGui() {
        // Create and set up the window
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set up the content pane with Border-Layout
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        // Add buttons to each position
        pane.add(new JButton("North"), BorderLayout.NORTH);
        pane.add(new JButton("South"), BorderLayout.SOUTH);
        pane.add(new JButton("East"), BorderLayout.EAST);
        pane.add(new JButton("West"), BorderLayout.WEST);
        pane.add(new JButton("Center"), BorderLayout.CENTER);

        // Display the window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(BorderLayoutDemo::createAndShowGui);
    }
}