import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierPinskyCarpet {
  public static void mainDraw(Graphics graphics) {

    drawCarpet(0,0, 729, 729, graphics);

  }

  public static void drawCarpet(int x, int y, int width, int height, Graphics graphics) {


    if (width > 3) {
      graphics.setColor(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
      graphics.fillRect(x + (width / 3), y + (height / 3), width / 3, width / 3);

      drawCarpet(x, y, width / 3, width / 3, graphics);
      drawCarpet(x, y + (height / 3), width / 3, width / 3, graphics);
      drawCarpet(x, y + (2 * (height / 3)), width / 3, width / 3, graphics);
      drawCarpet(x + (width / 3), y, width / 3, width / 3, graphics);
      drawCarpet(x + (2 * (width / 3)), y, width / 3, width / 3, graphics);
      drawCarpet(x + (2 * (width / 3)), y + (height / 3), width / 3, width / 3, graphics);
      drawCarpet(x + (2 * (width / 3)), y + (2 * (height / 3)), width / 3, width / 3, graphics);
      drawCarpet(x + (width / 3), y + (2 * (height / 3)), width / 3, width / 3, graphics);
    }

  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setBackground(Color.BLACK);
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

