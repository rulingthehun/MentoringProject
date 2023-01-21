package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:/myfile.txt");
        } catch (FileNotFoundException fnfe){
            System.out.println("The specified file is not present at the given path");
        }
        int k;
        try {
            while ((k = fis.read()) != -1)
                System.out.println((char)k);
            fis.close();
        } catch (IOException ioe){
            System.out.println("I/O error accurred: " + ioe);
        }
    }
}
