
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
public class FruitsController implements Initializable {

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
    protected void DisplayVegetables(MouseEvent e)throws IOException{
        Parent vegetables = FXMLLoader.load(getClass().getResource("Vegetables.fxml"));
        Scene VegetablesScene = new Scene(vegetables);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(VegetablesScene);
        stage.setTitle("الخضروات");
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
    protected void Exit(MouseEvent e)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene firstScene = new Scene(root);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(firstScene);
        stage.setTitle("نزرع");
    }
    
    @FXML
    protected void DisplayGuava(MouseEvent e)throws IOException{
        Parent Guava = FXMLLoader.load(getClass().getResource("Guava.fxml"));
        Scene GuavaScene = new Scene(Guava);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(GuavaScene);
        stage.setTitle("الجوافه");
    }
    
    @FXML
    protected void DisplayOrange(MouseEvent e)throws IOException{
        Parent Orange = FXMLLoader.load(getClass().getResource("Orange.fxml"));
        Scene OrangeScene = new Scene(Orange);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(OrangeScene);
        stage.setTitle("البرتقال");
    }
    
    @FXML
    protected void DisplayRoman(MouseEvent e)throws IOException{
        Parent Roman = FXMLLoader.load(getClass().getResource("Roman.fxml"));
        Scene RomanScene = new Scene(Roman);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(RomanScene);
        stage.setTitle("الرمان");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}