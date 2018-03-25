
package com.andy.ezcook.network_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Allocation {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("rowNumber")
    @Expose
    private Integer rowNumber;
    @SerializedName("note")
    @Expose
    private Object note;
    @SerializedName("Allocated")
    @Expose
    private Allocated allocated;
    @SerializedName("AllocWarehouseID")
    @Expose
    private AllocWarehouseID allocWarehouseID;
    @SerializedName("Completed")
    @Expose
    private Completed completed;
    @SerializedName("ExpirationDate")
    @Expose
    private ExpirationDate expirationDate;
    @SerializedName("InventoryID")
    @Expose
    private InventoryID inventoryID;
    @SerializedName("LineNbr")
    @Expose
    private LineNbr lineNbr;
    @SerializedName("LocationID")
    @Expose
    private LocationID locationID;
    @SerializedName("LotSerialNbr")
    @Expose
    private LotSerialNbr lotSerialNbr;
    @SerializedName("OrderNbr")
    @Expose
    private OrderNbr orderNbr;
    @SerializedName("OrderType")
    @Expose
    private OrderType orderType;
    @SerializedName("Qty")
    @Expose
    private Qty qty;
    @SerializedName("QtyOnShipments")
    @Expose
    private QtyOnShipments qtyOnShipments;
    @SerializedName("QtyReceived")
    @Expose
    private QtyReceived qtyReceived;
    @SerializedName("RelatedDocument")
    @Expose
    private RelatedDocument relatedDocument;
    @SerializedName("ShipOn")
    @Expose
    private ShipOn shipOn;
    @SerializedName("SplitLineNbr")
    @Expose
    private SplitLineNbr splitLineNbr;
    @SerializedName("UOM")
    @Expose
    private UOM uOM;
    @SerializedName("custom")
    @Expose
    private Custom custom;
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

    public Allocated getAllocated() {
        return allocated;
    }

    public void setAllocated(Allocated allocated) {
        this.allocated = allocated;
    }

    public AllocWarehouseID getAllocWarehouseID() {
        return allocWarehouseID;
    }

    public void setAllocWarehouseID(AllocWarehouseID allocWarehouseID) {
        this.allocWarehouseID = allocWarehouseID;
    }

    public Completed getCompleted() {
        return completed;
    }

    public void setCompleted(Completed completed) {
        this.completed = completed;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public InventoryID getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(InventoryID inventoryID) {
        this.inventoryID = inventoryID;
    }

    public LineNbr getLineNbr() {
        return lineNbr;
    }

    public void setLineNbr(LineNbr lineNbr) {
        this.lineNbr = lineNbr;
    }

    public LocationID getLocationID() {
        return locationID;
    }

    public void setLocationID(LocationID locationID) {
        this.locationID = locationID;
    }

    public LotSerialNbr getLotSerialNbr() {
        return lotSerialNbr;
    }

    public void setLotSerialNbr(LotSerialNbr lotSerialNbr) {
        this.lotSerialNbr = lotSerialNbr;
    }

    public OrderNbr getOrderNbr() {
        return orderNbr;
    }

    public void setOrderNbr(OrderNbr orderNbr) {
        this.orderNbr = orderNbr;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Qty getQty() {
        return qty;
    }

    public void setQty(Qty qty) {
        this.qty = qty;
    }

    public QtyOnShipments getQtyOnShipments() {
        return qtyOnShipments;
    }

    public void setQtyOnShipments(QtyOnShipments qtyOnShipments) {
        this.qtyOnShipments = qtyOnShipments;
    }

    public QtyReceived getQtyReceived() {
        return qtyReceived;
    }

    public void setQtyReceived(QtyReceived qtyReceived) {
        this.qtyReceived = qtyReceived;
    }

    public RelatedDocument getRelatedDocument() {
        return relatedDocument;
    }

    public void setRelatedDocument(RelatedDocument relatedDocument) {
        this.relatedDocument = relatedDocument;
    }

    public ShipOn getShipOn() {
        return shipOn;
    }

    public void setShipOn(ShipOn shipOn) {
        this.shipOn = shipOn;
    }

    public SplitLineNbr getSplitLineNbr() {
        return splitLineNbr;
    }

    public void setSplitLineNbr(SplitLineNbr splitLineNbr) {
        this.splitLineNbr = splitLineNbr;
    }

    public UOM getUOM() {
        return uOM;
    }

    public void setUOM(UOM uOM) {
        this.uOM = uOM;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
