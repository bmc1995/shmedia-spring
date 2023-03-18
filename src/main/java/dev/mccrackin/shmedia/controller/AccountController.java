package dev.mccrackin.shmedia.controller;

import dev.mccrackin.shmedia.model.Account;
import dev.mccrackin.shmedia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    private List<Account> listAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    private Account getAccount(@PathVariable int id) {
        return accountService.getAccount(id);
    }

    @PatchMapping("/{id}")
    private Account updateAccount(@PathVariable int id) {
        return accountService.updateAccount(id);
    }

    @PostMapping
    private Account createAccount() {
        return accountService.createAccount("testFirst", "testLast","test6@example.com", LocalDateTime.of(1995,10,22,14,33),"tLastFirst");
    }

    @DeleteMapping("/{id}")
    private String softDeleteAccount(@PathVariable int id) {
        return accountService.deleteAccount(id);
    }
}
