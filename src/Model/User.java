package Model;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class User {

    private String usrName;
    private String usrPassword;
    private String usrType;
    

    public User(String userName, String usrPassword, String usrType)
    {
        this.usrName = userName;
        this.usrPassword = usrPassword;
        this.usrType = usrType;
    }



    public String getUsrName() {
        return this.usrName;
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
