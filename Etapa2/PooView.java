import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class PooView extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carrega o arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela-1.fxml"));
            Parent root = loader.load();

            // Configura a cena e o palco
            Scene scene = new Scene(root, 640, 400);
            primaryStage.setTitle("Teste");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
         launch(args);
    }
}