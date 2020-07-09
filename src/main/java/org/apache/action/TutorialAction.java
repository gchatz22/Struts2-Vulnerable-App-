package org.apache.action;

public class TutorialAction {

    private String language;

    public String execute(){
//        LangFinderService service = new LangFinderService();
//        language = service.getBestLang(this.getLanguage());
        return "success";
    }

    public String getLanguage(){
        return this.language;
    }

    public void setLanguage(String lang){
        this.language = lang;
    }
}
