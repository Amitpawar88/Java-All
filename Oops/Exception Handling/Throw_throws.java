class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Radius cannot be negative!";
    }
}

public class Throw_throws {
    public static double area(int r) throws NegativeRadiusException {
        if(r < 0) {
            try {
                throw new NegativeRadiusException();
            }
            catch(Exception e) {
                System.out.println(e.toString());
            }
        }
        return Math.PI * r * r;
    }
    public static int divide(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        try {
            // System.out.println(divide(3, 0));
            System.out.println(area(-2));
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
        
    }
}
