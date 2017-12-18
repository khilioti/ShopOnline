package services;

import model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProductServices {

    List<Product> products;
    private BufferedReader reader;

   ProductServices() {
       this.products = new ArrayList<>();
       this.reader = new BufferedReader(new InputStreamReader(System.in)); 
   }
   
   public void addProduct(){
       try{
           System.out.println("Введите ID:");
           int id = readNumber();
           System.out.println("Введите название:");
           String name = this.reader.readLine();
           System.out.println("Введите стоимость:");
           int price = readNumber();
           products.add(new Product(id, name, price));
       }catch (IOException ignored){} 
   }
   
    public void editProduct(){
        System.out.println("Введите ID Продукта для редактирования");
        boolean flag = false;
        int idProductEdit = readNumber();
        for (Product productSearch : products) {
            if(productSearch.getIdProduct() == idProductEdit) {
                try{
                    System.out.println("Введите ID:");
                    int id = readNumber();
                    System.out.println("Введите название:");
                    String name = reader.readLine();
                    System.out.println("Введите цену:");
                    int price = readNumber();
                    products.set(products.indexOf(productSearch),new Product(id, name, price));
                }catch (IOException  ignored){}

                System.out.println("Продукт Изменен");
                flag = true;
                break;
            }
        }
        if (flag == false){ System.out.println("Нет Продукта с таким ID");}
    }
    
    public void delProduct(){
        System.err.println("Введите ID Продукта для удаления");
        boolean flag = false;
        int idProductDell = readNumber();
        for (Product productSearch : products) {
            if(productSearch.getIdProduct() == idProductDell) {
                products.remove(products.indexOf(productSearch));
                System.out.println("Продуст удален");
                flag = true;
                break;
            }
        }
        if (flag == false){ System.out.println("Нет Продукта с таким ID");}
   }
   
    public void showAllProduct(){
        for (int i = 0; i < products.size(); i++) {
            products.get(i).getProduct();
        }

    }
    
    private int readNumber(){
        int in = 0;
        try {
            in = Integer.valueOf(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Неправилный ввод");
            in = readNumber();
        }
        return in;       
    }
}
