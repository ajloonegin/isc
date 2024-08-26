package ir.freeland.spring.selectbean.service;

import java.io.File;

@Component("EDB")
public class EDBBankiranServices implements BankiranServices {

    @Override
    public File accountTransaction(String accountNumber) {
        return new File("account-report");
    }
}