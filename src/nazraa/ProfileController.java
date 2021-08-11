
package nazraa;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import static nazraa.Uesr.Fname;
import static nazraa.Uesr.Lname;
import static nazraa.Uesr.emil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProfileController implements Initializable {
    static Profile p = new  Profile();
    static plantInfo i = new plantInfo();
    
    @FXML
    private ComboBox <String> namepalnt;

    ObservableList<String> myimplantsList = FXCollections.observableArrayList("البلوط","الصنوبر","اللوز","الزيتون","النعناع","الليمون","الجوافه","الرمان","البرتقال","البتونيا","اللافندر","اللوتس");
    ObservableList<String> plantName; 
    ObservableList<String> plantdate;
    ObservableList<String> plantWateringtime;
    ObservableList<String> plantProduce;
   
    @FXML
    private ImageView Profile;
    @FXML
    private Text name;
    @FXML
    private DatePicker date;
    @FXML
    private Button add;
    @FXML
    private Button delet;
    @FXML
    private ListView  nameplant2;
    @FXML
    private  ListView dateplant;
    @FXML
    private ListView Wateringtime;
    @FXML
    private ListView Produce;
   
    @FXML
    protected void DisplayProfile (MouseEvent e)throws IOException{
        Window owner = Profile.getScene().getWindow();
        showAlert(Alert.AlertType.INFORMATION, owner,"إعلام !!","أنت الان في صفحتك الشخصية حاليا");
        return;
    }
    
    @FXML
    private void Exit(MouseEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene firstScene = new Scene(root);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(firstScene);
        stage.setTitle("نزرع");
    }

    @FXML
    private void DisplayHome(MouseEvent e) throws IOException{
        Parent Home = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene HomeScene = new Scene(Home);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(HomeScene);
        stage.setTitle("الرئيسية");
    }

    @FXML
    private void BackScene(MouseEvent e) throws IOException{
        Parent Home = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene HomeScene = new Scene(Home);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(HomeScene);
        stage.setTitle("الرئيسية");
    }
   
    @FXML
    private void addplant(Event e) throws IOException{
        if (namepalnt.getValue() == null && date.getValue() == null) {
            Window owner = add.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إختيار أسم الزرعه وتاريخ بداية الزراعه ");
            return;
        }
        
        else if (namepalnt.getValue() == null ){
            Window owner = add.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إختيار أسم الزرعه ");
            return;
        }
         
        else if (date.getValue() == null ){
            Window owner = add.getScene().getWindow();
            showAlert(Alert.AlertType.ERROR, owner,"خطأ !!","يجب إختيار تاريخ بداية الزراعه ");
            return;
        }
        
        else if (!(namepalnt.getValue().equals("")&&date.getValue().equals("") )){
            Profile S= new  Profile(namepalnt.getValue(),date.getValue().toString(),emil);
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session1.beginTransaction();
            session1.save(S);
            tx.commit();
            session1.close();
            
            Session session4 = HibernateUtil.getSessionFactory().openSession();
            List<plantInfo> plantList = null;
            String queryStr = "from plantInfo";
            Query query = session4.createQuery(queryStr);
            plantList = query.list();
            session4.close();
            System.out.println("list size: "+plantList.size());
            
            for(plantInfo plant: plantList){
                if(namepalnt.getValue().equals(plant.getNameplant2())){
                    plantName = FXCollections.observableArrayList(namepalnt.getValue());
                    plantdate = FXCollections.observableArrayList(date.getValue().toString());
                    plantWateringtime = FXCollections.observableArrayList(plant.getWateringtime());
                    plantProduce = FXCollections.observableArrayList(plant.getProduce());
                    
                    nameplant2.getItems().addAll(plantName);
                    dateplant.getItems().addAll( plantdate);
                    Wateringtime.getItems().addAll(plantWateringtime);
                    Produce.getItems().addAll( plantProduce);
                }
            }
        }
    }
  
   
    @FXML
    private void deletplant(Event e) throws IOException{
        
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx2 = null;
        tx2 = session2.beginTransaction();
        session2.delete(p);
        tx2.commit();
        System.out.println("deleted plant: "+ p.getNamepalnt());
        session2.close();
        
        plantName.remove(p.getNamepalnt());
        plantdate.remove(p.getDate());
        plantWateringtime.remove(i.getWateringtime());
        plantProduce.remove(i.getProduce());
        
        Parent Profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene ProfileScene = new Scene(Profile);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(ProfileScene);
        stage.setTitle("معلوماتي");
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
    private void Listener(MouseEvent m ) throws IOException{
        listener();
    }
 
    private void listener(){
        
        nameplant2.getSelectionModel().selectedItemProperty().addListener(e-> {
            nameplant2.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            int index = nameplant2.getSelectionModel().getSelectedIndex();
            dateplant.getSelectionModel().select(index);
            Wateringtime.getSelectionModel().select(index);
            Produce.getSelectionModel().select(index);
            
            p.setNamepalnt(nameplant2.getSelectionModel().getSelectedItem().toString());
            p.setDate(dateplant.getSelectionModel().getSelectedItem().toString());
            i.setWateringtime(Wateringtime.getSelectionModel().getSelectedItem().toString());
            i.setProduce(Produce.getSelectionModel().getSelectedItem().toString());
        }); 
        
        dateplant.getSelectionModel().selectedItemProperty().addListener(e-> {
            dateplant.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            int index = dateplant.getSelectionModel().getSelectedIndex();
            nameplant2.getSelectionModel().select(index);
            Wateringtime.getSelectionModel().select(index);
            Produce.getSelectionModel().select(index);
            
            p.setNamepalnt(nameplant2.getSelectionModel().getSelectedItem().toString());
            p.setDate(dateplant.getSelectionModel().getSelectedItem().toString());
            i.setWateringtime(Wateringtime.getSelectionModel().getSelectedItem().toString());
            i.setProduce(Produce.getSelectionModel().getSelectedItem().toString());
        });
        
        Wateringtime.getSelectionModel().selectedItemProperty().addListener(e-> {
            Wateringtime.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            int index =   Wateringtime.getSelectionModel().getSelectedIndex();
            dateplant.getSelectionModel().select(index);
            nameplant2.getSelectionModel().select(index);
            Produce.getSelectionModel().select(index);
            
            p.setNamepalnt(nameplant2.getSelectionModel().getSelectedItem().toString());
            p.setDate(dateplant.getSelectionModel().getSelectedItem().toString());
            i.setWateringtime(Wateringtime.getSelectionModel().getSelectedItem().toString());
            i.setProduce(Produce.getSelectionModel().getSelectedItem().toString());
        }); 
        
        Produce.getSelectionModel().selectedItemProperty().addListener(e-> {
            Produce.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            int index = Produce.getSelectionModel().getSelectedIndex();
            dateplant.getSelectionModel().select(index);
            Wateringtime.getSelectionModel().select(index);
            nameplant2.getSelectionModel().select(index);
            
            p.setNamepalnt(nameplant2.getSelectionModel().getSelectedItem().toString());
            p.setDate(dateplant.getSelectionModel().getSelectedItem().toString());
            i.setWateringtime(Wateringtime.getSelectionModel().getSelectedItem().toString());
            i.setProduce(Produce.getSelectionModel().getSelectedItem().toString());
        });  
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
  
    public void initialize(URL url, ResourceBundle rb) {
        namepalnt.setItems(myimplantsList);
        name.setText(Fname+" "+Lname);
        listener ();
        
        Session session3 = HibernateUtil.getSessionFactory().openSession();
        List<Profile> cList = null;
        String queryStr = "from  Profile";
        Query query = session3.createQuery(queryStr);
        cList = query.list();
        session3.close();
        System.out.println("Info plant size: "+cList.size());
        int count;
        count = cList.size();
        
        for( Profile c: cList){
            if(emil.equals(c.getEmailtf())){
                plantName = FXCollections.observableArrayList(c.getNamepalnt());
                plantdate = FXCollections.observableArrayList(c.getDate());
                
                nameplant2.getItems().addAll(plantName);
                dateplant.getItems().addAll( plantdate);
            }
        }
        Session session4 = HibernateUtil.getSessionFactory().openSession();
        List< plantInfo> cListt = null;
        String queryStrr = "from  plantInfo";
        Query queryy = session4.createQuery(queryStrr);
        cListt = queryy.list();
        session4.close();
        System.out.println("Info plant size: "+cListt.size());
        
        for(Profile c: cList) {
            if(emil.equals(c.getEmailtf())){
                for(plantInfo p: cListt){
                    if(c.getNamepalnt().equals(p.getNameplant2())){
                        plantWateringtime = FXCollections.observableArrayList(p.getWateringtime());
                        plantProduce = FXCollections.observableArrayList(p.getProduce());
                        
                        Wateringtime.getItems().addAll(plantWateringtime);
                        Produce.getItems().addAll(plantProduce);
                    }
                }
            }
        }
    }
}
