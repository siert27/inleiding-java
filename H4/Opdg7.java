package H4;

import java.awt.*;
import java.applet.*;

public class Opdg7 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
      g.setColor(Color.gray);
      g.drawRoundRect(50,30,300,250,20,20);
        g.setColor(Color.black);
        g.fillArc(110,80,40,40,0,360);
        g.setColor(Color.black);
        g.fillArc(110,200,40,40,0,360);
        g.setColor(Color.black);
        g.fillArc(250,80,40,40,0,360);
        g.setColor(Color.black);
        g.fillArc(250,200,40,40,0,360);


}
         }
