package ir.freeland.spring.selectbean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import ir.freeland.spring.selectbean.service.BankiranServices;

public class SelectbeanApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_stategy.xml");
        BankiranConversionService  bankiranConversionService = context.getBean(BankiranConversionService.class);
        bankiranConversionService.convertReportBankiran("EDB","136-800-384123");

    }

}