interface Parent1 {
    void show();
}

interface Parent2 {
    void show();
}

class Child implements Parent1, Parent2 {
    public void show() {
        System.out.println("Child class");
    }
}

class Q5A {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
