import java.util.regex.*;

public class Regex_example {
    public static void main(String[] args) {
        // 1st way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();
        System.out.println(b1);

        // 2nd way 
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        // 3rd way 
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);

        System.out.println(Pattern.matches(".s", "hghs"));//false (has more than 2 char)  
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
    }
}