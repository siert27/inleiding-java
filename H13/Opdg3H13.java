package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdg3H13 extends Applet {

    Button BetonBlok, baksteen;
    TextField Hoogte, Breedte;
    private Boolean GrijzeMuur, RodeMuur;
    int hoogte, breedte;

    public void init() {
        GrijzeMuur = false;
        RodeMuur = false;
        setSize(500, 800);

        BetonBlok = new Button("Betonen muur");
        baksteen = new Button("Stenen muur");
        BetonBlok.addActionListener(new BetonListener());
        baksteen.addActionListener(new RoodsteenListener());
        add(BetonBlok);
        add(baksteen);


        Hoogte = new TextField("hoogte", 20);
        Breedte = new TextField("breedte", 20);
        add(Hoogte);
        add(Breedte);
    }
    public void paint(Graphics g) {
        if (RodeMuur) {
            roodsteen(g, hoogte, breedte);
        }
        if (GrijzeMuur) {
            beton(g, hoogte, breedte);
        }
        g.drawString("gebruik hoogte = 75 en breedte = 100",50,80);
    }
    public class BetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hoogte = Integer.parseInt(Hoogte.getText());
            breedte = Integer.parseInt(Breedte.getText());
            GrijzeMuur = true;
            RodeMuur = false;
            repaint();
        }
    }
    public class RoodsteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hoogte = Integer.parseInt(Hoogte.getText());
            breedte = Integer.parseInt(Breedte.getText());
            GrijzeMuur = false;
            RodeMuur = true;
            repaint();
        }
    }
    void roodsteen(Graphics g, int hoogte, int breedte) {
        int teller = 0;
        int x, y = 40, breette = 50, hoog = 25, breedteEind = 25, beginX;
        Color zwart = Color.BLACK;
        Color rood = Color.RED;
        for (teller = 0; teller < hoogte; teller++) {
            x = 50;
            beginX = breedte + breedteEind;
            // Even rijen
            if (teller % 2 == 0) {
                for (int i = 0; i < breedte; i++) {
                    if (i == 0 || i == breedte - 1) {
                        g.setColor(zwart);
                        g.drawRect(beginX, y, breedteEind, hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX + 1, y + 1, breedteEind - 1, hoogte - 1);
                        beginX = breette * breedte;
                    }
                    else {
                        g.setColor(zwart);
                        g.drawRect(x, y, breette, hoogte);
                        g.setColor(rood);
                        g.fillRect(x + 1, y + 1, breette - 1, hoogte - 1);
                    }
                    x += breette;
                }
            } else {
                x = breedte + breedteEind;
                for (int i = 0; i < breette - 1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x, y, breedte, hoogte);
                    g.setColor(rood);
                    g.fillRect(x + 1, y + 1, breedte - 1, hoogte - 1);
                    x += breedte;
                }
            }
            y += hoog;
        }
    }
    private void beton(Graphics g, int hoogte, int breedte){
        int teller = 0;
        int x, y = 40, breette = 100, hoog = 50, breedteEind = 25, beginX;
        Color zwart = Color.BLACK;
        Color grijs = Color.GRAY;
        for (teller = 0; teller < hoogte; teller++) {
            x = 50;
            beginX = breedte + breedteEind;
            if (teller % 2 == 0) {
                for (int i = 0; i < breedte; i++) {
                    if (i == 0 || i == breedte - 1) {
                        g.setColor(zwart);
                        g.drawRect(beginX, y, breedteEind, hoogte);
                        g.setColor(grijs);
                        g.fillRect(beginX + 1, y + 1, breedteEind - 1, hoogte - 1);
                        beginX = breette * breedte;
                    }
                    else {
                        g.setColor(zwart);
                        g.drawRect(x, y, breette, hoogte);
                        g.setColor(grijs);
                        g.fillRect(x + 1, y + 1, breette - 1, hoogte - 1);
                    }
                    x += breette;
                }
            } else {
                x = breedte + breedteEind;
                for (int i = 0; i < breette - 1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x, y, breedte, hoogte);
                    g.setColor(grijs);
                    g.fillRect(x + 1, y + 1, breedte - 1, hoogte - 1);
                    x += breedte;
                }
            }
            y += hoog;
        }
    }
}