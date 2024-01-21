/*
Да се състави или Application на Java, имащ следната
функционалност:
- дава възможност за поставяне на точки с помощта на мишката (щракване с
левия бутон, точката е окръжност с радиус 5 пиксела). Точките трябва да
могат да се поставят само ако въпросната малка окръжност (точката) се
съдържа изцяло в някой от четирите квадранта. Във всеки квадрант точката
се изчертава с отделен цвят.
*/

package Java.practice;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class zadacha2_18 extends Frame implements MouseListener {
    int r = 5, n = 0, x[] = new int[100], y[] = new int[100];
    boolean flag = true;

    zadacha2_18() {
        super("Изчертаване на триъгълник.");
        setSize(600, 400);
        setLocation(200, 100);
        setBackground(Color.WHITE);
        addWindowListener(new WindowClosingAdapter(true));
        addMouseListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        zadacha2_18 win = new zadacha2_18();
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.red);
        for (int i = 0; i < 100; i++) {
            g.fillOval(x[i] - r, y[i] - r, 2 * r, 2 * r);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && n < 100) {
            x[n] = e.getX();
            y[n] = e.getY();
            n++;
        } else if (e.getButton() == MouseEvent.BUTTON1 && n == 100) {
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
