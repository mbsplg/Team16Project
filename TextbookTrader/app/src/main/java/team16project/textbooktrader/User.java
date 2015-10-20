package team16project.textbooktrader;

/**
 * Created by BSid on 15-10-19.
 */
public class User {

    private String username;
    private String password;
    private String email;
    private Inventory inventory;
    private FriendList friendList;
    private Profile profile;
    private TradeHistory history;


    protected void User(String uname, String pwrd, String eml){

        username = uname;
        password = pwrd;
        setEmail(eml);


    }

    public void setEmail(String eml){
        //check that email is valid email format
        email = eml;

    }

    public String getEmail(){
        return email;
    }

    public void setPassword(String oldpass, String newpass) {

        if (validatePassword(oldpass)) {
            password = newpass;
        }

    }

    public Boolean validatePassword(String pwd){
        return pwd == password;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public void editInventory(){

    }

    public FriendList getFriendList(){
        return friendList;
    }

    public void editFriendList(){

    }

    public Profile getProfile(){
        return profile;
    }

    public void editProfile(){

    }

    public TradeHistory getHistory(){
        return history;
    }

    public void editHistory(){

    }


}
