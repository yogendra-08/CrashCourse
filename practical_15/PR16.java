import java.applet.Applet;
import java.awt.*;

public class PR16 extends Applet {
    public void paint(Graphics g)
    {
        String s1 = getParameter("Fullname");
        String s2 = getParameter("branch");

        g.drawString("FFullName: " + s1, 20, 20);
        g.drawString("Branch: " + s2, 20, 40);
    }
}
