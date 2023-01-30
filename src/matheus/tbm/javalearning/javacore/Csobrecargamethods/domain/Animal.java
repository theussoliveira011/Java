package matheus.tbm.javalearning.javacore.Csobrecargamethods.domain;

public class Animal {

    private String name;
    private String tipo;
    private int quantidadePatas;
    private char sex;


    public Animal(){
    }

    public Animal(String richard, String tubarão, int i, char f) {
    }

    public void init(String name, String tipo, int quantidadePatas){
        this.name = name;
        this.tipo = tipo;
        this.quantidadePatas = quantidadePatas;
    }

    public void init(String name, String tipo, int quantidadePatas, char sex){
        this.init(name, tipo, quantidadePatas);
        this.sex = sex;
    }


    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.quantidadePatas);
        System.out.println(this.sex);
    }


    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }
}
