import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PR18 extends Applet implements MouseListener {

    public void init() {
        addMouseListener(this);   // ✔ Correct method
    }

    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse Clicked");
        setBackground(Color.RED);
    }

    public void mousePressed(MouseEvent e) {
        showStatus("Mouse Pressed");
        setBackground(Color.GREEN);
    }

    public void mouseReleased(MouseEvent e) {
        showStatus("Mouse Released");
        setBackground(Color.BLUE);
    }

    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse Entered");
        setBackground(Color.BLACK);
    }

    public void mouseExited(MouseEvent e) {
        showStatus("Mouse Exited");
        setBackground(Color.YELLOW);
    }
}
