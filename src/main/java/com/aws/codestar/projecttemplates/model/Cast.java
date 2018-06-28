package com.aws.codestar.projecttemplates.model;

/**
 * Cast and crew representation
 *
 * @author noel.gonzalez
 */
public class Cast {

    private String billingOrder;
    private String firstName;
    private String lastName;
    private String cast;

    public Cast(String billingOrder, String firstName, String lastName, String cast) {
        this.billingOrder = billingOrder;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cast = cast;
    }

    public String getBillingOrder() {
        return billingOrder;
    }

    public void setBillingOrder(String billingOrder) {
        this.billingOrder = billingOrder;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}
