package H12;

import java.applet.Applet;
import java.awt.*;

public class opdg1h12 extends Applet {

    double cijfers[];
    double totaal;
    int berekenen;

    public void init() {
        cijfers = new double[10];
        cijfers[0] = 1.1;
        cijfers[1] = 2.9;
        cijfers[2] = 3.0;
        cijfers[3] = 4.8;
        cijfers[4] = 5.1;
        cijfers[5] = 6.5;
        cijfers[6] = 7.3;
        cijfers[7] = 8.7;
        cijfers[8] = 9.4;
        cijfers[9] = 10.0;
        for (berekenen = 0; berekenen < cijfers.length; berekenen++ ){
            totaal += cijfers[berekenen];
        }
        totaal /= berekenen;


    }

    public void paint(Graphics g) {
        for (int i = 0; i < cijfers.length ; i++) {
            g.drawString("" + cijfers[i],50,20 * i + 20);
            g.drawString("het gemmidelde is " + totaal,100,20 );

        }

    }
}