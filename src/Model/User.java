package Model;
import java.io.Serializable;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class User implements Serializable {

    private String usrName;
    private String usrPassword;
    private String usrType;


    /**
     * Constructor for User Objects
     * @param user the username
     * @param password the password
     * @param type weather the user is a buyer or a seller
     */
    public User(String user, String password, String type)
    {
        usrName = user;
        usrPassword = password;
        usrType = type;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return this.usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrType() {
        return usrType;
    }


}
