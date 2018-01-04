
package model;


public class Product {
    private int idProduct;
    private String name;
    private int price;

    public Product(int idProduct, String name, int price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }
    public Product( String name, int price) {
        this.name = name;
        this.price = price;
    }



    public void getProduct() {
        System.out.println("id = [" + this.idProduct + "] name = ["
                + this.name + "] " + "] price = [" + this.price + "]");
    }
    public int getIdProduct() {

        return idProduct;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
