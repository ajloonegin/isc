package ir.freeland.spring.usebean;

public class UsebeanApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        InternetbankServicesFiledInjection internetbankServicesFiledInjection = context.getBean(InternetbankServicesFiledInjection.class);
        InternetbankServicesFiledInjection.doCardToCard("6274.1211.6623.6810","6037.9919.1267.1343");



    }
}
