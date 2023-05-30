package matheus.tbm.maratonaJava.javacore.Jenum.domains;

public enum TypeClient {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private String nameRelatory;
    TypeClient(int valor, String nameRelatory){
        this.VALOR = valor;
        this.nameRelatory = nameRelatory;
    }

    public static TypeClient typeClientByName(String nameRelatory){
        for(TypeClient type : values()){
            if(type.getNameRelatory().equals(nameRelatory)){
                return type;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNameRelatory() {
        return nameRelatory;
    }

    public void setNameRelatory(String nameRelatory) {
        this.nameRelatory = nameRelatory;
    }
}
