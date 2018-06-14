package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable{

    @JsonProperty("language_id")
    private Integer language_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("iso_639_1")
    private String iso_639_1;
    @JsonProperty("locale_language")
    private String locale_language;

    public Location() {
    }

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
