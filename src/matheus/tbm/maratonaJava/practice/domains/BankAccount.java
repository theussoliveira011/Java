package matheus.tbm.maratonaJava.practice.domains;

public class BankAccount extends Client {
    private String numberAccount;
    private Client client;

    private void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public Client getClient() {
        return client;
    }
}
