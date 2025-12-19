import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PR19Q1 extends Applet {

    Label l1, l2, l3, l4, l5, l6, l7;
    TextField t1, t2, t3, t4, t5;
    CheckboxGroup chg;
    Checkbox male, female;
    Choice country;

    public void init() {
        setLayout(null);
        setBackground(Color.cyan);

        Font bold = new Font("Arial", Font.BOLD, 14);

        l1 = new Label("Emp Name:");
        l1.setFont(bold);
        l1.setBounds(30, 40, 120, 25);
        add(l1);

        t1 = new TextField(20);
        t1.setBounds(160, 40, 200, 25);
        add(t1);

        l2 = new Label("Father Name:");
        l2.setFont(bold);
        l2.setBounds(30, 90, 120, 25);
        add(l2);

        t2 = new TextField(20);
        t2.setBounds(160, 90, 200, 25);
        add(t2);

        l3 = new Label("Date of Birth:");
        l3.setFont(bold);
        l3.setBounds(30, 140, 120, 25);
        add(l3);

        t3 = new TextField("DD/MM/YYYY");
        t3.setBounds(160, 140, 200, 25);
        add(t3);

        l4 = new Label("Sex:");
        l4.setFont(bold);
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        chg = new CheckboxGroup();
        male = new Checkbox("Male", chg, false);
        female = new Checkbox("Female", chg, false);

        male.setFont(bold);
        female.setFont(bold);

        male.setBounds(160, 190, 100, 25);
        female.setBounds(260, 190, 100, 25);

        add(male);
        add(female);

        l5 = new Label("Address:");
        l5.setFont(bold);
        l5.setBounds(30, 240, 120, 25);
        add(l5);

        t4 = new TextField(20);
        t4.setBounds(160, 240, 200, 25);
        add(t4);

        l6 = new Label("Country:");
        l6.setFont(bold);
        l6.setBounds(30, 290, 120, 25);
        add(l6);

        country = new Choice();
        country.setFont(bold);
        country.add("India");
        country.add("USA");
        country.add("UK");
        country.add("Canada");
        country.add("Australia");
        country.setBounds(160, 290, 150, 25);
        add(country);

        l7 = new Label("Mobile No:");
        l7.setFont(bold);
        l7.setBounds(30, 340, 120, 25);
        add(l7);

        t5 = new TextField(20);
        t5.setBounds(160, 340, 200, 25);
        add(t5);
    }
}
