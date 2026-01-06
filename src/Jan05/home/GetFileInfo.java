package Jan05.home;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("myfile1.txt");
        
        if(myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
            System.out.println("File hashCode: " + myObj.hashCode());
            System.out.println("File freeSpace: " + myObj.getFreeSpace());
        }
    }
}
