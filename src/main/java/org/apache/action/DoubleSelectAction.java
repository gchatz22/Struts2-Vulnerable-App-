package org.apache.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleSelectAction extends ActionSupport{

    private String fruit1;
    private String fruit2;

    private String server1;
    private String server2;

    private String language1;
    private String language2;

    Map languageMap;

    public String getFruit1() {
        return fruit1;
    }

    public void setFruit1(String fruit1) {
        this.fruit1 = fruit1;
    }

    public String getFruit2() {
        return fruit2;
    }

    public void setFruit2(String fruit2) {
        this.fruit2 = fruit2;
    }

    public String getServer1() {
        return server1;
    }

    public void setServer1(String server1) {
        this.server1 = server1;
    }

    public String getServer2() {
        return server2;
    }

    public void setServer2(String server2) {
        this.server2 = server2;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguage2() {
        return language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    public Map getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map languageMap) {
        this.languageMap = languageMap;
    }

    public DoubleSelectAction(){
        languageMap =new HashMap();

        languageMap.put("Java",
                new ArrayList<String>(Arrays.asList("Spring", "Hibernate", "Struts 2")));
        languageMap.put(".Net", new ArrayList<String>(Arrays.asList("VB.Net", "C#")));
        languageMap.put("JavaScript", new ArrayList<String>(Arrays.asList("jQuery")));
    }

    public String execute() {
        return SUCCESS;
    }

    public String display() {
        return NONE;
    }

}