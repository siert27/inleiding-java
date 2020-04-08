package H13;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class PraktijkH13 extends Applet {


    public void init() {


        setSize(500, 500);

    }

    public void paint(Graphics g) {

        drawTree(g);

    }

    public void drawTree(Graphics g) {

        Color Brown = new Color(52, 14, 0, 254);
        Color green = Color.green;
        Color treeTrunk = Brown;


        int leaveSize = 120;
        int x = 5;
        int y = 50;
        int hoogte = 120;
        int breedte = 50;
        int treeTrunkx = 40;
        int treeTrunky = 110;


        for (int forestCount = 0; forestCount < 2; forestCount++) {
        }

            for (int rowcount = 0; rowcount < 5; rowcount++) {

                g.setColor(treeTrunk);
                g.fillRect(treeTrunkx, treeTrunky, breedte, hoogte);
                g.setColor(green);
                g.fillOval(x,y,leaveSize, leaveSize);

                x += leaveSize;
                treeTrunkx += leaveSize;
                y += 30;

            }


        }

    }







