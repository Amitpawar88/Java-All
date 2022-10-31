import java.util.Scanner;

public class CodeChef_Test {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();
            String str = sc.nextLine();
            int count1 = 0;
            int count2 = 0;
            for(int x = 0; x < l; x++) {
                 if (str.charAt(x) == '0') {
                     count1++;
                 }
                 if (str.charAt(x) == '1') {
                     count2++;
                 }
            }
            
            if (count1 % 2 == 0 || count2 % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

    }
}
