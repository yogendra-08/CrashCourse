import java.applet.Applet;
import java.awt.*;

/* <applet code="Job.class" width="600" height="600"> </applet> */

public class PR19Q2 extends Applet {

    Label L, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    TextField tName, tAddress, tPhone, tEmail, tExpY, tExpM;
    CheckboxGroup chg;
    Checkbox male, female;
    Choice qualify, platform, dobMonth, dobDate, dobYear;
    Button b1;

    public void init() {
        setLayout(null);
        setBackground(Color.lightGray);

        // Title
        L = new Label("JOB Application");
        L.setBounds(200, 40, 150, 30);
        add(L);

        // Name
        l1 = new Label("Name:");
        l1.setBounds(50, 100, 100, 20);
        add(l1);

        tName = new TextField();
        tName.setBounds(180, 100, 200, 20);
        add(tName);

        // Address
        l2 = new Label("Address:");
        l2.setBounds(50, 140, 100, 20);
        add(l2);

        tAddress = new TextField();
        tAddress.setBounds(180, 140, 200, 20);
        add(tAddress);

        // Qualification
        l3 = new Label("Qualification:");
        l3.setBounds(50, 180, 100, 20);
        add(l3);

        qualify = new Choice();
        qualify.add("Select one");
        qualify.add("BE / B.Tech");
        qualify.add("BSc (IT)");
        qualify.add("Polytechnic");
        qualify.setBounds(180, 180, 200, 20);
        add(qualify);

        // Phone
        l4 = new Label("Phone Number:");
        l4.setBounds(50, 220, 120, 20);
        add(l4);

        tPhone = new TextField();
        tPhone.setBounds(180, 220, 200, 20);
        add(tPhone);

        // Email
        l5 = new Label("Email ID:");
        l5.setBounds(50, 260, 120, 20);
        add(l5);

        tEmail = new TextField();
        tEmail.setBounds(180, 260, 200, 20);
        add(tEmail);

        // Experience
        l6 = new Label("Experience (y/m):");
        l6.setBounds(50, 300, 120, 20);
        add(l6);

        tExpY = new TextField();
        tExpY.setBounds(180, 300, 50, 20);
        add(tExpY);

        tExpM = new TextField();
        tExpM.setBounds(250, 300, 50, 20);
        add(tExpM);

        // Platform
        l7 = new Label("Platform:");
        l7.setBounds(50, 340, 120, 20);
        add(l7);

        platform = new Choice();
        platform.add("Select one");
        platform.add("Online");
        platform.add("Offline");
        platform.setBounds(180, 340, 200, 20);
        add(platform);

        // DOB
        l8 = new Label("Date of Birth:");
        l8.setBounds(50, 380, 120, 20);
        add(l8);

        dobMonth = new Choice();
        dobMonth.add("Jan");
        dobMonth.add("Feb");
        dobMonth.add("Mar");
        dobMonth.add("Apr");
        dobMonth.add("May");
        dobMonth.add("Jun");
        dobMonth.setBounds(180, 380, 90, 20);
        add(dobMonth);

        dobDate = new Choice();
        for (int i = 1; i <= 31; i++)
            dobDate.add(String.valueOf(i));
        dobDate.setBounds(280, 380, 60, 20);
        add(dobDate);

        dobYear = new Choice();
        for (int i = 1980; i <= 2024; i++)
            dobYear.add(String.valueOf(i));
        dobYear.setBounds(350, 380, 80, 20);
        add(dobYear);

        // Gender
        l9 = new Label("Gender:");
        l9.setBounds(50, 420, 120, 20);
        add(l9);

        chg = new CheckboxGroup();
        male = new Checkbox("Male", chg, false);
        male.setBounds(180, 420, 80, 20);
        add(male);

        female = new Checkbox("Female", chg, false);
        female.setBounds(270, 420, 80, 20);
        add(female);

        // Submit Button
        b1 = new Button("SUBMIT");
        b1.setBounds(220, 480, 150, 30);
        add(b1);
    }
}
