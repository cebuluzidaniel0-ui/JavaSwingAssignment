package com.example;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.*;

class BorderLayoutDemoTest {

    @Test
    void shouldCreateVisibleFrame() throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() -> {
            BorderLayoutDemo.createAndShowGui();
            JFrame foundFrame = null;
            for (java.awt.Frame f : java.awt.Frame.getFrames()) {
                // Fix SonarQube: Pattern matching
                if (f instanceof JFrame jFrame && jFrame.isVisible()) {
                    foundFrame = jFrame;
                }
            }
            assertNotNull(foundFrame, "The JFrame should be created and visible.");
        });
    }

    @Test
    void testMainMethodExecution() {
        // Fix SonarQube: No curly braces
        assertDoesNotThrow(() ->
                SwingUtilities.invokeLater(() -> BorderLayoutDemo.main(new String[]{}))
        );
    }
}