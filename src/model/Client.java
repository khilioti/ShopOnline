
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
    public Client(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void getClient() {
        System.out.println("id = [" + this.idClient + "] name = [" + this.name + "] " +
                "surname = [" + this.surName + "] age = [" + this.age + "]");
    }

    public int getIdClient() {
        return idClient;
    }
}
