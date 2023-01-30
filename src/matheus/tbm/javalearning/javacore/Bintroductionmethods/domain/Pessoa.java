package matheus.tbm.javalearning.javacore.Bintroductionmethods.domain;

public class Pessoa {
    private String name;
    private int age;
    private String password;
    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return;
        }
        System.out.println("Minimo de caracteres invalido");
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.age = age;
    }

    public void setPassword(String password){
        if(!password.isEmpty()){
            this.password = password;
            return;
        }
        System.out.println("Mino de caracteres invalido");
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

}
