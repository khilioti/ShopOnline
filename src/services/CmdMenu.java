/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sveta
 */
public class CmdMenu {
       
    
    CmdMenuOrder order = new CmdMenuOrder();
        CmdMenuProduct product = new CmdMenuProduct();
        CmdMenuClient client = new CmdMenuClient();
    
    public void showMenu(){
        System.out.println("*****************************");
        System.out.println("1. Работа с заказом ");
        System.out.println("2. Работа с товаром ");
        System.out.println("3. Работа с клиентом ");
        System.out.println("0. Выход ");
        System.out.println("*****************************");

           boolean s = true;
        while (s){
        
        int bt = 100;
            try{
                Scanner command = new Scanner(System.in);
            bt = command.nextInt();
            }catch (InputMismatchException e){
                
            }
            switch (bt){
                case 1:
                    order.showMenuOrder();
                     //s = false;//завершить работу
                    break;
                case 2:
                    product.showMenuProduct();
                    // s = false;
                    break;
                case 3:
                    client.showMenuClient();
                    // s = false;
                    break;
                 case 0:
                    s = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
                     
            }}
        }
    
    
    
    
    
    
    
    
    
}
