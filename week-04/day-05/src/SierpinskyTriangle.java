import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyTriangle {
  public static void mainDraw(Graphics graphics) {

    drawTriangle(10,10, 729, (int)(729 * (0.866)), graphics);

  }

  public static void drawTriangle(int x, int y, int width, int height, Graphics graphics) {


    if (width > 3) {
      graphics.setColor(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
      graphics.drawLine(x, y, x + width, y);
      graphics.drawLine(x + width, y, x + (width / 2), y + height);
      graphics.drawLine(x + (width / 2),  y + height, x, y);

      drawTriangle(x, y, (width / 2), (height / 2), graphics);
      drawTriangle((x + (width / 2)), y, (width / 2), (height / 2), graphics);
      drawTriangle((x + (width / 4)), (y + (height / 2)), (width / 2), (height / 2), graphics);
    }

  }

  // Don't touch the code below
  static int WIDTH = 749;
  static int HEIGHT = 749;

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
