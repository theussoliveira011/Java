package matheus.tbm.javalearning.introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /* int, double, float, long, byte, short, boolean */
        int age = (int) 10000000000L; // 4 bytes // force a long variable in a int. -> casting
        long largeNumber = (long) 155.23; // 8 bytes // -> casting
        double salaryDouble = 5000; // 8 bytes
        float salaryFloat = 2500; // 4 bytes
        byte ageByte = 10; // 1 byte
        short ageShort = 10; // 2 bytes
        boolean adult = false; // 1 bit true or false.
        char sunday = 'W'; // char = 'WA' -> error. // 2 bytes
        char hello = 50; // 2 bytes
        System.out.println("my age is: " + age+" years");
        System.out.println("my age is: " + largeNumber+" years");
    }
}
