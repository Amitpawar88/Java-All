class One1 {
    public void print_One() {
        System.out.println("Class One1");
    }
}

class Two1 extends One1 {
    public void print_Two() {
        System.out.println("class Two1");
    }
}

class Three1 extends One1 {
    public void print_Three() {
        System.out.println("class Three1");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Two1 t1 = new Two1();
        t1.print_One();
        t1.print_Two();

        Three1 th1 = new Three1();
        th1.print_One();
        th1.print_Three();
    }
}
