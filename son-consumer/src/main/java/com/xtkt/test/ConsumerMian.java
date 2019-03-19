package com.xtkt.test;

import com.xtkj.pojo.Product;
import com.xtkj.service.IProductApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMian {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        IProductApi productApi =(IProductApi) context.getBean("productService"); // 获取远程服务代理
        Product product = productApi.getProduct();// 执行远程方法
        System.out.println( product ); // 显示调用结果
        System.in.read();
    }

}
