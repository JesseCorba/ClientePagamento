
package clientePagamento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jesse
 */
public class Login extends Application{
    private static Stage stage;//janela 1
    
    
    
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Carrega FXML
        Parent root =FXMLLoader.load(getClass().getResource("/View/Login.fxml"));
        // coloca FXML em uma cena
        Scene scene = new Scene(root);
        //Colocar titulo
        stage.setTitle("Login");
        //Coloca cena em uma janela
        stage.setScene(scene);
        //Abre a janela 2
        stage.show();
        //seta janela1 em janela2
        setStage(stage);
    }
    
    public static Stage getStage(){
        return stage;
    }
    
    public static void setStage(Stage stage){
        Login.stage = stage;
    }
}
