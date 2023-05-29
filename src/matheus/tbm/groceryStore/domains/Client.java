package matheus.tbm.groceryStore.domains;


import java.time.LocalDateTime;
import java.util.Objects;

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
