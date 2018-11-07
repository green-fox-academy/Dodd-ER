import javax.swing.*;
import javax.swing.text.rtf.RTFEditorKit;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(new Color(100,110, 220, 40));
        graphics.drawLine(10,10, 10, 100);
        graphics.setColor(new Color(10,150, 20, 40));
        graphics.drawLine(10, 100, 100, 100);
        graphics.setColor(new Color(120,140, 30, 40));
        graphics.drawLine(100, 100, 100, 10);
        graphics.setColor(new Color(10,10, 220, 40));
        graphics.drawLine(100, 10, 10, 10);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
