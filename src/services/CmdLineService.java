package services;

import model.Order;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;



public class CmdLineService {


    ClientServices clientServices = new ClientServices();
    OrderServices orderServices = new OrderServices();
    ProductServices productServices =new ProductServices();
    private BufferedReader reader;

    public void mainMenu() {

           boolean s0 = true;
        do{
            showMenu();
            try{
                this.reader = new BufferedReader(new InputStreamReader(System.in));

            }catch (InputMismatchException e){
                System.out.println("Ошибка чтения ввода");
            }
            switch (readNuber()){
                case 1:
                    MenuClient();
                    break;
                case 2:
                    MenuOrder();
                    break;
                case 3:
                    MenuProduct();
                    break;
                 case 0:
                    s0 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
                     
            }
        }while (s0);
    }

    public void MenuClient() {
        boolean s1 = true;
        do{
            showMenuClient();
            try{
                this.reader = new BufferedReader(new InputStreamReader(System.in));

            }catch (InputMismatchException e){}

            switch (readNuber()){
                case 1:
                    clientServices.addClient();
                    break;
                case 2:
                    clientServices.editClient();
                     break;
                case 3:
                    clientServices.delClient();
                     break;
                case 4:
                    clientServices.showAllClient();
                     break;
                case 0:
                    s1 = false;
                    break;
                default:
                    System.out.println("Жми правильно");
            }
        }while (s1);
    }

    public void MenuOrder() {
        Order order = new Order();
        boolean s2 = true;
        do{
            showMenuOrder();
            try{
                this.reader = new BufferedReader(new InputStreamReader(System.in));

            }catch (InputMismatchException e){}

            switch (readNuber()){
                case 1:
                    orderServices.addOrder();
                    break;
                case 2:
                    orderServices.editOrder();
                    break;
                case 3:
                    orderServices.delOrder();
                    break;
                 case 4:
                    orderServices.showAllOrder();
                     break;
                 case 0:
                    s2 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
            }
        }while (s2);
    }

     public void MenuProduct() {
       boolean s3 = true;
        do{
            showMenuProduct();

            try{
                this.reader = new BufferedReader(new InputStreamReader(System.in));

            }catch (InputMismatchException e){
                
            }
            switch (readNuber()){
                case 1:
                    productServices.addProduct();
                     break;
                case 2:
                    productServices.editProduct();
                    break;
                case 3:
                    productServices.delProduct();
                     break;
                 case 4:
                    productServices.showAllProduct();
                    break;
                 case 0:
                    s3 = false;
                    break;
                 default:
                     System.out.println("Жми правильно");
            }
        }while (s3);
    }

    private void showMenu(){
        System.out.println("*****************************");
        System.out.println("1. Работа с клиентом ");
        System.out.println("2. Работа с заказом ");
        System.out.println("3. Работа с товаром ");
        System.out.println("0. Выход ");
        System.out.println("*****************************"); 
    }

    private void showMenuClient(){
        System.out.println("*****************************");
        System.out.println("1. Создать клиента ");
        System.out.println("2. Редактировать клиента ");
        System.out.println("3. Удалить клиента ");
        System.out.println("4. Показать всех клиентов ");
        System.out.println("0. Назад ");
        System.out.println("*****************************");
    }

    private void showMenuOrder(){
        System.out.println("*****************************");
        System.out.println("1. Создать заказ ");
        System.out.println("2. Редактировать заказ ");
        System.out.println("3. Удалить заказ ");
        System.out.println("4. Показать все заказы ");
        System.out.println("0. Назад ");
        System.out.println("*****************************");
    }

    private void showMenuProduct(){
        System.out.println("*****************************");
        System.out.println("1. Создать товар ");
        System.out.println("2. Редактировать товар ");
        System.out.println("3. Удалить товар ");
        System.out.println("4. Показать все товары ");
        System.out.println("0. Назад ");
        System.out.println("*****************************");   
    }

    private int readNuber() {
        int in = 0;
        try {
            in = Integer.valueOf(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Неправилный ввод");
            in = readNuber();
        }
        return in;
    }

}
