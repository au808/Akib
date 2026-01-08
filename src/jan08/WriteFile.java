package jan08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Akib Uddin\\Documents\\au-file.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello I am WaliNur");
            bw.close();
            
            System.out.println("writting Success");
            
        } catch (IOException e) {
            System.out.println("Writing Failed");
            
        }
    }
}
