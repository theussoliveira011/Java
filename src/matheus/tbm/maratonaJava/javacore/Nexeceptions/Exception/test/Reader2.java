package matheus.tbm.maratonaJava.javacore.Nexeceptions.Exception.test;

import java.io.Closeable;
import java.io.IOException;

public class Reader2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing reader2");
    }
}
