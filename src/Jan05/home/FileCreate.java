package Jan05.home;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try{
            File myObj = new File("E:\\java\\myfile.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An error Occurred.");
            e.printStackTrace();
        }
        
        }
    }
