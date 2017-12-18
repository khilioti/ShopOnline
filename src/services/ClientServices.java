package services;

import model.Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ClientServices {
    List<Client> clients;
    private BufferedReader reader;
     ClientServices() {
      this.clients = new ArrayList<>();
      this.reader = new BufferedReader(new InputStreamReader(System.in));

    }
    public void addClient(){
        try{
            System.out.println("Введите ID:");
            int id = readNuber();
            System.out.println("Введите имя:");
            String name = this.reader.readLine();
            System.out.println("Введите фамилию:");
            String surname = reader.readLine();
            System.out.println("Введите возраст:");
            int age = readNuber();
            clients.add(new Client(id, name, surname, age));

        }catch (IOException  ignored){}

    }
    public void editClient(){
        System.out.println("Введите ID Клиениа для редактирования");
        boolean flag = false;
        int idClientEdit = readNuber();
        for (Client clirntSearch : clients) {
            if(clirntSearch.getIdClient() == idClientEdit) {

                try{
                    System.out.println("Введите ID:");
                    int id = readNuber();
                    System.out.println("Введите имя:");
                    String name = this.reader.readLine();
                    System.out.println("Введите фамилию:");
                    String surname = reader.readLine();
                    System.out.println("Введите возраст:");
                    int age = readNuber();
                    clients.set(clients.indexOf(clirntSearch),new Client(id, name, surname, age));

                }catch (IOException  ignored){}

                System.out.println("Клиент Изменен");
                flag = true;
                break;
            }
        }
        if (flag == false){ System.out.println("Нет Клиента с таким ID");}

    }

    public void delClient(){
        System.err.println("Введите ID Клиениа для удаления");
        boolean flag = false;
         int idClientDell = readNuber();
        for (Client clirntSearch : clients) {
           if(clirntSearch.getIdClient() == idClientDell) {
               clients.remove(clients.indexOf(clirntSearch));
               System.out.println("Клиент удален");
               flag = true;
               break;
           }
        }
        if (flag == false){ System.out.println("Нет Клиента с таким ID");}
    }


    public void showAllClient(){
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).getClient();

            //System.out.println(clients.indexOf(clients.get(i)));
        }
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
}}
