package matheus.tbm.javalearning.practice.domains;

public class Client {

    private String name;
    private int age;


    // C O N S T R U C T O R S
    public Client(){
    }

    private Client(String name, int age){
        this.name = name;
        this.age = age;
    }

    // G E T
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    // S E T
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}