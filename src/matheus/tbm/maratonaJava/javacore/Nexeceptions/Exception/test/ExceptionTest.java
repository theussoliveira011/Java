package matheus.tbm.maratonaJava.javacore.Nexeceptions.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    private static void createNewFile() throws IOException {
        File file = new File("File/testFile.txt");

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException error) {
            error.printStackTrace();
            throw error;
        }
    }
}
