package matheus.tbm.javalearning.javacore.Bintroductionmethods.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salary;
    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
        for(double num : this.salary){
            System.out.println(num);
        }
    }

    public double getSalary(double[] salary){
        if(salary == null){
            return 0;
        }

        double media = 0;
        for(int i = 0; i < salary.length;i++){
            media += salary[i];
        }
        media /= salary.length;
        System.out.println("=========");
        System.out.println("Media dos salários");
        return media;
    }
}
