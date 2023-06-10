package matheus.tbm.maratonaJava.javacore.Slambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaTest {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).run();

        new Thread(() -> System.out.println("Hello World")).run();

        // SMA -> Single Abstract Method
        // Any interface that have a unique method
    }
}
