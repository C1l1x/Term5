/*
Да се напише програма която позволява интерактивно създаване на сцена,
съдържаща произволен брой елипси, задавани с посочването на 3 точки с
ляв бутон на мишката – център, радиус по X и по Y и отсечки, определени
по начална и крайна точка, задавани с ляв бутон на мишката. Да се
реализира операция изтриване на обект (с десен бутон на мишката или
комбинация Ctrl+ляв бутон в близост до 3 пиксела около линия на обекта).
Получената сцена да се съхранява и чете от файл. File/New да изчиства
създаденото изображение, като предложи съхраняване, ако такова не е
извършено.
*/

package Practicum_OOP.Kursova;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OOP_Kursova_216285 extends Frame implements MouseListener {
    int r, x[] = new int[100], y[] = new int[100], n = 0;
    boolean flag = true;

    OOP_Kursova_216285(){
        super("Kursova_216282");
        setSize(1000, 700);
        setLocation(300, 100);
        addWindowListener(new WindowClosingAdapter(true));
        addMouseListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        
    }

    @Override
    public void paint(Graphics g) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && n < 100) {
            x[n] = e.getX();
            y[n] = e.getY();
            n++;
        }
        repaint();
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    
    
}
