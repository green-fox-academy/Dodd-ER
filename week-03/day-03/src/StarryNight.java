import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        for (int i = 0; i < 60; i++){
            graphics.setColor(Color.BLACK);
            drawStars(graphics);
        }
    }
    public static void drawStars(Graphics graphics){
        graphics.setColor(GetRandomGrey());
        graphics.fill3DRect(RandomNum(), RandomNum(), 5, 5, true);
    }

    public static Color GetRandomGrey() {
        int[] sameNumInRGB = new int[3];
        int randomNumForTheGreyColor = (int) (Math.random() * 256);
        for (int i = 0; i < 3; i++) {
            sameNumInRGB[i] =  randomNumForTheGreyColor;
        }
        Color randomColor = new Color(sameNumInRGB[0], sameNumInRGB[1], sameNumInRGB[2]);
        return randomColor;
    }

    public static int RandomNum(){
        int output = (int)(Math.random() * (WIDTH - 5));
        return output;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.BLACK);
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
