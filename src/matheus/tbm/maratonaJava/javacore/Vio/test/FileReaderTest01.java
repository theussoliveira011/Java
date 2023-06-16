package matheus.tbm.maratonaJava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/matheus/Java/File/file.txt");
        try(FileReader reader = new FileReader(file)) {
            char[] in = new char[(int) file.length()];
            reader.read(in);
            for (char c : in) {
                System.out.print(c);
            }

//        System.out.println(file.length());
//
//        int i;
//        while((i = reader.read()) != -1){
//            System.out.print((char) i);
//        }

        } catch (IOException e ) {
            throw new RuntimeException(e);
        }
    }

}
