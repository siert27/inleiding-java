package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdg6H12 extends Applet {

    int[] cijfers = {1,1,3,2,23,23};
    TextField tekstvak;
    int userinput, Hoeveelheid;
    String tekst;

    public void init() {
        tekstvak = new TextField(20);

        tekstvak.addActionListener(new TekstVeldListener());

        add(tekstvak);

        tekst = "typ een gtal";

    }
    public class TekstVeldListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            userinput = Integer.parseInt(tekstvak.getText());
            for (int counter = 0; counter < cijfers.length; counter++) {
                if (cijfers[counter] == userinput)
                {
                    Hoeveelheid++;
                }
            }

            if (Hoeveelheid > 0)
            {
                tekst = "Het getal " + userinput + " staat " + Hoeveelheid + " keer in de tabel";
            }
            else
            {
                tekst = "Het getal " + userinput + " staat niet in de tabel";
            }
            repaint();

            Hoeveelheid = 0;
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst,20, 50);

    }
}