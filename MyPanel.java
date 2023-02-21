// ZEYNEP CINDEMIR - 201401012
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private final String number;
    private int xCoord;
    private int yCoord;

    public MyPanel(String n, int x, int y) {
        this.number = n;
        this.xCoord = x;
        this.yCoord = y;
    }

    public void paint(Graphics g) {
        for (int i = number.length() - 1; i >= 0; i--, xCoord -= 30) {
            switch (number.charAt(i)) {
                case '1' -> g.drawLine(xCoord + 5, yCoord, xCoord + 5, yCoord + 30);
                case '2' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 15); // SAG & UST
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord - 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord - 10, yCoord + 15, xCoord - 10, yCoord + 30); // SOL & ALT
                    g.drawLine(xCoord - 10, yCoord + 30, xCoord + 10, yCoord + 30); // ALT
                }
                case '3' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord - 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                }
                case '4' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 15); // SOL
                    g.drawLine(xCoord - 10, yCoord + 15, xCoord + 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                }
                case '5' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 15); // SOL
                    g.drawLine(xCoord - 10, yCoord + 15, xCoord + 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                }
                case '6' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 30); // SOL
                    g.drawLine(xCoord - 10, yCoord + 15, xCoord + 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord - 10, yCoord + 30, xCoord + 10, yCoord + 30); // ALT
                }
                case '7' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                }
                case '8' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord - 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 30); // SOL
                }
                case '9' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord - 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 15); // SOL
                }
                case '0' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord, xCoord + 10, yCoord + 30); // SAG
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 30); // SOL
                }
                case '.' -> {
                    xCoord += 15;
                    g.drawOval(xCoord - 10, yCoord + 28, 4, 4);
                    g.fillOval(xCoord - 10, yCoord + 28, 4, 4);
                }
                case '-' -> {
                    g.drawLine(xCoord, yCoord + 15, xCoord + 10, yCoord + 15);
                }
                case 'E' -> {
                    g.drawLine(xCoord - 10, yCoord, xCoord + 10, yCoord); // UST
                    g.drawLine(xCoord + 10, yCoord + 30, xCoord - 10, yCoord + 30); // ALT
                    g.drawLine(xCoord + 10, yCoord + 15, xCoord - 10, yCoord + 15); // ORTA
                    g.drawLine(xCoord - 10, yCoord, xCoord - 10, yCoord + 30); // SOL
                }
            }
        }
    }

    public void repaint() {
        super.repaint();
    }
}
