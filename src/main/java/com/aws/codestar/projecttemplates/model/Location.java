package com.aws.codestar.projecttemplates.model;

public class Location {

    private Integer language_id;
    private String name;
    private String iso_639_1;
    private String locale_language;

    public Location(Integer language_id, String name, String iso_639_1, String locale_language) {
        this.language_id = language_id;
        this.name = name;
        this.iso_639_1 = iso_639_1;
        this.locale_language = locale_language;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }

    public String getLocale_language() {
        return locale_language;
    }

}
