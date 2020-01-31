package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdg2h12 extends Applet {


    Button knoppen[];

    public void init() {

        knoppen = new Button[26];
        for (int teller = 1; teller < knoppen.length; teller++) {


            knoppen[teller] = new Button("" + teller);
            add(knoppen[teller]);


        }


    }
}