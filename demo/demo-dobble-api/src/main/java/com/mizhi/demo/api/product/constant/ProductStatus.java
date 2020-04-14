package com.mizhi.demo.api.product.constant;

public enum ProductStatus {
    NOMAL(1, "正常"),
    SOLD_OUT(2, "售完");

    private Integer id;

    private String value;

    ProductStatus(Integer id, String value) {
        this.id = id;
        this.value = value;
    }
}
