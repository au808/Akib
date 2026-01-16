package jan08.home;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("filename2.txt"))){
            bw.write("Hello This i my first line.");
            bw.newLine();
            bw.write("And This i smy second line. i am testing a writing infile");
            System.out.println("File succesfully written");

        }catch(IOException e){
            System.out.println("Error while writing");
        }
    }
}
