package Jan05.home;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try(FileWriter myWriter = new FileWriter("myfile1.txt", true)){
            myWriter.write("\nAppended text!");
            System.out.println("Successfully appended to the file.");
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
