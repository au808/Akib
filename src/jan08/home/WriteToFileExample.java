package jan08.home;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        String text = "Hello World.";
        
    try (FileOutputStream output = new FileOutputStream("filename2.txt")) {
      output.write(text.getBytes());  // convert text to bytes and write
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
      e.printStackTrace();
    }
    }
}
