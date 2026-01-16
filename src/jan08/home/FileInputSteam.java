package jan08.home;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteam {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("E:\\java\\myfile.txt")){
            int i;
            
            while((i = input.read()) != -1){
                System.out.println(i);
            }
        }catch (IOException e){
            System.out.println("Error while reading file");
        }
        
    }
}
