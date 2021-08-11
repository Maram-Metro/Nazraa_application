
package nazraa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROFILE")
public class Profile implements java.io.Serializable{
    
    @Id
    @Column(name="namepalnt")
    private String namepalnt;
    
    @Column(name="date")
    private String date;
        
    @Column(name="emailtf")
    private String emailtf;

    public Profile() {}

    public Profile(String namepalnt, String date, String emailtf) {
        this.namepalnt = namepalnt;
        this.date = date;
        this.emailtf = emailtf;
    }

    public String getEmailtf() {
        return emailtf;
    }

    public void setEmailtf(String emailtf) {
        this.emailtf = emailtf;
    }

    public Profile(String namepalnt, String date) {
        this.namepalnt = namepalnt;
        this.date = date;
    }

    public void setNamepalnt(String namepalnt) {
        this.namepalnt = namepalnt;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNamepalnt() {
        return namepalnt;
    }

    public String getDate() {
        return date;
    }

}
