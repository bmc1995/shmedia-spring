package dev.mccrackin.shmedia.service;

import dev.mccrackin.shmedia.model.Account;

import java.time.LocalDateTime;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccount(int id);

    Account updateAccount(int id);

    Account createAccount(String firstName, String lastName, String email, LocalDateTime DOB, String username);

    String deleteAccount(int id);
}
