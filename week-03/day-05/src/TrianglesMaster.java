import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesMaster {
    public static void mainDraw(Graphics graphics) {
        int xCoord = 160;
        int yCoord = 0;

        for (int i = 0; i <= 32; i++) {
            for (int j = 1; j <= i; j++) {
                drawOneTriangle(xCoord, yCoord, graphics);
                xCoord += 10;
            }
            xCoord = 155 - (i * 5);
            yCoord += 8;
        }

    }

//      --From OldTriangle--
//        for (int i = 0; i <= 320; i += 10) {
//            graphics.setColor(Color.RED);
//            graphics.drawLine((WIDTH / 2) - (int)((i / 1.73) / 1.15), (int)(i * 1.73) / 2,WIDTH - i,  (int)(HEIGHT * 1.73) / 2);
//            graphics.setColor(Color.GREEN);
//            graphics.drawLine((WIDTH / 2) + (int)((i / 1.73) / 1.15),(int)(i * 1.73) / 2, i, (int)(HEIGHT * 1.73) / 2);
//            graphics.setColor(Color.BLUE);
//            graphics.drawLine((WIDTH / 2) - (int)((i / 1.73) / 1.15), (int)(i * 1.73) / 2, (WIDTH / 2) + (int)((i / 1.73) / 1.15),(int)(i * 1.73) / 2);
//        }




    public static void drawOneTriangle(int xCoord, int yCoord, Graphics graphics){
        int[] xCoords = new int[]{xCoord + 5, xCoord + 10, xCoord};
        int[] yCoords = new int[]{yCoord, yCoord + 8, yCoord + 8};

        graphics.drawPolygon(xCoords, yCoords, 3);
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


