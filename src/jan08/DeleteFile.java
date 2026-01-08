package jan08;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("au.txt");
        if (file.delete()) {
            System.out.println("File is deleted: " + file.getName());
        }else{
            System.out.println("Failed to Delete");
        }
        
        
    }
}
