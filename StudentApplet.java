import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class StudentApplet extends Applet implements ActionListener {

    TextField t1, t2, t3;
    Label l;
    Button b;

    public void init() {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Roll No"));
        t2 = new TextField(10);
        add(t2);

        add(new Label("Marks"));
        t3 = new TextField(10);
        add(t3);

        b = new Button("Average");
        add(b);

        l = new Label("Average = ");
        add(l);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int m = Integer.parseInt(t3.getText());
        l.setText("Average = " + m);
    }
}
