package me.junhwa.springbootsecurity2;

import me.junhwa.springbootsecurity2.account.Account;
import me.junhwa.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {
    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account junhwa = accountService.createAccount("junhwa","1234");
        System.out.println(junhwa.getUsername()+" password: "+junhwa.getPassword());
    }
}
