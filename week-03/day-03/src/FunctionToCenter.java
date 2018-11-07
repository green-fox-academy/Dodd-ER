import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (int i = 0; i <= WIDTH; i += 20){
            for (int k = 0; k <= WIDTH; k += 20) {
                if ( i == 0 || k == 0 || i == 320 || k == 320 ) {
                    graphics.setColor(GetRandomColor());
                    DrawLineFunction(i, k, graphics);
                }
            }
        }

    }

    public  static void DrawLineFunction(int inputNum1, int inputNum2, Graphics graphics){
        graphics.drawLine(inputNum1, inputNum2,(WIDTH / 2), (HEIGHT / 2));
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
