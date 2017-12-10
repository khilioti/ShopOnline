/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CmdLineService {
 

    public void showMenu() {
        
        
        

           boolean s0 = true;
        do{
            
            showMenu();
            int bt = 100;
            try{
                Scanner command = new Scanner(System.in);
                bt = command.nextInt();
            }catch (InputMismatchException e){
                
            }
            switch (bt){
                case 1:
                    MenuOrder();
                     //s = false;//завершить работу
                    break;
                case 2:
                    MenuProduct();
                    // s = false;
                    break;
                case 3:
                    MenuClient();
                    // s = false;
                    break;
                 case 0:
                    s0 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
                     
            }
        }while (s0);
    }
    public void MenuOrder() {
        boolean s1 = true;
        do{
            showMenuOrder();
        
            int bt = 100;
            try{
                Scanner command = new Scanner(System.in);
                bt = command.nextInt();
            }catch (InputMismatchException e){
                
            }
            switch (bt){
                case 1:
                    addOrder();
                     //s = false;//завершить работу
                    break;
                case 2:
                    editOrder();
                    // s = false;
                    break;
                case 3:
                    dellOrder();
                    // s = false;
                    break;
                 case 4:
                    showAllOrder();
                    // s = false;
                    break;    
                 case 0:
                    s1 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
                     
            }
        }while (s1);
    }
     public void MenuProduct() {
       boolean s2 = true;
        do{
            showMenuProduct();
                    
            int bt = 100;
            try{
                Scanner command = new Scanner(System.in);
                bt = command.nextInt();
            }catch (InputMismatchException e){
                
            }
            switch (bt){
                case 1:
                    addProduct();
                     //s = false;//завершить работу
                    break;
                case 2:
                    editProduct();
                    // s = false;
                    break;
                case 3:
                    dellProduct();
                    // s = false;
                    break;
                 case 4:
                    showAllProduct();
                    // s = false;
                    break;    
                 case 0:
                    s1 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
            }
        }while (s2);
    }
     public void MenuClient() {
         boolean s3 = true;
        do{
            showMenuClient();
            
        
            int bt = 100;
            try{
                Scanner command = new Scanner(System.in);
                bt = command.nextInt();
            }catch (InputMismatchException e){
                
            }
            switch (bt){
                case 1:
                    addClient();
                     //s = false;//завершить работу
                    break;
                case 2:
                    editClient();
                    // s = false;
                    break;
                case 3:
                    dellClient();
                    // s = false;
                    break;
                 case 4:
                    showAllClient();
                    // s = false;
                    break;    
                 case 0:
                    s1 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
            }
        }while (s3);
    }
     
    private void showMenu(){
        System.out.println("*****************************");
        System.out.println("1. Работа с заказом ");
        System.out.println("2. Работа с товаром ");
        System.out.println("3. Работа с клиентом ");
        System.out.println("0. Выход ");
        System.out.println("*****************************"); 
    }
    private void showMenuOrder(){
        System.out.println("*****************************");
        System.out.println("1. Создать заказ ");
        System.out.println("2. Редактировать заказ ");
        System.out.println("3. Удалить заказ ");
        System.out.println("4. Показать все заказы ");
        System.out.println("0. Выход ");
        System.out.println("*****************************");
    }  
    private void showMenuProduct(){
        System.out.println("*****************************");
        System.out.println("1. Создать продукт ");
        System.out.println("2. Редактировать продукт ");
        System.out.println("3. Удалить продукт ");
        System.out.println("4. Показать все продукт ");
        System.out.println("0. Выход ");
        System.out.println("*****************************");   
    }
    private void showMenuClient(){
        System.out.println("*****************************");
        System.out.println("1. Создать клиента ");
        System.out.println("2. Редактировать клиента ");
        System.out.println("3. Удалить клиента ");
        System.out.println("4. Показать все клиенты ");
        System.out.println("0. Выход ");
        System.out.println("*****************************");
    }    
    
}
