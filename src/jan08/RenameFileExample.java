package jan08;

import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("akib.txt");
        File newFile = new File("au.txt");
        
        if (oldFile.renameTo(newFile)){
            System.out.println("Rename success: " + newFile.getName());
            
        }else {
            System.out.println("Rename Failed");
        }
    }
}
