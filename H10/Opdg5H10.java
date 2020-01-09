package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdg5H10 extends Applet {

    int OnvoldoendeOfVoldoende;
    TextField tekstvak;
    String cijfer ="voldoende of onvoldoende";

    public void init() {
        tekstvak = new TextField("", 20);

        tekstvak.addActionListener(new VakListener());
        Label label = new Label("voer u cijfer in");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(cijfer), 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            OnvoldoendeOfVoldoende = Integer.parseInt(tekstvak.getText());

            bepaalOfCijferVoldoendeIs(OnvoldoendeOfVoldoende);
        }


        private void bepaalOfCijferVoldoendeIs(int nummer) {
            switch(nummer) {
                case 1:
                case 2:
                case 5:
                case 4:
                case 3:
                    cijfer = "onvoldoende";
                    repaint();
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    cijfer = "voldoende";
                    repaint();
                    break;
                default:
                    cijfer = "Foute input";
                    System.out.println("Foute input");
                    repaint();
            }
        }

            }

        }

