import java.util.Scanner;

class MyExcetion extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }    
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 99) {
            try {
                throw new MyExcetion();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
