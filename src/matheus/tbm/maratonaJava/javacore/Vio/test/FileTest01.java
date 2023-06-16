package matheus.tbm.maratonaJava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {

    public static void main(String[] args) {
        File file = new File("/home/matheus/Java/File/file.txt");
        try {
            boolean fileExist = file.exists();

            if(!fileExist){
                boolean isCreated = file.createNewFile();
                System.out.println("Criado com sucesso!");
            } else {
                file.delete();
                System.out.println("Deletado com sucesso!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
