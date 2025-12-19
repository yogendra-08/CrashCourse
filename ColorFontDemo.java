import java.applet.Applet;
import java.awt.*;

public class ColorFontDemo extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Graphics", 50, 100);
    }
}
