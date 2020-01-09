package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Calendar;

public class Opdg3en4H10 extends Applet {

    int maandNummer;
    TextField tekstvak;
    int aantalDagen;
    String maandNaam="Maandnaam";

    public void init() {
        tekstvak = new TextField("", 20);

        tekstvak.addActionListener(new VakListener());
        Label label = new Label("kies een getal van 1 tot en met 12");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(maandNaam), 50, 45);
        g.drawString(String.valueOf(aantalDagen), 50, 70);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maandNummer = Integer.parseInt(tekstvak.getText());

            bepaalAantalDagenVanDeMaandEnDeMaandNaam(maandNummer);
        }


        private void bepaalAantalDagenVanDeMaandEnDeMaandNaam(int nummer) {
            switch(nummer) {
                case 1:
                    maandNaam = "Januari";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 2:
                    maandNaam = "Februari";
                    aantalDagen = bepaalOfSchrikkeljaar();
                    repaint();
                    break;
                case 3:
                    maandNaam = "maart";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 4:
                    maandNaam = "april";
                    aantalDagen = 30;
                    repaint();
                    break;
                case 5:
                    maandNaam = "mei";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 6:
                    maandNaam = "juni";
                    aantalDagen = 30;
                    repaint();
                    break;
                case 7:
                    maandNaam = "juli";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 8:
                    maandNaam = "augustus";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 9:
                    maandNaam = "september";
                    aantalDagen = 30;
                    repaint();
                    break;
                case 10:
                    maandNaam = "oktobor";
                    aantalDagen = 31;
                    repaint();
                    break;
                case 11:
                    maandNaam = "november";
                    aantalDagen = 30;
                    repaint();
                    break;
                case 12:
                    maandNaam = "december";
                    aantalDagen = 31;
                    repaint();
                    break;
                default:
                    maandNaam = "Foute input";
                    aantalDagen = 0;
                    System.out.println("Foute input");
                    repaint();
            }
        }

        private int bepaalOfSchrikkeljaar() {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            if ( year % 4 == 0) {
                return 29;
            }
            return 28;
        }
    }
}