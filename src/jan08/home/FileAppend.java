package jan08.home;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) {
        String text = System.lineSeparator() + "I dhaka I am learning Java.";

        
        try(FileOutputStream output = new FileOutputStream("filename.txt", true)){
            output.write(text.getBytes());
            System.out.println("Append successfully");
        }catch(IOException e){
            System.out.println("Error while writing File");
            e.printStackTrace();
        }
    }
}
