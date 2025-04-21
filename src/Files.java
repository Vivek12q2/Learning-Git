package src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("hello.txt", true);
        fileOutputStream.write('B');
        fileOutputStream.close();
    }

}
