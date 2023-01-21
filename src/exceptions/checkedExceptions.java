package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedExceptions {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream("C:/myfile.txt");
        int k;
        while ((k = fis.read()) != -1)
            System.out.println((char)k);
    }
}
