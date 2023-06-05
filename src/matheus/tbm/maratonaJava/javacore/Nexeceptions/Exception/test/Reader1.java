package matheus.tbm.maratonaJava.javacore.Nexeceptions.Exception.test;

import java.io.Closeable;
import java.io.IOException;

public class Reader1  implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing reader1");
    }
}
