package com.ids.api.model;

public class ProductTransaction {
    private long id;
    private String productId;
    private String productName;
    private int amount;
    private String customerName;
    private int status;
    private String transactionDate;
    private String createBy;
    private String createOn;

    public ProductTransaction(long id, String productId, String productName, int amount,
                              String customerName, int status, String transactionDate,
                              String createBy, String createOn) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.amount = amount;
        this.customerName = customerName;
        this.status = status;
        this.transactionDate = transactionDate;
        this.createBy = createBy;
        this.createOn = createOn;
    }

    public long getId() { return id; }
    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getAmount() { return amount; }
    public String getCustomerName() { return customerName; }
    public int getStatus() { return status; }
    public String getTransactionDate() { return transactionDate; }
    public String getCreateBy() { return createBy; }
    public String getCreateOn() { return createOn; }
}
