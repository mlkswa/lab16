import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public static void main(String[] args){
        JFrame frame = new JFrame("My drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(500,500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint (Graphics g){

        g.drawRect(60,150,150,150);
        g.drawLine(35, 175, 135, 75);
        g.drawLine(235, 175, 135, 75);
        g.drawRect(80,210,50,50);
        g.drawOval(300, 50, 170, 220);
        g.drawLine(375, 270, 375, 300);
        g.drawLine(395, 270, 395, 300);
        g.drawLine(50, 300, 450, 300);
        g.drawLine(160, 100, 160, 80);
        g.drawLine(175, 115, 175, 80);
        g.drawLine(160, 80, 175, 80);


    }
}