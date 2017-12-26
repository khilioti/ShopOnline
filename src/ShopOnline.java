import dao.ClientDB;
import model.Order;
import model.Product;
import services.CmdLineService;


public class ShopOnline {


    public static void main(String[] args) {
        // TODO code application logic here
        ClientDB conn = new ClientDB();
        CmdLineService menu = new CmdLineService();
        menu.mainMenu();

    }

}