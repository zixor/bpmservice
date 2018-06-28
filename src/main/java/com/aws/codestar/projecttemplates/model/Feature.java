package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Created by gonzj682 on 10/13/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Feature extends Metadata {

    private String mpmProductId;
    //private Long[] radarProductId;
    private String radarSynopsis;
    private String radarGenre;
    private String radarLanguage;
    private String radarLanguageCode;
    private String radarPresentedBy;
    private String radarRatingSystem;
    private String radarRating;
    private Date radarReleaseDate;
    private String radarRuntime;
    private Long radarGroupId;
    private Integer radarCopyrightYear;

    public String getMpmProductId() {
        return mpmProductId;
    }

    public void setMpmProductId(final String mpmProductId) {
        this.mpmProductId = mpmProductId;
    }


    /*public Long[] getRadarProductId() {
        return radarProductId;
    }*/

   /* public void setRadarProductId(Long[] radarProductId) {
        this.radarProductId = radarProductId;
    }*/

    public String getRadarSynopsis() {
        return radarSynopsis;
    }

    public void setRadarSynopsis(final String radarSynopsis) {
        this.radarSynopsis = radarSynopsis;
    }

    public String getRadarGenre() {
        return radarGenre;
    }

    public void setRadarGenre(final String radarGenre) {
        this.radarGenre = radarGenre;
    }

    public String getRadarLanguage() {
        return radarLanguage;
    }

    public void setRadarLanguage(final String radarLanguage) {
        this.radarLanguage = radarLanguage;
    }

    public String getRadarLanguageCode() {
        return radarLanguageCode;
    }

    public void setRadarLanguageCode(final String radarLanguageCode) {
        this.radarLanguageCode = radarLanguageCode;
    }

    public String getRadarPresentedBy() {
        return radarPresentedBy;
    }

    public void setRadarPresentedBy(final String radarPresentedBy) {
        this.radarPresentedBy = radarPresentedBy;
    }

    public String getRadarRatingSystem() {
        return radarRatingSystem;
    }

    public void setRadarRatingSystem(final String radarRatingSystem) {
        this.radarRatingSystem = radarRatingSystem;
    }

    public String getRadarRating() {
        return radarRating;
    }

    public void setRadarRating(final String radarRating) {
        this.radarRating = radarRating;
    }

    public Date getRadarReleaseDate() {
        return radarReleaseDate;
    }

    public void setRadarReleaseDate(Date radarReleaseDate) {
        this.radarReleaseDate = radarReleaseDate;
    }

    public String getRadarRuntime() {
        return radarRuntime;
    }

    public void setRadarRuntime(final String radarRuntime) {
        this.radarRuntime = radarRuntime;
    }


    public Long getRadarGroupId() {
        return radarGroupId;
    }

    public void setRadarGroupId(final Long radarGroupId) {
        this.radarGroupId = radarGroupId;
    }

    public Integer getRadarCopyrightYear() {
        return radarCopyrightYear;
    }

    public void setRadarCopyrightYear(final Integer radarCopyrightYear) {
        this.radarCopyrightYear = radarCopyrightYear;
    }

}
