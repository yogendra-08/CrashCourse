class Bank {
    void rate_of_interest() {
        System.out.println("General Bank rate of interest");
    }
}

class HDFC extends Bank {
    void rate_of_interest() {
        System.out.println("HDFC rate of interest is 5%");
    }
}

class SBI extends Bank {
    void rate_of_interest() {
        System.out.println("SBI rate of interest is 4%");
    }
}

class ICICI extends Bank {
    void rate_of_interest() {
        System.out.println("ICICI rate of interest is 6%");
    }
}

public class Pr8Q3 {
    public static void main(String[] args) {

        HDFC h = new HDFC();
        h.rate_of_interest();

        SBI s = new SBI();
        s.rate_of_interest();

        ICICI i = new ICICI();
        i.rate_of_interest();
    }
}
