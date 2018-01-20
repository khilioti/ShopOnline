import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.CmdLineService;


public class ShopOnline extends Application {

    public static void main(String[] args) {

        //ClientDB conn = new ClientDB();
//        CmdLineService menu = new CmdLineService();
//        menu.mainMenu();

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scenes/ShopOnlineMain.fxml"));
        primaryStage.setTitle("Program");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

}

