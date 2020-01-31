package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdg4h12 extends Applet
{

    int[] nummers = {5, 99, 67, 59, 82, 24, 42, 4, 72, 15};
    TextField tekstvak;
    Button OKKnop;
    String s, message;
    int userinput;

    public void init()
    {
        setSize(600,600);

        tekstvak = new TextField(20);
        OKKnop = new Button("Search");
        tekstvak.addActionListener(new Vaklistener());
        OKKnop.addActionListener(new Vaklistener());
        add(tekstvak);
        add(OKKnop);

        message = "Welk nummer wil je zoeken?";
    }
    public class Vaklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            s = tekstvak.getText();
            userinput = Integer.parseInt(s);
            for (int teller = 0; teller < nummers.length ; teller++)
            {
                if (userinput == nummers[teller])
                {
                    message = "Het Nummer " + userinput + " is gevonden op Index " + teller;
                    break;
                }
                else
                {
                    message = "Dit nummer staat niet in de index";
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.drawString(message,20,50);
    }
}