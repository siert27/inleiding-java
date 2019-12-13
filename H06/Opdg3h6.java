package H06;

import java.awt.*;
import java.applet.*;

public class Opdg3h6 extends Applet {
    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 2147483647;
        b = 10;
        uitkomst = a + b;


    }

    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}