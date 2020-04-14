package com.mizhi.demo.api.product.bo.product;

import java.io.Serializable;

public class DemoProdcut implements Serializable {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
