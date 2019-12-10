package H4;

import java.awt.*;
import java.applet.*;

public class Opdg2 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(50, 200, 270, 200);
        g.drawLine(50, 200, 50, 90);
        g.drawLine(270, 90, 270, 200);
        g.drawLine(50, 90, 270, 90);
        g.drawLine(50, 90, 170, 30);
        g.drawLine(170, 30, 270, 90);
        g.drawLine(150, 150, 180, 150);
        g.drawLine(150, 150, 150, 200);
        g.drawLine(180, 200, 180, 150);

        g.drawLine(210, 150, 250, 150);
        g.drawLine(210, 150, 210, 120);
        g.drawLine(210, 120, 250, 120);
        g.drawLine(250, 120, 250, 150);

    }
}
