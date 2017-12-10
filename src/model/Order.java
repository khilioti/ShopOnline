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
public class Order {
    private int idOrder;
    private int idClient;
    private int idProduct;
    private int countProduct;
    
    /**
     *
     * @param idOrder
     * @param idClient
     * @param idProduct
     * @param countProduct
     */
    public void setOrder(int idOrder, int idClient, int idProduct, int countProduct){
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.idProduct = idProduct;
        this.countProduct = countProduct;
    }

    /**
     * @return the idOrder
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     * @return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @return the countProduct
     */
    public int getCountProduct() {
        return countProduct;
    }
    
}
