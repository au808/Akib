package Jan05.home;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Public\\Public Video");
        if(myObj.delete()){
            System.out.println("Deleted the folder: " + myObj.getName());
        }else {
            System.out.println("Failed to delete the Folder");
        }
    }
}
