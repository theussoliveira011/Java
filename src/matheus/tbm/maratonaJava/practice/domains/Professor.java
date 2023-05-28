package matheus.tbm.maratonaJava.practice.domains;

public class Professor {
    private String name;
    private String speciality;
    private Seminario[] seminarios;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Professor(String name, String speciality, Seminario[] seminarios) {
        this.name = name;
        this.speciality = speciality;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.speciality);
        if(this.seminarios == null) return;
        for(int i = 0; i < seminarios.length;i++){
            System.out.println("=====================");
            System.out.println("O seminario é sobre: "+seminarios[i].getTitle());
            System.out.println("Local:" + seminarios[i].getLocal().getAddress());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}