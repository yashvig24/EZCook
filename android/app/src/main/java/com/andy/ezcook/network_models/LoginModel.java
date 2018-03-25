
package com.andy.ezcook.network_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("company")
    @Expose
    private String company;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoginModel() {
    }

    /**
     * 
     * @param company
     * @param name
     * @param password
     */
    public LoginModel(String name, String password, String company) {
        super();
        this.name = name;
        this.password = password;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
