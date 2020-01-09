package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdg1en2H10 extends Applet {

    int laagsteGetal;
    int hoogsteGetal;
    TextField tekstvak;
    int aantalGetallen=0;

    public void init() {
        TextField tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());

        Label label = new Label("geef u getal en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(hoogsteGetal), 50, 45);
        g.drawString(String.valueOf(laagsteGetal), 50, 70);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int nieuweInput = Integer.parseInt(tekstvak.getText());
            aantalGetallen++;

            bepaalHetHoogsteInputGetal(nieuweInput);

            bepaalHetLaagsteInputGetal(nieuweInput);

        }


        private void bepaalHetLaagsteInputGetal(int nieuweInput) {
            if (nieuweInput < laagsteGetal | aantalGetallen==1 ) {
                laagsteGetal = nieuweInput;
                System.out.println("Het hoogste getal is: " + laagsteGetal);
                repaint();
            }
        }

        private void bepaalHetHoogsteInputGetal(int nieuweInput) {
            if (nieuweInput > hoogsteGetal | aantalGetallen==1) {
                hoogsteGetal = nieuweInput;
                System.out.println("Het hoogste getal is: " + hoogsteGetal);
                repaint();
            }
        }

    }
}