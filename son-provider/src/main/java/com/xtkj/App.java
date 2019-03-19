package com.xtkj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        System.out.println("启动成功");
        System.in.read();
    }
}
