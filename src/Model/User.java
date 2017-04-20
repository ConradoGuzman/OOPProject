package Model;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class User {

    private String usrName;
    private String usrPassword;
    private String usrType;
    

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
