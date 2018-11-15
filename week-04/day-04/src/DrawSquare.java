import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawSquare {
  public static void mainDraw(Graphics graphics) {

//    for (int i = 0;i < 6; i++) {
//      graphics.drawLine(size / 3, 0, size / 3, size);
//      graphics.drawLine(2 * (size / 3), 0, 2 * (size / 3), size);
//      graphics.drawLine(0, size / 3, size, size / 3);
//      graphics.drawLine(0, 2 * (size / 3), size, 2 * (size / 3));
//      size = size / 3;
//    }
    drawSquare(0, 0,729, 729, graphics);

  }

  public static void drawSquare(int x, int y, int width, int height, Graphics graphics) {
//    if (width > 3) {
//      graphics.drawLine((width / 2) - (width / 6), 0, (width / 2) - (width / 6), height);
//      graphics.drawLine((width / 2) + (width / 6), 0, (width / 2) + (width / 6), height);
//      graphics.drawLine(0, (height / 2) - (height / 6), width, (height / 2) - (height / 6));
//      graphics.drawLine(0, (height / 2) + (height / 6), width, (height / 2) + (height / 6));
//      drawSquare(width / 3,height /3, graphics);
//    }
    if (width > 3) {
      graphics.drawRect(x + (width / 3), y, width / 3, height / 3);
      graphics.drawRect(x, y + (height / 3), width / 3, height / 3);
      graphics.drawRect(x + (2 * (width / 3)), y + (height / 3), width / 3, height / 3);
      graphics.drawRect(x + (width / 3), y + (2 * (height / 3)), width / 3, height / 3);
      drawSquare(x + (width / 3), y, width / 3, height / 3, graphics);
      drawSquare(x, y + (height / 3), width / 3, height / 3, graphics);
      drawSquare(x + (2 * (width / 3)), y + (height / 3), width / 3, height / 3, graphics);
      drawSquare(x + width / 3, y + (2 * (height / 3)), width / 3, height / 3, graphics);
    }

  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setBackground(Color.YELLOW);
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
