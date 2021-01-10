package com.seu.tx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Txconfig.class);
        AccountService accountService=(AccountService) context.getBean("accountService");

        accountService.insertService();
        context.close();

    }
}
