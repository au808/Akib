package jan08.home;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("E:\\java\\myfamilly.jpg");
         FileOutputStream output = new FileOutputStream("E:\\java\\copy.jpg")) {

      int i;
      while ((i = input.read()) != -1) {
        output.write(i);  // write the raw byte to the new file
      }

      System.out.println("File copied successfully.");

    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
    }
}
