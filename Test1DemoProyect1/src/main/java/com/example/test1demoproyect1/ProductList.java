package com.example.test1demoproyect1;

import java.util.List;

public class ProductList {
    private final List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
