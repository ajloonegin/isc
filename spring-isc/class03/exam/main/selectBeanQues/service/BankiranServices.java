package ir.freeland.spring.selectbean.service;

import java.io.File;

@Component
public interface BankiranServices {
    File accountTransaction(String accountNumber);
}