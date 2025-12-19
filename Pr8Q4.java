class Sports {

    void play() {
        System.out.println("this is sports class method");
    }
}

class Cricket extends Sports {
    
    void play() {
        System.out.println(" \n this is cricket class method");
    }
}

class Football extends Sports {
    
    void play() {
        System.out.println(" \n this is football class method");
    }
}

public class Pr8Q4 {
    
    public static void main(String[] args) 
    {
        Cricket c = new Cricket();
        c.play();

        Football f = new Football();
        f.play();
    }
}