package matheus.tbm.maratonaJava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/matheus/Java/File/fileBuffered.txt");

        try(FileWriter fw = new FileWriter(file, false);
            BufferedWriter buffered = new BufferedWriter(fw)) {

            buffered.write("My name is Matheus, i am learning to use a buffer to writer in a file with Java");
            buffered.newLine();
            buffered.write("I am very excitate ");
            buffered.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
