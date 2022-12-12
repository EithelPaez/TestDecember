package com.example.test1demoproyect1;

import java.util.Date;

public class Product {
    private final String productId;
    private final String productName;
    private final String UOM;
    private final Date launchDate;

    public Product(String productId, String productName, String uom, Date launchDate) {
        this.productId = productId;
        this.productName = productName;
        this.UOM = uom;
        this.launchDate = launchDate;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getUOM() {
        return UOM;
    }

    public Date getLaunchDate() {
        return launchDate;
    }
}
