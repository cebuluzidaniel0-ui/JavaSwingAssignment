package com.example;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.*;

class BorderLayoutIntegrationTest {

    @Test
    void testFullGuiIntegration() throws InterruptedException, InvocationTargetException {
        // Step 1: Request the application in 'src' to launch its GUI
        // This ensures we are testing the real connection between files
        SwingUtilities.invokeAndWait(BorderLayoutDemo::createAndShowGui);

        JFrame frame = null;
        // Step 2: Search for the active window in the system by its title
        for (Frame f : Frame.getFrames()) {
            if (f instanceof JFrame jFrame && "BorderLayoutDemo".equals(jFrame.getTitle())) {
                frame = jFrame;
            }
        }

        // Step 3: Validate that the window exists (Integration Success)
        assertNotNull(frame, "Integration failed: The JFrame was not found in the system");

        // Step 4: Verify that the Layout Manager is correctly set to BorderLayout
        LayoutManager layout = frame.getContentPane().getLayout();
        assertInstanceOf(BorderLayout.class, layout, "Layout integration failed: should be BorderLayout");

        // Step 5: Verify that components are correctly integrated and accessible
        Component centerBtn = ((BorderLayout) layout).getLayoutComponent(BorderLayout.CENTER);
        assertNotNull(centerBtn, "Integration failed: The center button is missing from the layout");

        // Step 6: Verify the properties of the integrated component
        if (centerBtn instanceof JButton button) {
            assertEquals("Center", button.getText(), "Button text mismatch");
        } else {
            fail("Center component should be a JButton");
        }
    }
}