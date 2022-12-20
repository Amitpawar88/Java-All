import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicNumber {
    public static void main(String[] agrs) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(sc.readLine());
        int ans = 0;
        int base = 5;

        while (num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
