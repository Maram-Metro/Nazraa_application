
package nazraa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLANTINFO")
public class plantInfo implements java.io.Serializable{
       
    @Id
    @Column(name="nameplant2")
    private String  nameplant2;
        
    @Column(name="Wateringtime")
    private String Wateringtime;
         
    @Column(name="Produce")
    private String Produce;

    public plantInfo() {}
    
    public plantInfo(String nameplant2, String Wateringtime, String Produce) {
        this.nameplant2 = nameplant2;
        this.Wateringtime = Wateringtime;
        this.Produce = Produce;
    }
    
    public String getNameplant2() {
        return nameplant2;
    }

    public String getWateringtime() {
        return Wateringtime;
    }

    public String getProduce() {
        return Produce;
    }

    public void setNameplant2(String nameplant2) {
        this.nameplant2 = nameplant2;
    }

    public void setWateringtime(String Wateringtime) {
        this.Wateringtime = Wateringtime;
    }

    public void setProduce(String Produce) {
        this.Produce = Produce;
    }

}
