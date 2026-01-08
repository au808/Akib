package jan08;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("au.txt");
        if (file.exists()) {
     // System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + file.getAbsolutePath());
      //System.out.println("Writeable: " + myObj.canWrite());
     // System.out.println("Readable " + myObj.canRead());
     // System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
    }
}
