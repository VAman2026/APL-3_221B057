class Mother {
    int x; 

    Mother() {
        x = 10; 
    }

    void show() {
        System.out.println("Value of x in Mother: " + x);
    }
}

class Child extends Mother {
}

class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
