import java.io.File;
import java.io.IOException;

public class CreateFile1 {
    public static void main(String[] args) {
         
        try {
            File myFile = new File("file1.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("An error occured");  
            e.printStackTrace();
        }

    }
} 
