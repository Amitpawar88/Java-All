public class Try_Catch {
    public static void main(String[] args) {
        int a = 4000;
        int b = 0;
        try {
        int c = a/b;
        System.out.println("The result is" + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide, Reason: ");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}