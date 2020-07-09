package org.apache.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class SearchAction extends ActionSupport {
    String input;

    public void validate() {
        if (StringUtils.isEmpty(this.getInput())){
            addFieldError("input", "Input cannot be blank!");
        }
    }

    public String execute() {
        if (input == null) {
            return "input";
        } else {
            return "success";
        }
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(String input){
        this.input = input;
    }
}
