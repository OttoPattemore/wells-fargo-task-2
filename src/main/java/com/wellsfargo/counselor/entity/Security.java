package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @OneToOne(optional=false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private int quantity;


    protected Security() {

    }

    public Security(String name, String category, String purchaseDate, String purchasePrice, int quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getPortfolioId() {
        return securityId;
    }
    public String getName() {
        return name;
    }
    public String getCategory() { return category; }
    public String getPurchaseDate() { return purchaseDate; }
    public String getPurchasePrice() { return purchasePrice; }
    public int getQuantity() { return quantity; }
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
