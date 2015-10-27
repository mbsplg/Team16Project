package team16project.textbooktrader;
import java.util.ArrayList;

public class Login {

    //Username for logging in
    private String username;

    //Password for user
    private String password;

    //Result of logging in
    private boolean loginResult;

    //If user wants to remember password
    private boolean rememberPass;

    //Pending  can get the owner of the request
    public String getUsername() {
        return username;
    }

    //Pending can get the requester
    public String getPassword() {
        return password;
    }

    //Pending can get result login
    public boolean getLoginResult() {
        return loginResult;
    }

    //Successful login
    public void loginSuccess() {
        this.loginResult = Boolean.TRUE;
        //load users account
    }

    //Unseccessful login
    public void loginFail() {
        this.loginResult = Boolean.FALSE;
        //display that the login failed and ask user to try again
    }

    public void yesRememberPass() {
        this.rememberPass = Boolean.TRUE;
        //remember password next time user opens app
    }
}