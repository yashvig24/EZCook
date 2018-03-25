
package com.andy.ezcook.network_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceOrderRequest {

    @SerializedName("OrderType")
    @Expose
    private OrderType orderType;
    @SerializedName("CustomerID")
    @Expose
    private CustomerID customerID;
    @SerializedName("Description")
    @Expose
    private Description description;
    @SerializedName("CustomerOrder")
    @Expose
    private CustomerOrder customerOrder;
    @SerializedName("Details")
    @Expose
    private List<Detail> details;

    public PlaceOrderRequest(List<Detail> details, OrderType orderType, CustomerID customerID, Description description, CustomerOrder customerOrder) {
        this.orderType = orderType;
        this.customerID = customerID;
        this.description = description;
        this.customerOrder = customerOrder;
        this.details = details;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(CustomerID customerID) {
        this.customerID = customerID;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
