package matheus.tbm.maratonaJava.javacore.Bintroductionmethods.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double media;

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
        for(double num : this.salary){
            System.out.println(num);
        }
    }

    public void imprimeMedia(){
        if(salary == null){
            return;
        }
        for(double i:salary){
            media += i;
        }
        media /= salary.length;
        System.out.println("Media salarial: R$"+media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getMedia() {
        return this.media;
    }
}
