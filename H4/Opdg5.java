package H4;

import java.awt.*;
import java.applet.*;

public class Opdg5 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.fillRect(0, 0, 450, 350);

        g.setColor(Color.yellow);
        g.fillArc(120,80,150,150,0,360);

      }
}
