import java.io.*;

public class Read_File1 {
    public static void main(String[] args) throws Exception {
        
        // File file = new File("file2.txt");

        FileReader br = new FileReader("file2.txt");
        
        int i;
        
        while ((i = br.read()) != -1){

            System.out.print((char)i);

        }

    }
}
