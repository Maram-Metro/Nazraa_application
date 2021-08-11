
package nazraa;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;


public class firstController implements Initializable{
    
    @FXML
    private ImageView Profile;
    @FXML
    private ImageView an1;
    @FXML
    private ImageView an2;
    @FXML
    private ImageView an3;
    @FXML
    private ImageView an4;
    @FXML
    private ImageView an5;
    
    
    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Window owner = Profile.getScene().getWindow();
        showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب تسجيل الدخول أو إنشاء حساب أولا");
        return;
    }
    
    @FXML
    protected void DisplayInfo(MouseEvent e)throws IOException{
        Parent Info = FXMLLoader.load(getClass().getResource("Info.fxml"));
        Scene InfoScene = new Scene(Info);
        Stage stage = new Stage();
        stage.setScene(InfoScene);
        stage.setTitle("من نحن");
        stage.show();
    }
    
    @FXML
    public void entred(Event e){
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);
    }
    
    @FXML
    public void exited(Event e){
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);
    }
    
    @FXML
    protected void DisplaySgin (ActionEvent e) throws IOException{
        Parent Sign = FXMLLoader.load(getClass().getResource("Sgin.fxml"));
        Scene SigninScene = new Scene(Sign);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(SigninScene);
        stage.setTitle("إنشاء حساب");
    };
    
    @FXML
    protected void DisplayLogin (ActionEvent e) throws IOException{
        Parent log = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene LoginScene = new Scene(log);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(LoginScene);
        stage.setTitle("تسجيل الدخول");
    };
    
    @FXML
    private ImageView homeIcon;
    
    @FXML
    protected void DisplayHome(Event e)throws IOException{
        Window owner = homeIcon.getScene().getWindow();
        showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب تسجيل الدخول أو إنشاء حساب أولا");
        return;
    }
    
    @FXML
    protected void Exit(MouseEvent e)throws IOException{
        exit(0);
    }
    
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //animation 
        //https://www.tutorialspoint.com/javafx/javafx_animations.htm
        //https://youtu.be/MgD2FxMr7AA
        
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000)); 
        rotateTransition.setNode(an1);  
        rotateTransition.setByAngle(6); 
        rotateTransition.setCycleCount(50); 
        rotateTransition.setAutoReverse(false); 
        rotateTransition.play(); 
        
        RotateTransition rotateTransition2= new RotateTransition();
        rotateTransition2.setDuration(Duration.millis(1000)); 
        rotateTransition2.setNode(an2);  
        rotateTransition2.setByAngle(3); 
        rotateTransition2.setCycleCount(50); 
        rotateTransition2.setAutoReverse(false);
        rotateTransition2.play();
        
        TranslateTransition t=new TranslateTransition();
        t.setDuration(Duration.seconds(2));
        t.setToY(20);
        t.setToX(0);
        t.setAutoReverse(true);
        t.setCycleCount(Animation.INDEFINITE);
        t.setNode(an3);
        t.play();
        
        RotateTransition rotateTransition3= new RotateTransition();
        rotateTransition3.setDuration(Duration.millis(1000)); 
        rotateTransition3.setNode(an4);  
        rotateTransition3.setByAngle(3); 
        rotateTransition3.setCycleCount(50);
        rotateTransition3.setAutoReverse(false); 
        rotateTransition3.play(); 
        
        RotateTransition rotateTransition4= new RotateTransition();
        rotateTransition4.setDuration(Duration.millis(1000)); 
        rotateTransition4.setNode(an5);  
        rotateTransition4.setByAngle(3);
        rotateTransition4.setCycleCount(50); 
        rotateTransition4.setAutoReverse(false);
        rotateTransition4.play(); 
    }
}