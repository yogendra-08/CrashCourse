import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Applet implements KeyListener {
    Label label;
    TextField text;

    public void init() {
        setLayout(null);               // correct method name and case

        label = new Label("Press any key:");
        label.setBounds(20, 20, 200, 25);   // correct method call syntax
        add(label);

        text = new TextField();
        text.setBounds(20, 60, 200, 25);
        add(text);

        text.addKeyListener(this);    // register listener on text field
        text.requestFocus();          // give focus so it receives key events
    }

    // required by KeyListener
    public void keyTyped(KeyEvent e) {
        // we don't need this but must implement it
    }

    public void keyPressed(KeyEvent e) {
        // show the pressed key char (if printable)
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }
}
