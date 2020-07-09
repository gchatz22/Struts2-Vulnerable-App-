package org.apache.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class LoginAction extends ActionSupport {

    private String userID;
    private String password;

    public void validate(){
        if (StringUtils.isEmpty(this.getUserID())){
            addFieldError("userID", "User ID cannot be blank!");
        }

        if (StringUtils.isEmpty(this.getPassword())){
            addFieldError("password", "Password cannot be blank!");
        }
    }

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
