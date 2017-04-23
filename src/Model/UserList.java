package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/19/17.
 */
public class UserList implements Serializable {

    /**
     * Creates arrayList opbject to contain the User Database
     */
    private final ArrayList<User> database;
    private static UserList instance = new UserList();

    /**
     * Creates a database object to contain the list of users and their passwords
     */
    private UserList()
    {
        database = new ArrayList<>();
    }

    /**
     * Function to add users to the database
     * @param obj user object that we want to add to the list of users.
     */
    public void addUser(User obj){
        database.add(obj);
    }
    
    /**
     * Get the user object
     * @param username the username field of the user object we want to retrieve
     * @return the User object if it is in the User list
     */
    public User getUser(String username) {
        
        for (User user : database) {
            if(username.equals(user.getUsrName())) {
                return user;
            }
        }
        return null;
    }
    
    /**
     * Searches for the username in the list
     * @param username is the username that we are looking for
     * @return Boolean value for if it is present
     */
    public boolean searchUser(String username) {
        
        for (User user : database){
            if(username.equals(user.getUsrName())) {
                return true;
            }
        }
        return false;
    }
    
    public static void resetInstance(UserList list)
    {
        instance = list;
    }
    
    public static UserList getInstance()
    {
        
        return instance;
    }
    
    
    
    
    
}
