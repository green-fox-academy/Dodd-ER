import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {


    public static void mainDraw(Graphics graphics) {
        int width = WIDTH;
        for (int i = width; i > 0; i--){
            width--;
            DrawingRainbowBoxFunction(width, new Color((int) (Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)), graphics);
        }
    }


    public  static void DrawingRainbowBoxFunction(int inputNum, Color inputColor, Graphics graphics){
        graphics.setColor(inputColor);
        graphics.fillRect((WIDTH - inputNum) / 2, (HEIGHT - inputNum) / 2, inputNum, inputNum);
    }

    public static Color GetRandomColor() {
        int[] randomRGB = new int[3];
        for (int i = 0; i < 3; i++) {
            randomRGB[i] =  (int) (Math.random() * 256);
        }
        Color randomColor = new Color(randomRGB[0], randomRGB[1], randomRGB[2]);
        return randomColor;
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
