package Model;

import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/19/17.
 */
public class UserList {

    private ArrayList<User> database;

    private static final UserList instance = new UserList();

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

    public static UserList getInstance()
    {
        return instance;
    }
}
