import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] arrayOfDots = new int[][] {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        int[][] arrayOfDots2 = new int[][] { {10, 10}, {290,  10}, {290, 290}, {10, 290} };
        for (int i = 0; i < arrayOfDots.length; i++){
            for (int j = 0; j < arrayOfDots[i].length; j++) {
                System.out.print(arrayOfDots[i][j] + " ");
            }
            System.out.println();
        }

        ConnectTheDotsFunction(arrayOfDots, graphics);
    }

    public static void ConnectTheDotsFunction(int[][] inputArray, Graphics graphics){
//        10 10     graphics.drawPolyline(inputArray[0][], inputArray[j], 2);
//        290 10    graphics.drawPolyline(inputArray[1][], inputArray[j], 2);
//        290 290   graphics.drawPolyline(inputArray[2][], inputArray[j], 2);
//        10 290    graphics.drawPolyline(inputArray[3][], inputArray[j], 2);
//        graphics.drawPolygon(inputArray[0], inputArray[1], 4);
        int[] xCoord = new int[inputArray.length];
        int[] yCoord = new int[inputArray.length];


        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if (j == 0){
                    xCoord[i] = inputArray[i][j];
                }else {
                    yCoord[i] = inputArray[i][j];
                }
            }
        }
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xCoord, yCoord, inputArray.length);

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
