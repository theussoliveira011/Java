package matheus.tbm.maratonaJava.javacore.Linterface.tests;

import matheus.tbm.maratonaJava.javacore.Linterface.domains.DatabaseLoader;
import matheus.tbm.maratonaJava.javacore.Linterface.domains.FileLoader;

public class DataLoaderTest {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

    }



}
