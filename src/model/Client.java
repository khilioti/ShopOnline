/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sveta
 */
public class Client {
    private int idClient;
    private String name;
    private String surName;
    private int age;
    private String sex;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param idClient
     * @param name
     * @param surName
     * @param age
     * @param sex
     */
    public void setClient(int idClient, String name, String surName,int age, String sex) {
        this.idClient= idClient;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.sex = sex;

    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }
    
          
}
