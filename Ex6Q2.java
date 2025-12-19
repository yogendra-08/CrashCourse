import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Ex6Q2" width="400" height="400">
    <param name="num1" value="10">
    <param name="num2" value="20">
</applet>
*/

public class Ex6Q2 extends Applet {

    int num1, num2;

    public void init() {
        num1 = Integer.parseInt(getParameter("num1"));
        num2 = Integer.parseInt(getParameter("num2"));
    }

    public void paint(Graphics g) {
        g.drawString("Num1 : " + num1, 20, 40);
        g.drawString("Num2 : " + num2, 20, 60);
        g.drawString("Sum : " + (num1 + num2), 20, 80);
        g.drawString("Difference : " + (num1 - num2), 20, 100);
        g.drawString("Product : " + (num1 * num2), 20, 120);
    }
}
