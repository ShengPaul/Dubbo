package com.xtkj.pojo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer proId;
    private String proName;

    public Product() {
    }

    public Product(Integer proId, String proName) {
        this.proId = proId;
        this.proName = proName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                '}';
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
}
