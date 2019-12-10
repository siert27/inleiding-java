package H4;

import java.awt.*;
import java.applet.*;

public class Opdg6 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(160,60,70,150);
        g.setColor(Color.yellow);
        g.fillArc(110,80,40,40,0,360);
        g.setColor(Color.green);
        g.fillArc(175,65,40,40,0,360);
        g.setColor(Color.red);
        g.fillArc(175,155,40,40,0,360);
        g.setColor(Color.BLACK);
        g.fillRect(185 ,210,20,100);


               }
}
