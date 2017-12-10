package services;

import model.Client;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientServices {
    private Client client = new Client();

    public void addClient(){
        try{
            Scanner command1 = new Scanner(System.in);
          int  bt1 = command1.nextInt();
            Scanner command2 = new Scanner(System.in);
          String  bt2 = command2.nextLine();
            Scanner command3 = new Scanner(System.in);
          String  bt3 = command3.nextLine();
            Scanner command = new Scanner(System.in);
            int bt = command.nextInt();
            client.setClient(bt1,bt2,bt3, bt);
        }catch (InputMismatchException ignored){


    }}
    public void editClient(){}
    public void delClient(){}
    public void showAllClient(){
        client.getClient();
    }
}
