package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/19/17.
 */
public class UserList implements Serializable {
    
    private final ArrayList<User> database;
    private static UserList instance = new UserList();
    
    private UserList()
    {
        database = new ArrayList<>();
    }
    
    public void addUser(User obj){
        database.add(obj);
    }
    
    /**
     * Get the user object
     * @param username
     * @return
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
     * @param username
     * @return
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
