import model.Client;
import model.Order;
import model.Product;
import services.CmdLineService;


public class ShopOnline {


    public static void main(String[] args) {
        // TODO code application logic here

        Client client = new Client();
        Order order = new Order();
        Product product = new Product();

        CmdLineService menu = new CmdLineService();
        menu.mainMenu();

    }

}