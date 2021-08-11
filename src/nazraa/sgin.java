
package nazraa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SGIN")
public class sgin   implements java.io.Serializable{
   
    @Column(name="Fnametf")
    private String Fnametf;
     
    @Column(name="Lnametf")
    private String Lnametf;
      
    @Id
    @Column(name="emailtf")
    private String emailtf;
    
    @Column(name="passwordtf")
    private String passwordtf;

    public sgin(String Fnametf, String Lnametf, String emailtf, String passwordtf) {
        this.Fnametf = Fnametf;
        this.Lnametf = Lnametf;
        this.emailtf = emailtf;
        this.passwordtf = passwordtf;
    }

    public sgin() {}

    public String getFnametf() {
        return Fnametf;
    }

    public String getLnametf() {
        return Lnametf;
    }

    public String getEmailtf() {
        return emailtf;
    }

    public String getPasswordtf() {
        return passwordtf;
    }

    public void setFnametf(String Fnametf) {
        this.Fnametf = Fnametf;
    }

    public void setLnametf(String Lnametf) {
        this.Lnametf = Lnametf;
    }

    public void setEmailtf(String emailtf) {
        this.emailtf = emailtf;
    }

    public void setPasswordtf(String passwordtf) {
        this.passwordtf = passwordtf;
    }
}
