package org.apache.action;

public class LangFinderService {

    public String getBestLang(String language){
        if (language.equals("java")){
            return "nice you chose java?!?";
        } else {
            return "okay cool language";
        }
    }

}
