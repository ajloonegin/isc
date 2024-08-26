package ir.freeland.spring.selectbean.service;

import java.io.File;

@Component("BSI")
public class BSIBankiranServices implements BankiranServices {

    @Override
    public File accountTransaction(String accountNumber) {
        return new File("account-report");
    }
}