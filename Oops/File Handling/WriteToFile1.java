import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile1 {
    public static void main(String[] args) {
        
        try {
            String inputMessage = new String();
            FileWriter myWriter = new FileWriter("file2.txt");

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter your message");
            
            inputMessage = sc.nextLine();
            
            myWriter.write("Your message is: " + inputMessage);
            myWriter.close();
            
            System.out.println("File created successfully");
        } 
        catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
