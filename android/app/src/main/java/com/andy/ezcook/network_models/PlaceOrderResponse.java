
package com.andy.ezcook.network_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceOrderResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("rowNumber")
    @Expose
    private Integer rowNumber;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("Approved")
    @Expose
    private Approved approved;
    @SerializedName("BaseCurrencyID")
    @Expose
    private BaseCurrencyID baseCurrencyID;
    @SerializedName("BillToAddressOverride")
    @Expose
    private BillToAddressOverride billToAddressOverride;
    @SerializedName("BillToContactOverride")
    @Expose
    private BillToContactOverride billToContactOverride;
    @SerializedName("CashAccount")
    @Expose
    private CashAccount cashAccount;
    @SerializedName("ControlTotal")
    @Expose
    private ControlTotal controlTotal;
    @SerializedName("CreditHold")
    @Expose
    private CreditHold creditHold;
    @SerializedName("CurrencyID")
    @Expose
    private CurrencyID currencyID;
    @SerializedName("CurrencyRate")
    @Expose
    private CurrencyRate currencyRate;
    @SerializedName("CurrencyRateTypeID")
    @Expose
    private CurrencyRateTypeID currencyRateTypeID;
    @SerializedName("CustomerID")
    @Expose
    private CustomerID customerID;
    @SerializedName("CustomerOrder")
    @Expose
    private CustomerOrder customerOrder;
    @SerializedName("Date")
    @Expose
    private Date date;
    @SerializedName("Description")
    @Expose
    private Description description;
    @SerializedName("DestinationWarehouseID")
    @Expose
    private DestinationWarehouseID destinationWarehouseID;
    @SerializedName("Details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("EffectiveDate")
    @Expose
    private EffectiveDate effectiveDate;
    @SerializedName("ExternalRef")
    @Expose
    private ExternalRef externalRef;
    @SerializedName("Hold")
    @Expose
    private Hold hold;
    @SerializedName("IsTaxValid")
    @Expose
    private IsTaxValid isTaxValid;
    @SerializedName("LastModified")
    @Expose
    private LastModified lastModified;
    @SerializedName("LocationID")
    @Expose
    private LocationID_ locationID;
    @SerializedName("NewCard")
    @Expose
    private NewCard newCard;
    @SerializedName("OrderedQty")
    @Expose
    private OrderedQty orderedQty;
    @SerializedName("OrderNbr")
    @Expose
    private OrderNbr_ orderNbr;
    @SerializedName("OrderTotal")
    @Expose
    private OrderTotal orderTotal;
    @SerializedName("OrderType")
    @Expose
    private OrderType_ orderType;
    @SerializedName("PaymentCardIdentifier")
    @Expose
    private PaymentCardIdentifier paymentCardIdentifier;
    @SerializedName("PaymentMethod")
    @Expose
    private PaymentMethod paymentMethod;
    @SerializedName("PaymentRef")
    @Expose
    private PaymentRef paymentRef;
    @SerializedName("PreAuthorizationNbr")
    @Expose
    private PreAuthorizationNbr preAuthorizationNbr;
    @SerializedName("PreAuthorizedAmount")
    @Expose
    private PreAuthorizedAmount preAuthorizedAmount;
    @SerializedName("PreferredWarehouseID")
    @Expose
    private PreferredWarehouseID preferredWarehouseID;
    @SerializedName("Project")
    @Expose
    private Project project;
    @SerializedName("ReciprocalRate")
    @Expose
    private ReciprocalRate reciprocalRate;
    @SerializedName("RequestedOn")
    @Expose
    private RequestedOn_ requestedOn;
    @SerializedName("ShipToAddressOverride")
    @Expose
    private ShipToAddressOverride shipToAddressOverride;
    @SerializedName("ShipToContactOverride")
    @Expose
    private ShipToContactOverride shipToContactOverride;
    @SerializedName("ShipVia")
    @Expose
    private ShipVia shipVia;
    @SerializedName("Status")
    @Expose
    private Status status;
    @SerializedName("TaxTotal")
    @Expose
    private TaxTotal taxTotal;
    @SerializedName("VATExemptTotal")
    @Expose
    private VATExemptTotal vATExemptTotal;
    @SerializedName("VATTaxableTotal")
    @Expose
    private VATTaxableTotal vATTaxableTotal;
    @SerializedName("custom")
    @Expose
    private Custom___ custom;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Approved getApproved() {
        return approved;
    }

    public void setApproved(Approved approved) {
        this.approved = approved;
    }

    public BaseCurrencyID getBaseCurrencyID() {
        return baseCurrencyID;
    }

    public void setBaseCurrencyID(BaseCurrencyID baseCurrencyID) {
        this.baseCurrencyID = baseCurrencyID;
    }

    public BillToAddressOverride getBillToAddressOverride() {
        return billToAddressOverride;
    }

    public void setBillToAddressOverride(BillToAddressOverride billToAddressOverride) {
        this.billToAddressOverride = billToAddressOverride;
    }

    public BillToContactOverride getBillToContactOverride() {
        return billToContactOverride;
    }

    public void setBillToContactOverride(BillToContactOverride billToContactOverride) {
        this.billToContactOverride = billToContactOverride;
    }

    public CashAccount getCashAccount() {
        return cashAccount;
    }

    public void setCashAccount(CashAccount cashAccount) {
        this.cashAccount = cashAccount;
    }

    public ControlTotal getControlTotal() {
        return controlTotal;
    }

    public void setControlTotal(ControlTotal controlTotal) {
        this.controlTotal = controlTotal;
    }

    public CreditHold getCreditHold() {
        return creditHold;
    }

    public void setCreditHold(CreditHold creditHold) {
        this.creditHold = creditHold;
    }

    public CurrencyID getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(CurrencyID currencyID) {
        this.currencyID = currencyID;
    }

    public CurrencyRate getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(CurrencyRate currencyRate) {
        this.currencyRate = currencyRate;
    }

    public CurrencyRateTypeID getCurrencyRateTypeID() {
        return currencyRateTypeID;
    }

    public void setCurrencyRateTypeID(CurrencyRateTypeID currencyRateTypeID) {
        this.currencyRateTypeID = currencyRateTypeID;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(CustomerID customerID) {
        this.customerID = customerID;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public DestinationWarehouseID getDestinationWarehouseID() {
        return destinationWarehouseID;
    }

    public void setDestinationWarehouseID(DestinationWarehouseID destinationWarehouseID) {
        this.destinationWarehouseID = destinationWarehouseID;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public EffectiveDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(EffectiveDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ExternalRef getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(ExternalRef externalRef) {
        this.externalRef = externalRef;
    }

    public Hold getHold() {
        return hold;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }

    public IsTaxValid getIsTaxValid() {
        return isTaxValid;
    }

    public void setIsTaxValid(IsTaxValid isTaxValid) {
        this.isTaxValid = isTaxValid;
    }

    public LastModified getLastModified() {
        return lastModified;
    }

    public void setLastModified(LastModified lastModified) {
        this.lastModified = lastModified;
    }

    public LocationID_ getLocationID() {
        return locationID;
    }

    public void setLocationID(LocationID_ locationID) {
        this.locationID = locationID;
    }

    public NewCard getNewCard() {
        return newCard;
    }

    public void setNewCard(NewCard newCard) {
        this.newCard = newCard;
    }

    public OrderedQty getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(OrderedQty orderedQty) {
        this.orderedQty = orderedQty;
    }

    public OrderNbr_ getOrderNbr() {
        return orderNbr;
    }

    public void setOrderNbr(OrderNbr_ orderNbr) {
        this.orderNbr = orderNbr;
    }

    public OrderTotal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(OrderTotal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public OrderType_ getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType_ orderType) {
        this.orderType = orderType;
    }

    public PaymentCardIdentifier getPaymentCardIdentifier() {
        return paymentCardIdentifier;
    }

    public void setPaymentCardIdentifier(PaymentCardIdentifier paymentCardIdentifier) {
        this.paymentCardIdentifier = paymentCardIdentifier;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentRef getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(PaymentRef paymentRef) {
        this.paymentRef = paymentRef;
    }

    public PreAuthorizationNbr getPreAuthorizationNbr() {
        return preAuthorizationNbr;
    }

    public void setPreAuthorizationNbr(PreAuthorizationNbr preAuthorizationNbr) {
        this.preAuthorizationNbr = preAuthorizationNbr;
    }

    public PreAuthorizedAmount getPreAuthorizedAmount() {
        return preAuthorizedAmount;
    }

    public void setPreAuthorizedAmount(PreAuthorizedAmount preAuthorizedAmount) {
        this.preAuthorizedAmount = preAuthorizedAmount;
    }

    public PreferredWarehouseID getPreferredWarehouseID() {
        return preferredWarehouseID;
    }

    public void setPreferredWarehouseID(PreferredWarehouseID preferredWarehouseID) {
        this.preferredWarehouseID = preferredWarehouseID;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ReciprocalRate getReciprocalRate() {
        return reciprocalRate;
    }

    public void setReciprocalRate(ReciprocalRate reciprocalRate) {
        this.reciprocalRate = reciprocalRate;
    }

    public RequestedOn_ getRequestedOn() {
        return requestedOn;
    }

    public void setRequestedOn(RequestedOn_ requestedOn) {
        this.requestedOn = requestedOn;
    }

    public ShipToAddressOverride getShipToAddressOverride() {
        return shipToAddressOverride;
    }

    public void setShipToAddressOverride(ShipToAddressOverride shipToAddressOverride) {
        this.shipToAddressOverride = shipToAddressOverride;
    }

    public ShipToContactOverride getShipToContactOverride() {
        return shipToContactOverride;
    }

    public void setShipToContactOverride(ShipToContactOverride shipToContactOverride) {
        this.shipToContactOverride = shipToContactOverride;
    }

    public ShipVia getShipVia() {
        return shipVia;
    }

    public void setShipVia(ShipVia shipVia) {
        this.shipVia = shipVia;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TaxTotal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(TaxTotal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public VATExemptTotal getVATExemptTotal() {
        return vATExemptTotal;
    }

    public void setVATExemptTotal(VATExemptTotal vATExemptTotal) {
        this.vATExemptTotal = vATExemptTotal;
    }

    public VATTaxableTotal getVATTaxableTotal() {
        return vATTaxableTotal;
    }

    public void setVATTaxableTotal(VATTaxableTotal vATTaxableTotal) {
        this.vATTaxableTotal = vATTaxableTotal;
    }

    public Custom___ getCustom() {
        return custom;
    }

    public void setCustom(Custom___ custom) {
        this.custom = custom;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
