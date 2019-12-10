package H4;

import java.awt.*;
import java.applet.*;

public class Opdg3 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(80, 20, 200, 50);
        g.setColor(Color.white);
        g.fillRect(80, 70, 200, 50);
        g.setColor(Color.blue);
        g.fillRect(80, 120, 200, 50);
        g.setColor(Color.BLACK);
        g.fillRect(60, 20, 20, 300);
      }
}
