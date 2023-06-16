package matheus.tbm.maratonaJava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/matheus/Java/File/file.txt");

        try(FileWriter fw = new FileWriter(file, false)) {
            fw.write("My name is Matheus, i am learning to writer in files with java\n" +
                    "I am jumping a line\n");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
