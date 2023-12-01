/*
Да се състави Applet или Application на Java, имащ следната функционалност:
	- дава възможност за поставяне на 3 точки с помощта на мишката (щракване с левия бутон, точката е окръжност
с радиус 5 пискела).
	- при следващо щракване с мишката изчертава триъгълник с върхове трите точки, ако те не се пропокриват.
*/


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class kursova_2 extends Frame implements MouseListener {
    int r = 5, n = 0, x[] = new int[3], y[] = new int[3];
    boolean flag = true;

    kursova_2() {
        super("Изчертаване на триъгълник.");
        setSize(600, 400);
        setLocation(200, 100);
        setBackground(Color.WHITE);
        addWindowListener(new WindowClosingAdapter(true));
        addMouseListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        kursova_2 win = new kursova_2();
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.red);
        for (int i = 0; i < 3; i++) {
            g.fillOval(x[i] - r, y[i] - r, 2 * r, 2 * r);
        }
        if (n >= 4) {
            g.setColor(Color.blue);
            g.fillPolygon(x, y, 3);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && n < 3) {
            x[n] = e.getX();
            y[n] = e.getY();
            n++;
        } else if (e.getButton() == MouseEvent.BUTTON1 && n == 3) {
            n++;
        }
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
