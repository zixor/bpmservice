package com.aws.codestar.projecttemplates.model;

/**
 * Created by gonzj682 on 10/13/16.
 */
public abstract class Metadata {

    private Long id;
    private String legalTitle;
    private String title;
    private String eidr;
    private String videoType;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getLegalTitle() {
        return legalTitle;
    }

    public void setLegalTitle(final String legalTitle) {
        this.legalTitle = legalTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEidr() {
        return eidr;
    }

    public void setEidr(final String eidr) {
        this.eidr = eidr;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(final String videoType) {
        this.videoType = videoType;
    }
}
