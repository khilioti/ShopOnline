
package model;


public class Client {
    private int idClient;
    private String name;
    private String surName;
    private int age;

    public Client(int idClient, String name, String surName, int age) {
        this.idClient = idClient;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void setClient(int idClient, String name, String surName, int age) {
        this.idClient= idClient;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public void getClient() {
        System.out.println("id = [" + this.idClient + "] name = [" + this.name + "] " +
                "surName = [" + this.surName + "] age = [" + this.age + "]");

    }



}
