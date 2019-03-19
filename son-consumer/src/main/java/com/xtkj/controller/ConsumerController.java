package com.xtkj.controller;

import com.xtkj.pojo.Product;
import com.xtkj.service.IProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ConsumerController {

    @Resource
    private IProductApi productApi;

    @ResponseBody
    @RequestMapping(value = "getProduct")
    public Product getProductMsg(){
        System.out.println("000000000000000000000");
        Product product = productApi.getProduct();
        return product;
    }

}
