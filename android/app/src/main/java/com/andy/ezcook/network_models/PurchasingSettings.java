
package com.andy.ezcook.network_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PurchasingSettings {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("rowNumber")
    @Expose
    private Integer rowNumber;
    @SerializedName("note")
    @Expose
    private Object note;
    @SerializedName("POSiteID")
    @Expose
    private POSiteID pOSiteID;
    @SerializedName("POSource")
    @Expose
    private POSource_ pOSource;
    @SerializedName("VendorID")
    @Expose
    private VendorID vendorID;
    @SerializedName("custom")
    @Expose
    private Custom_ custom;
    @SerializedName("files")
    @Expose
    private List<Object> files = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public POSiteID getPOSiteID() {
        return pOSiteID;
    }

    public void setPOSiteID(POSiteID pOSiteID) {
        this.pOSiteID = pOSiteID;
    }

    public POSource_ getPOSource() {
        return pOSource;
    }

    public void setPOSource(POSource_ pOSource) {
        this.pOSource = pOSource;
    }

    public VendorID getVendorID() {
        return vendorID;
    }

    public void setVendorID(VendorID vendorID) {
        this.vendorID = vendorID;
    }

    public Custom_ getCustom() {
        return custom;
    }

    public void setCustom(Custom_ custom) {
        this.custom = custom;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
