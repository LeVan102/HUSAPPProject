package Hus;

/**
 *
 * @author LeVan
 */
public class Huser {

    public String name;
    public String ID;
    public String email;

    public Huser(String name, String ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;
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

}
