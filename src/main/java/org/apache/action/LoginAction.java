package org.apache.action;

public class LoginAction {

    private String userID;
    private String password;


    public String execute(){
        if (this.getUserID().equals("user") && this.getPassword().equals("pass")) {
            return "success";
        }
        return "failure";
    }

    public String getUserID(){
        return this.userID;
    }

    public void setUserID(String pk){
        this.userID = pk;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

}
