import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i <= 320; i += 10) {
            graphics.setColor(Color.RED);
            graphics.drawLine(WIDTH / 2, 0, WIDTH - i, HEIGHT );
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH, HEIGHT - 1, WIDTH / 2, HEIGHT - i);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(0, HEIGHT - i, WIDTH, HEIGHT - i);

        }







    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setBackground(Color.WHITE);
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

