package com.seu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;
    public void insertService(){
        accountDao.insert();
    }

}
