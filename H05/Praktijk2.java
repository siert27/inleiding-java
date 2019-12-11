package H4;

import java.awt.*;
import java.applet.*;

public class Praktijk2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRoundRect(50, 230, 100, 50, 20, 20);
        g.setColor(Color.red);
        g.drawRect(50,150,100, 50);
        g.setColor(Color.magenta);
        g.fillRect(200,150,100,50);
        g.fillOval(170,230,150,50);
        g.setColor(Color.blue);
        g.drawOval(200,150,100,50);
        g.setColor(Color.pink);
        g.drawArc(325,230,50,50,0,360);
        g.setColor(Color.magenta);
        g.fillArc(180, 90, 100, 50, 90, 45);
        g.setColor(Color.green);
        g.drawOval(180,90,100,50);





    }

}