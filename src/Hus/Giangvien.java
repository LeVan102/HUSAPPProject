package Hus;

/**
 *
 * @author LeVan
 */
public class Giangvien {
    String ID;
    String name;
    String email;
    String gender;

    public Giangvien(String ID, String name, String email, String gender) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public Giangvien(){
        
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toGiangVien() {
        return this.getID().trim() + "," + this.getName().trim() + "," + this.getEmail().trim() + ","
                + this.getGender().trim();
    }

    public Object[] toArray() {
        return new Object[]{ID, name, email, gender};
    }
}
