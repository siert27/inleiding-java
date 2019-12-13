package H06;

import java.awt.*;
import java.applet.*;

public class PraktijkH6 extends Applet {
    double a, b, c, d;
    double plus;
    double uitkomst;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        plus = a + b + c;
        uitkomst = plus / d ;
        uitkomst = uitkomst * 10;

        uitkomst = (int) uitkomst;
        uitkomst /= 10;

    }

    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}