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
public class Product {
    private int idProduct;
    private String name;
    
    /**
     *
     * @param idProduct
     * @param name
     */
    public void setProduct(int idProduct, String name){
      this.idProduct = idProduct;
      this.name = name;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
