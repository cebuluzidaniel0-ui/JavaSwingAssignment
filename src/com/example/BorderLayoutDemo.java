package com.example;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        // Exécution dans le thread de l'interface utilisateur
        SwingUtilities.invokeLater(BorderLayoutDemo::createAndShowGui);
    }

    static void createAndShowGui() {
        // 5. Frame Settings
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // 1. NORTH region : Titre centré
        JLabel titleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createTitledBorder("")); // Pour la petite ligne de séparation
        frame.add(titleLabel, BorderLayout.NORTH);

        // 2. WEST region : JPanel avec 3 boutons empilés verticalement
        JPanel westPanel = new JPanel(new GridLayout(3, 1));
        westPanel.add(new JButton("Option 1"));
        westPanel.add(new JButton("Option 2"));
        westPanel.add(new JButton("Option 3"));
        frame.add(westPanel, BorderLayout.WEST);

        // 3. CENTER region : JTextArea scrollable
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 4. SOUTH region : Bouton Submit
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}