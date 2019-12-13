package H06;

import java.awt.*;
import java.applet.*;

public class Opdg2h6 extends Applet {
    int seconde;
    int minuut;
    int uur;
    int dag;
    int jaar;

    public void init () {
        seconde= 1;
        minuut=seconde*60;
        uur =minuut*60;
        dag = uur *24;
        jaar = dag*365;


    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uur, 20, 20);
        g.drawString("De uitkomst is: " + dag, 20, 50);
        g.drawString("De uitkomst is: " + jaar, 20, 80);

    }
}