package jan08;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\Akib Uddin\\Documents\\au-file.txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
