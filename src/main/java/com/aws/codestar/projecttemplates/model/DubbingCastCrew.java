package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DubbingCastCrew {

    private Feature feature;
    private String titleEIDR;
    private String productCompany;
    private List<Cast> castList;
    private String reviewComments;

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
    }

    public String getTitleEIDR() {
        return titleEIDR;
    }

    public void setTitleEIDR(String titleEIDR) {
        this.titleEIDR = titleEIDR;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }
}
