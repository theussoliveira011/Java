package matheus.tbm.groceryStore.domains.Client;


import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class Client {

    // attributes
    public short clientID;
    private static short clientCounter = 0;
    private String name;
    private String surname;
    private String address;
    private byte age;
    private LocalDateTime registerData;
    private String dataBirth;
    private String favoriteProduct;
    private String email;

    {
        clientCounter++;
        this.clientID = clientCounter;
        this.registerData = LocalDateTime.now();
    }

    // constructors
    public Client(){}
    public Client(String name) {
        this.name = name;
        this.clientID = clientCounter;
    }
    public Client(String name, String surname) {
        this.name = name;
         }
    public Client(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public Client(String name, String surname, String address, byte age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }
    public Client(String name, String surname, String address, byte age, String dataBirth) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.dataBirth = dataBirth;
    }
    public Client(String name, String surname, String address, byte age, String dataBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.dataBirth = dataBirth;
        this.email = email;
    }

    // getters and setters
    public short getClientID(){
        return clientID;
    }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public LocalDateTime getRegisterData() {
        return registerData;
    }

    public String getDataBirth(){ return dataBirth; }
    public String getFavoriteProduct() { return favoriteProduct; }
    public void setFavoriteProduct(String favoriteProduct){ this.favoriteProduct = favoriteProduct; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }

    //unique methods
    public String doYouHave(String data){
        if(data == null) {
            System.out.println("This question is necessary");
        };

        System.out.println("Do you have " + data+"?");
        Scanner inputAnwser = new Scanner(System.in);
        System.out.println("Please respond with Y/N: ");

        String anwser = inputAnwser.nextLine();

        while(!anwser.equalsIgnoreCase("y") && !anwser.equalsIgnoreCase("n")){
            System.out.println("Por favor, digite Y ou N: ");
            anwser = inputAnwser.nextLine();
        }

        if(anwser.equalsIgnoreCase("N")){
            System.out.println("Não possue "+data);
            setEmail(null);
        }

        return anwser;
    }

    public void setData(String data, String anwser){
        switch (data){
            case "email":
               if(anwser.equalsIgnoreCase("Y")){
                   System.out.println("Digite seu "+data+":");
                   String email = new Scanner(System.in).nextLine();
                   setEmail(email);
               }
               break;

            case "address":
                if (anwser.equalsIgnoreCase("Y")){
                    System.out.println("Por favor, digite seu "+data+":");
                    String address = new Scanner(System.in).nextLine();
                    setAddress(address);
                }
                break;
        }

    }

    //override methods
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof  Client){
            Client c = (Client) obj;
            return this.name.equals(c.getName()) || this.surname.equals(c.getSurname());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            surname,
                            address,
                            age,
                            registerData,
                            dataBirth,
                            favoriteProduct,
                            email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", registerData=" + registerData +
                ", dataBirth='" + dataBirth + '\'' +
                ", favoriteProduct='" + favoriteProduct + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
