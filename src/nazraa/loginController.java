
package nazraa;

import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Maram
 */
public class loginController implements Initializable{
    
    @FXML
    private ImageView Profile;
    
    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Window owner = Profile.getScene().getWindow();
        showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب تسجيل الدخول أو إنشاء حساب أولا");
        return;
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
    private ImageView homeIcon;
    
    @FXML
    protected void DisplayHome(MouseEvent e)throws IOException{
        Window owner = homeIcon.getScene().getWindow();
        showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب تسجيل الدخول أو إنشاء حساب أولا");
        return;
    }
    
    @FXML
    public TextField emailtf;
    @FXML
    private TextField passwordtf;
    
    @FXML
    protected void Next(KeyEvent e)throws IOException{
        if(e.getCode().equals(KeyCode.ENTER)){
            passwordtf.requestFocus();
        }
    }
    
    @FXML
    protected void Submit(KeyEvent e)throws IOException{
        if(e.getCode().equals(KeyCode.ENTER)){
            buttonLogin(e);
        }
    }
    
    @FXML
    private Button logbtn;
    
    @FXML
    protected void buttonLogin(Event e)throws IOException{
        if (emailtf.getText().equals("") && passwordtf.getText().equals("")) {
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال البريد وكلمة المرور");
            return;
        }
        else if (emailtf.getText().equals("")) {
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال البريد الالكتروني");
            return;
        }
        else if (passwordtf.getText().equals("")) {
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال كلمة المرور");
            return;
        }
        else if (!(isValidEmailAddress(emailtf.getText()))){
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال الأيميل بطريقة صحيحة");
            return;
        }
        else if (!(passwordtf.getText().length() == 8)){
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال كلمة السر ثمانية خانات فقط ");
            return;
        }
        else if (!(isValidPassword(passwordtf.getText()))){
            Window owner = logbtn.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إدخال كلمة السر فقط حروف أو أرقام بالاجليزي");
            return;
        }
        else if (!(emailtf.getText().equals("") && passwordtf.getText().equals(""))){
            Session session3 = HibernateUtil.getSessionFactory().openSession();
            List<sgin> cList = null;
            String queryStr = "from sgin";
            Query query = session3.createQuery(queryStr);
            cList = query.list();
            session3.close();
            System.out.println("Contact list size: "+cList.size());
            
            for(sgin ss: cList){
                if(emailtf.getText().trim().equals(ss.getEmailtf())&& passwordtf.getText().trim().equals(ss.getPasswordtf())){
                    Uesr u=new Uesr(ss.getFnametf(),ss.getLnametf(),ss.getEmailtf(),ss.getPasswordtf());
                    Parent first = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene firstScene = new Scene(first);
                    Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                    stage.setScene(firstScene);
                    stage.setTitle("الصفحة الرئيسية");
                    return;
                }
            }
            
            for(sgin ss: cList){
                if(!(emailtf.getText().trim().equals(ss.getEmailtf())&& passwordtf.getText().trim().equals(ss.getPasswordtf()))){
                    Window owner = logbtn.getScene().getWindow();
                    showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","البريد الالكتروني او كلمة السر غير صحيحه");
                    return; 
                }
            }
        }
    }

    public boolean isValidEmailAddress(String email){
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    public boolean isValidPassword(String password){
        String ePattern = "^[A-Za-z0-9_-]*$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(password);
        return m.matches();
    }
    
    @FXML
    protected void Exit(MouseEvent e)throws IOException{
        exit(0);
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
        // TODO
    }
}