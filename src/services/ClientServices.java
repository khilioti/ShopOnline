package services;

import dao.ClientDB;
import model.Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ClientServices {
    List<Client> clients;
    ClientDB db = new ClientDB();
    private BufferedReader reader;
    
    ClientServices() { 
        this.clients = new ArrayList<>();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void addClient(){
        try{
           // System.out.println("Введите ID:");
           //int id = readNumber();
            System.out.println("Введите имя:");
            String name = this.reader.readLine();
            System.out.println("Введите фамилию:");
            String surname = reader.readLine();
            System.out.println("Введите возраст:");
            int age = readNumber();
          //  clients.add(new Client(id, name, surname, age));
            db.addClient(new Client(name, surname, age));

        }catch (IOException  ignored){}
    }
    
    public void editClient(){
        clients = db.getClient();
        System.out.println("Введите ID Клиениа для редактирования");
        boolean flag = false;
        int idClientEdit = readNumber();
        for (Client clientSearch : clients) {
            if(clientSearch.getIdClient() == idClientEdit) {
                try{
                   // System.out.println("Введите ID:");
                   // int id = readNumber();
                    System.out.println("Введите имя:");
                    String name = this.reader.readLine();
                    System.out.println("Введите фамилию:");
                    String surname = reader.readLine();
                    System.out.println("Введите возраст:");
                    int age = readNumber();
                    //clients.set(clients.indexOf(clientSearch),new Client(id, name, surname, age));
                    db.updateClient(new Client(idClientEdit, name, surname, age));
                }catch (IOException  ignored){}
                System.out.println("*****************************");
                System.out.println("**Клиент Изменен**");
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("*****************************");
            System.out.println("Нет Клиента с таким ID");}
    }

    public void delClient(){
        clients = db.getClient();
        System.err.println("Введите ID Клиениа для удаления");
        boolean flag = false;
         int idClientDell = readNumber();
        for (Client clientSearch : clients) {
           if(clientSearch.getIdClient() == idClientDell) {
               db.delClient(clientSearch.getIdClient());
               //clients.remove(clients.indexOf(clientSearch));
               System.out.println("*****************************");
               System.out.println("**Клиент удален**");
               flag = true;
               break;
           }
        }
        if (flag == false){
            System.out.println("*****************************");
            System.out.println("Нет Клиента с таким ID");}
    }


    public void showAllClient(){
        clients = db.getClient();
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).getClient();
        }
    }
    
    private int readNumber() {
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
