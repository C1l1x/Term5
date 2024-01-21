/*
В един текстов файл са зададени данни за N намиращи се един в
друг квадрата, чиито долен ляв връх съвпада. На първия ред е число,
указващо броя на фигурите.  На втория ред са данните X и Y за всеки един
от 4-те върха (като разделител служи интервал). В следващите редове,
подредени в намаляващ ред по размера на фигурата, са X и Y координатите
на различаващите се 3 върха (по 1 фигура (3 върха) на ред). Да се
състави Application на Java за прочитане на този файл и за графично
представяне на квадратите, всеки с различен цвят.
*/

package Java.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class zadacha1_18 extends Frame {
        
        private int rect;
        private int x[] = new int[rect], y[] = new int[rect];

    zadacha1_18() throws FileNotFoundException {
        super("Пример за графика");
        setSize(600, 400);
        setLocation(200, 100);
        setBackground(Color.WHITE);
        addWindowListener(new WindowClosingAdapter(true));
        setVisible(true);

        Scanner reader = null;
        reader=new Scanner(new File("data.txt"));
        rect = reader.nextInt();
        
        x = new int[rect];
        y = new int[rect];
        
        for (int i = 0; i < rect; i++) {
            x[i] = reader.nextInt();
            y[i] = reader.nextInt();
        }
        reader.close();
        repaint();
    }

    public static void main(String[] args){
        try {
            zadacha1_18 win = new zadacha1_18();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
    }
    public void paint(Graphics g) {
        Random rand = new Random();
        int x_size = 100, y_size = 100;
        for (int i = 0; i < rect; i++) {
            float red = rand.nextFloat(), green = rand.nextFloat(), blue = rand.nextFloat();
            Color getColor = new Color(red, green, blue);
            g.setColor(getColor);
            g.fillRect(x[i], y[i], x_size, y_size);
            x_size += 25; y_size += 25;
        }
    }

}