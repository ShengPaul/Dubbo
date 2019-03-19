package com.xtkj.service.impl;

import com.xtkj.pojo.Product;
import com.xtkj.service.IProductApi;
import org.springframework.stereotype.Service;


public class ProductServiceImpl implements IProductApi {
    @Override
    public Product getProduct() {
        Product product = new Product(1,"圣保罗");
        System.out.println("9999999");
        return product;
    }
}
