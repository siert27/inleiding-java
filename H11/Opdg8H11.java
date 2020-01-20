package H11;

import java.awt.*;
import java.applet.*;


public class Opdg8H11 extends Applet {

    static int totalRowAmount = 8;


    public void paint(Graphics g)
    {
        int x, y;
        for (int rowCounter = 0; rowCounter < totalRowAmount; rowCounter++) {

            for (int columnCounter = 0; columnCounter < totalRowAmount; columnCounter++) {

                x = rowCounter * 20;

                y = columnCounter * 20;

                if ((rowCounter % 2 == 0) == (columnCounter % 2 == 0))
                    g.setColor(Color.black);
                else
                    g.setColor(Color.white);

                g.fillRect(x, y, 20, 20);
            }
        }
    }
}