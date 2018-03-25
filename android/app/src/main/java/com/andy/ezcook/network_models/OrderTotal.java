
package com.andy.ezcook.network_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderTotal {

    @SerializedName("value")
    @Expose
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
