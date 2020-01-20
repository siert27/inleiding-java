package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {

    int tafels;
    TextField tekstvak;
    String tafel ="voer een cijfer van 1 tot 10 krijg de tafel";

    public void init() {
        tekstvak = new TextField("", 20);

        tekstvak.addActionListener(new VakListener());
        Label label = new Label("voer u cijfer in");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(tafel), 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafels = Integer.parseInt(tekstvak.getText());

            tafelVan1Tot10(tafels);
        }


        private void tafelVan1Tot10(int nummer) {
            switch(nummer) {
                case 1:
                    tafel = "1*1=1  2*1=2  3*1=3  4*1=4  5*1=5  6*1=6  7*1=7  8*1=8  9*1=9  10*1=10";
                    repaint();
                    break;
                case 2:
                    tafel = "1*2=2  2*2=4  3*2=6  4*2=8  5*2=10  6*2=12  7*2=14  8*2=16  9*2=18  10*2=20";
                    repaint();
                    break;
                case 3:
                    tafel = "1*3=3  2*3=6  3*3=9  4*3=12  5*3=15  6*3=18  7*3=21  8*3=24  9*3=27  10*3=10";
                    repaint();
                    break;
                case 4:
                    tafel = "1*4=4  2*4=8  3*4=12 4*4=16  5*4=20  6*4=24  7*4=28  8*4=32  9*4=36  10*4=40";
                    repaint();
                    break;
                case 5:
                    tafel = "1*5=5  2*5=10  3*5=15 4*5=20 5*5=25  6*5=30  7*5=35  8*5=40  9*5=45  10*5=50";
                    repaint();
                    break;
                case 6:
                    tafel = "1*6=6  2*6=12  3*6=18 4*6=24 5*6=30  6*6=36  7*6=42  8*6=48  9*6=54  10*6=60";
                    repaint();
                    break;
                case 7:
                    tafel = "1*7=7  2*7=14  3*7=21 4*7=28 5*7=35  6*7=42  7*7=49  8*7=56  9*7=63  10*7=70";
                    repaint();
                    break;
                case 8:
                    tafel = "1*8=8  2*8=16  3*8=24 4*8=32 5*8=40  6*8=48  7*8=56  8*8=64  9*8=72  10*8=80";
                    repaint();
                    break;
                case 9:
                    tafel = "1*9=9  2*9=18  3*9=27 4*9=36 5*9=45  6*9=54  7*9=63  8*9=72  9*9=81  10*9=90";
                    repaint();
                    break;
                case 10:
                    tafel = "1*10=10  2*10=20  3*10=30 4*10=40 5*10=50  6*10=60  7*10=70  8*10=80  9*10=90  10*10=100";
                    repaint();
                    break;
                default:
                    tafel = "Foute input";
                    System.out.println("Foute input");
                    repaint();
            }
        }

    }

}
