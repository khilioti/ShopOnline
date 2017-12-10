
package model;


public class Client {
    private int idClient;
    private String name;
    private String surName;
    private int age;


    public void setClient(int idClient, String name, String surName,int age) {
        this.idClient= idClient;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public void getClient() {
        System.out.println("id = [" + this.idClient + "]");
        System.out.println("name = [" + this.name + "]");
        System.out.println("surName = [" + this.surName + "]");
        System.out.println("age = [" + this.age + "]");


    }


          
}
