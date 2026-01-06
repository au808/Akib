package Jan05.home;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("myfile1.txt");
            myWriter.write("Files in Java might be trickey, but it is Fun!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
