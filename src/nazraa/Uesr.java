
package nazraa;

public  class Uesr {
    
    public static String Fname;
    public static String Lname;
    public static String emil;
    public static String password;

    public Uesr() {}

    public Uesr(String Fname, String Lname, String emil, String password) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.emil = emil;
        this.password = password;
    }
    
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmil() {
        return emil;
    }

    public String getPassword() {
        return password;
    }

    public String fullname(){
       return Fname+" "+Lname;
    }
}
