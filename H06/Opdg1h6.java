package H06;

import java.awt.*;
import java.applet.*;

public class Opdg1h6 extends Applet {
    int totaal;
    int aantalPersonen;
    double uitkomst;

    public void init () {
        totaal = 113;
        aantalPersonen = 4;
        uitkomst = (double) totaal / aantalPersonen;
    }
    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}