package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdg2H13 extends Applet {

    public void init() {

        setSize(400,400);

    }
    void DrawMuur(Graphics g, int x1, int y1, int breete, int hoogte){

        int baksteen;
        boolean rij2 = false;

        for (baksteen = 0; baksteen < 5; baksteen++ ){
            g.setColor(Color.red);
            g.fillRect(x1, y1, breete, hoogte);
            g.setColor(Color.black);
            g.drawRect(x1, y1, breete, hoogte);
            x1  += breete;
        }
        if (baksteen == 5){
            rij2 = true;
        }
        if (rij2){
            for (int muurteller = 0; muurteller < 5; muurteller++) {
                x1 = 20;
                y1 += hoogte;
                for (baksteen = 0; baksteen < 5; baksteen++) {

                    g.setColor(Color.red);
                    g.fillRect(x1, y1, breete, hoogte);
                    g.setColor(Color.black);
                    g.drawRect(x1, y1, breete, hoogte);
                    x1 += breete;
                }
            }

        }


    }

    public void paint(Graphics g) {
        DrawMuur(g,20,50,100,50);

    }
}