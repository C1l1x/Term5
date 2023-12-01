/*
    В един текстов файл са зададени координатите на точки. На първия ред е число, показващо броя на точките, а на следващите редове - X и Y
координатите на една точка (в един ред са данните за  една точка). Като разделител служи интервал. Да се състави Application на Java
за прочитане на този файл и за графично представяне на точките. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

public class kursova_1 extends Frame {
        
        private int points, r = 5;
        // System.out.println(points);
        private int x[] = new int[points], y[] = new int[points];

    kursova_1() throws FileNotFoundException {
        super("Пример за графика");
        setSize(600, 400);
        setLocation(200, 100);
        setBackground(Color.WHITE);
        addWindowListener(new WindowClosingAdapter(true));
        setVisible(true);

        Scanner reader = null;
        reader=new Scanner(new File("File.txt"));
        points = reader.nextInt();
        
        x = new int[points];
        y = new int[points];
        
        for (int i = 0; i < points; i++) {
            x[i] = reader.nextInt();
            y[i] = reader.nextInt();
        }
        reader.close();
        repaint();
    }

    public static void main(String[] args){
        try {
            kursova_1 win = new kursova_1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; i < points; i++) {
            g.fillOval(x[i] - r, y[i] - r, 2 * r, 2 * r);
        }
    }

}