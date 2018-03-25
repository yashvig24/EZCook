
package com.andy.ezcook.network_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("InventoryID")
    @Expose
    private InventoryID inventoryID;

    public Detail(InventoryID inventoryID, OrderQty orderQty, UOM uOM) {
        this.inventoryID = inventoryID;
        this.orderQty = orderQty;
        this.uOM = uOM;
    }

    @SerializedName("OrderQty")
    @Expose
    private OrderQty orderQty;
    @SerializedName("UOM")
    @Expose
    private UOM uOM;

    public InventoryID getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(InventoryID inventoryID) {
        this.inventoryID = inventoryID;
    }

    public OrderQty getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(OrderQty orderQty) {
        this.orderQty = orderQty;
    }

    public UOM getUOM() {
        return uOM;
    }

    public void setUOM(UOM uOM) {
        this.uOM = uOM;
    }

}
