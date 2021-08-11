
package nazraa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Maram
 */
public class LavenderController implements Initializable {

    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Parent Profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene ProfileScene = new Scene(Profile);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(ProfileScene);
        stage.setTitle("معلوماتي");
    }
    
    @FXML
    protected void BackScene(MouseEvent e)throws IOException{
        Parent flowers = FXMLLoader.load(getClass().getResource("Flowers.fxml"));
        Scene FlowersScene = new Scene(flowers);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(FlowersScene);
        stage.setTitle("الورود");
    }
    
    @FXML
    protected void DisplayHome(MouseEvent e)throws IOException{
        Parent Home = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene HomeScene = new Scene(Home);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(HomeScene);
        stage.setTitle("الرئيسية");
    }
    
    @FXML
    protected void Exit(MouseEvent e)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene firstScene = new Scene(root);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(firstScene);
        stage.setTitle("نزرع");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
