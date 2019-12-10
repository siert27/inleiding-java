package H4;

import java.awt.*;
import java.applet.*;

public class Opdg4 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {

        g.drawRect(60, 50, 275, 200);
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

        g.drawString("0KG",20,255);
        g.drawString("10KG",20 ,235);
        g.drawString("20KG",20 ,215);
        g.drawString("30KG",20 ,195);
        g.drawString("40KG",20 ,175);
        g.drawString("50KG",20 ,155);
        g.drawString("60KG",20 ,135);
        g.drawString("70KG",20 ,115);
        g.drawString("80KG",20 ,95);
        g.drawString("90KG",20 ,75);
        g.drawString("100KG",15 ,55);

        g.fillRect(120, 171, 30, 80);
        g.fillRect(180, 90, 30, 160);
        g.fillRect(240, 50, 30, 200);

        g.drawString("Valarie",120,270);
        g.drawString("jeroen",180,270);
        g.drawString("hans",240,270);

      }
}
