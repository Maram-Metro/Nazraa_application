
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
public class VegetablesController implements Initializable {

    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Parent Profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene ProfileScene = new Scene(Profile);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(ProfileScene);
        stage.setTitle("معلوماتي");
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
    protected void DisplayFlowers(MouseEvent e)throws IOException{
        Parent flowers = FXMLLoader.load(getClass().getResource("Flowers.fxml"));
        Scene FlowersScene = new Scene(flowers);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(FlowersScene);
        stage.setTitle("الورود");
    }
    
    @FXML
    protected void DisplayFruits(MouseEvent e)throws IOException{
        Parent fruits = FXMLLoader.load(getClass().getResource("Fruits.fxml"));
        Scene FruitsScene = new Scene(fruits);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(FruitsScene);
        stage.setTitle("الفواكه");
    }
    
    @FXML
    protected void DisplayLegumes(MouseEvent e)throws IOException{
        Parent legumes = FXMLLoader.load(getClass().getResource("Legumes.fxml"));
        Scene LegumesScene = new Scene(legumes);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(LegumesScene);
        stage.setTitle("البقوليات");
    }
    
    @FXML
    protected void DisplayOlive(MouseEvent e)throws IOException{
        Parent Olive = FXMLLoader.load(getClass().getResource("Olive.fxml"));
        Scene OliveScene = new Scene(Olive);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(OliveScene);
        stage.setTitle("الزيتون");
    }
    
    @FXML
    protected void DisplayMint(MouseEvent e)throws IOException{
        Parent Mint = FXMLLoader.load(getClass().getResource("Mint.fxml"));
        Scene MintScene = new Scene(Mint);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(MintScene);
        stage.setTitle("النعناع");
    }
    
    @FXML
    protected void DisplayLemon(MouseEvent e)throws IOException{
        Parent Lemon = FXMLLoader.load(getClass().getResource("Lemon.fxml"));
        Scene LemonScene = new Scene(Lemon);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(LemonScene);
        stage.setTitle("الليمون");
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
