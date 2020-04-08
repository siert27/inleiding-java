package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdg1H13 extends Applet{

    public void init(){

    }


        void teken3Hoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

            g.drawLine(x1,y1,x2,y2);
            g.drawLine(x2,y2,x3,y3);
            g.drawLine(x3,y3,x1,y1)   ;    }
                public void paint(Graphics g){
        teken3Hoek(g,100,150,150,150,125,100);


    }

}