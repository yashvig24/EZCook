
package com.andy.ezcook.network_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Commissionable {

    @SerializedName("value")
    @Expose
    private Boolean value;

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

}
