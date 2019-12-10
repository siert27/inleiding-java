package h02;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {setBackground(Color.magenta);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {g.setColor(Color.yellow);
        g.drawString("hallo ik ben siert", 20, 30 );
    }

}
