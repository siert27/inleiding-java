package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class PraktijkOpdrachtH12 extends Applet {

    TextField input1, getallen;
    boolean stop;
    Button Knop;
    int aantal;

    String[] namen;

    public void init() {

        setSize(800,800);

        input1 = new TextField("typ naam", 20);
        getallen = new TextField("typ Telnummer",30);
        stop = false;

        add(input1);
        add(getallen);

        Knop = new Button("Ok");
        Knop.addActionListener(new Knoplistener());
        add(Knop);

        namen = new String[10];

        /* NullPointerException Fix */
        Arrays.fill(namen, "");
    }

    public void paint(Graphics g) {
        int y = 50;
        for (String namen : namen)
        {
            g.drawString(namen, 60, y+=15);
        }
    }

    public class Knoplistener implements ActionListener
    {
        String namen1, nummers1;
        public void actionPerformed(ActionEvent e)
        {

            namen1 = input1.getText().toLowerCase();
            nummers1 = getallen.getText();
            if (aantal < namen.length);
            {
                namen[aantal] = "Naam " + namen1 + "   Tel-nummer: " + nummers1;
                aantal++;
                System.out.println("Nummers toegevoegd "+ aantal);

                if (aantal == namen.length)
                {
                    stop = true;
                }
            }

            if (stop)
            {
                Arrays.sort(namen);
                repaint();
            }
            input1.setText("");
            getallen.setText("");
        }
    }
}