
package nazraa;

import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.controlsfx.control.textfield.TextFields;

public class HomeController implements Initializable {

    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Parent Profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene ProfileScene = new Scene(Profile);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(ProfileScene);
        stage.setTitle("معلوماتي");
    }
    
    @FXML
    protected void BackScene(Event e)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene firstScene = new Scene(root);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(firstScene);
        stage.setTitle("نزرع");
    }
    
    @FXML
    protected void Exit(MouseEvent e)throws IOException{
        exit(0);
    }
    
    @FXML
    private ImageView homeIcon;
    
    @FXML
    protected void DisplayHome(MouseEvent e)throws IOException{
        Window owner = homeIcon.getScene().getWindow();
        showAlert(Alert.AlertType.INFORMATION, owner,"إعلام !!","أنت في الصفحة الرئيسية حاليا");
        return;
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
    
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    @FXML
    protected void Submitbtn(ActionEvent e)throws IOException{
        String text = input.getText();
            if (text.equals("")) {
                return;
            }
            else if (text.equals("لوتس")) {
                Parent Lotus = FXMLLoader.load(getClass().getResource("Lotus.fxml"));
                Scene LotusScene = new Scene(Lotus);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(LotusScene);
                stage.setTitle("اللوتس");
            }
            else if (text.equals("لافندر")) {
                Parent Lavender = FXMLLoader.load(getClass().getResource("Lavender.fxml"));
                Scene LavenderScene = new Scene(Lavender);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(LavenderScene);
                stage.setTitle("اللافندر");
            }
            else if (text.equals("بتونيا")) {
                Parent Petunia = FXMLLoader.load(getClass().getResource("Petunia.fxml"));
                Scene PetuniaScene = new Scene(Petunia);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(PetuniaScene);
                stage.setTitle("البتونيا");
            }
            else if (text.equals("برتقال")) {
                Parent Orange = FXMLLoader.load(getClass().getResource("Orange.fxml"));
                Scene OrangeScene = new Scene(Orange);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OrangeScene);
                stage.setTitle("البرتقال");
            }
            else if (text.equals("رمان")) {
                Parent Roman = FXMLLoader.load(getClass().getResource("Roman.fxml"));
                Scene RomanScene = new Scene(Roman);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(RomanScene);
                stage.setTitle("الرمان");
            }
            else if (text.equals("جوافه")) {
                Parent Guava = FXMLLoader.load(getClass().getResource("Guava.fxml"));
                Scene GuavaScene = new Scene(Guava);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(GuavaScene);
                stage.setTitle("الجوافه");
            }
            else if (text.equals("ليمون")) {
               Parent Lemon = FXMLLoader.load(getClass().getResource("Lemon.fxml"));
               Scene LemonScene = new Scene(Lemon);
               Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
               stage.setScene(LemonScene);
               stage.setTitle("الليمون");
            }
            else if (text.equals("نعناع")) {
                Parent Mint = FXMLLoader.load(getClass().getResource("Mint.fxml"));
                Scene MintScene = new Scene(Mint);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(MintScene);
                stage.setTitle("النعناع");
            } 
            else if (text.equals("زيتون")) {
                Parent Olive = FXMLLoader.load(getClass().getResource("Olive.fxml"));
                Scene OliveScene = new Scene(Olive);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OliveScene);
                stage.setTitle("الزيتون");
            }
            else if (text.equals("لوز")) {
                Parent Almonds = FXMLLoader.load(getClass().getResource("Almonds.fxml"));
                Scene AlmondsScene = new Scene(Almonds);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(AlmondsScene);
                stage.setTitle("اللوز");
            }
            else if (text.equals("صنوبر")) {
                Parent Pine = FXMLLoader.load(getClass().getResource("Pine.fxml"));
                Scene PineScene = new Scene(Pine);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(PineScene);
                stage.setTitle("الصنوبر");
            }
            else if (text.equals("بلوط")) {
                Parent Oak = FXMLLoader.load(getClass().getResource("Oak.fxml"));
                Scene OakScene = new Scene(Oak);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OakScene);
                stage.setTitle("البلوط");
            }
            else  return;
    }
   
    @FXML
    protected void DisplayInfo(MouseEvent e)throws IOException{
        Parent Info = FXMLLoader.load(getClass().getResource("Info.fxml"));
        Scene InfoScene = new Scene(Info);
        Stage stage2 = new Stage();
        stage2.setScene(InfoScene);
        stage2.setTitle("من نحن");
        stage2.show();
    }
    
    @FXML
    protected void Submit(KeyEvent e) throws IOException{
        if(e.getCode().equals(KeyCode.ENTER)){
            String text = input.getText();
            if (text.equals("")) {
                return;
            }
            else if (text.equals("لوتس")) {
                Parent Lotus = FXMLLoader.load(getClass().getResource("Lotus.fxml"));
                Scene LotusScene = new Scene(Lotus);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(LotusScene);
                stage.setTitle("اللوتس");
            }
            else if (text.equals("لافندر")) {
                Parent Lavender = FXMLLoader.load(getClass().getResource("Lavender.fxml"));
                Scene LavenderScene = new Scene(Lavender);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(LavenderScene);
                stage.setTitle("اللافندر");
            }
            else if (text.equals("بتونيا")) {
                Parent Petunia = FXMLLoader.load(getClass().getResource("Petunia.fxml"));
                Scene PetuniaScene = new Scene(Petunia);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(PetuniaScene);
                stage.setTitle("البتونيا");
            }
            else if (text.equals("برتقال")) {
                Parent Orange = FXMLLoader.load(getClass().getResource("Orange.fxml"));
                Scene OrangeScene = new Scene(Orange);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OrangeScene);
                stage.setTitle("البرتقال");
            }
            else if (text.equals("رمان")) {
                Parent Roman = FXMLLoader.load(getClass().getResource("Roman.fxml"));
                Scene RomanScene = new Scene(Roman);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(RomanScene);
                stage.setTitle("الرمان");
            }
            else if (text.equals("جوافه")) {
                Parent Guava = FXMLLoader.load(getClass().getResource("Guava.fxml"));
                Scene GuavaScene = new Scene(Guava);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(GuavaScene);
                stage.setTitle("الجوافه");
            }
            else if (text.equals("ليمون")) {
               Parent Lemon = FXMLLoader.load(getClass().getResource("Lemon.fxml"));
               Scene LemonScene = new Scene(Lemon);
               Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
               stage.setScene(LemonScene);
               stage.setTitle("الليمون");
            }
            else if (text.equals("نعناع")) {
                Parent Mint = FXMLLoader.load(getClass().getResource("Mint.fxml"));
                Scene MintScene = new Scene(Mint);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(MintScene);
                stage.setTitle("النعناع");
            } 
            else if (text.equals("زيتون")) {
                Parent Olive = FXMLLoader.load(getClass().getResource("Olive.fxml"));
                Scene OliveScene = new Scene(Olive);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OliveScene);
                stage.setTitle("الزيتون");
            }
            else if (text.equals("لوز")) {
                Parent Almonds = FXMLLoader.load(getClass().getResource("Almonds.fxml"));
                Scene AlmondsScene = new Scene(Almonds);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(AlmondsScene);
                stage.setTitle("اللوز");
            }
            else if (text.equals("صنوبر")) {
                Parent Pine = FXMLLoader.load(getClass().getResource("Pine.fxml"));
                Scene PineScene = new Scene(Pine);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(PineScene);
                stage.setTitle("الصنوبر");
            }
            else if (text.equals("بلوط")) {
                Parent Oak = FXMLLoader.load(getClass().getResource("Oak.fxml"));
                Scene OakScene = new Scene(Oak);
                Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(OakScene);
                stage.setTitle("البلوط");
            }
            else  return;
        }
    }
    
   
    @FXML
    TextField input;
    
    String[] words = {"بلوط","صنوبر","لوز","زيتون","نعناع","ليمون","جوافه","رمان","برتقال","بتونيا","لافندر","لوتس"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //search suggestion
        //https://youtu.be/SkXYg3M0hOQ
        TextFields.bindAutoCompletion(input, words);
        
    }    
    
}
