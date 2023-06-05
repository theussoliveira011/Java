package matheus.tbm.maratonaJava.javacore.Nexeceptions.runtime.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Error do Array");
        }
        //Exceções mais genêricas sempre vão ao final.
        catch (Exception e) {
            System.out.println("Error genérico");
        }

        try{
            exceptionTest();
        } catch (SQLException | FileNotFoundException error){
            error.printStackTrace();
        }
    }



    private static void exceptionTest() throws SQLException, FileNotFoundException{

    }
}