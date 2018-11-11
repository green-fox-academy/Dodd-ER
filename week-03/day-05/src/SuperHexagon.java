import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int xCoord = 40;
        int yCoord = 58;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                drawSuperHexagon(xCoord, yCoord, graphics);
                xCoord += 30;
                yCoord -= 16;
            }
            xCoord = 40;
            yCoord = 58 + (i * 32);
        }
        //graphics.setColor(Color.GREEN);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                drawSuperHexagon(xCoord, yCoord, graphics);
                xCoord += 30;
                yCoord += 16;
            }
            xCoord = 40;
            yCoord = 58 + (i * 32);
        }
        //graphics.setColor(Color.BLUE);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                drawSuperHexagon(xCoord, yCoord, graphics);
                xCoord += 30;
                yCoord += 16;
            }
            xCoord = 130;
            yCoord = 10 + (i * 32);
        }
        //graphics.setColor(Color.RED);
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                drawSuperHexagon(xCoord, yCoord, graphics);
                xCoord += 30;
                yCoord -= 16;
            }
            xCoord = 130;
            yCoord = 106 + (i * 32);
        }
    }

    public static void drawSuperHexagon(int xCoord, int yCoord, Graphics graphics) {
        int[] xCoords = new int[]{xCoord + 10, xCoord + 30, xCoord + 40, xCoord + 30, xCoord + 10, xCoord};
        int[] yCoords = new int[]{yCoord, yCoord, yCoord + 16, yCoord + 32, yCoord + 32, yCoord + 16};
        graphics.drawPolygon(xCoords, yCoords, 6);
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
