package H4;

import java.awt.*;
import java.applet.*;
        //alle ints
public class Opd2h5 extends Applet {

    int hoogteValerie;
    int yValerie;
    int hoogteJeroen;
    int yJeroen;
    int hoogteHans;
    int yHans;

        //variable
    public void init() {
        hoogteValerie = 50;
        yValerie = 250 - hoogteValerie;
        hoogteJeroen = 180;
        yJeroen = 250 - hoogteJeroen;
        hoogteHans = 200;
        yHans = 250 - hoogteHans;

    }
    public void paint(Graphics g) {

        // Tekenen van het assenstelsel
        g.drawRect(60, 50, 275, 200);

        // Tekenen kleine streepjes langs de assen
        g.drawLine(50, 250, 80, 250);
        g.drawLine(55, 230, 60, 230);
        g.drawLine(55, 210, 60, 210);
        g.drawLine(55, 190, 60, 190);
        g.drawLine(55, 170, 60, 170);
        g.drawLine(55, 150, 60, 150);
        g.drawLine(55, 130, 60, 130);
        g.drawLine(55, 110, 60, 110);
        g.drawLine(55, 90, 60, 90);
        g.drawLine(55, 70, 60, 70);
        g.drawLine(55, 50, 60, 50);

        // Eenheden langs de assen
        g.drawString("0KG",20,255);
        g.drawString("20KG",20 ,235);
        g.drawString("40KG",20 ,215);
        g.drawString("60KG",20 ,195);
        g.drawString("80KG",20 ,175);
        g.drawString("100KG",20 ,155);
        g.drawString("120KG",20 ,135);
        g.drawString("140KG",20 ,115);
        g.drawString("160KG",20 ,95);
        g.drawString("180KG",20 ,75);
        g.drawString("200KG",15 ,55);

                //de gevulde balken
        g.fillRect(120, yValerie, 30, hoogteValerie);
        g.fillRect(180, yJeroen, 30, hoogteJeroen);
        g.fillRect(240, yHans, 30, hoogteHans);
                //namen onder Xas
        g.drawString("Valarie",120,270);
        g.drawString("jeroen",180,270);
        g.drawString("hans",240,270);

    }
}
