class One {
    public void fName() {
        System.out.print("Amit ");
    }
}

class Two extends One {
    public void lName() {
        System.out.println("Pawar");
    }
}

public class Single {
    public static void main(String[] args) {
        Two t1 = new Two();
        t1.fName();
        t1.lName();
    }
}
