package dev.mccrackin.shmedia.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    public List<dev.mccrackin.shmedia.model.Account> getAllAccounts() {
        List<dev.mccrackin.shmedia.model.Account> accountList = new ArrayList<>();
        accountList.add(0, new dev.mccrackin.shmedia.model.Account("Billy", "MAC", "test@example.com", LocalDateTime.of(1995,10,22,14,33), "wmccra"));
        accountList.add(0, new dev.mccrackin.shmedia.model.Account("John", "Smith", "test1@example.com", LocalDateTime.of(1995,11,22,5,30), "jsmith"));
        accountList.add(0, new dev.mccrackin.shmedia.model.Account("Tony", "MAC", "test2@example.com", LocalDateTime.of(1995,9,2,5,30), "tmac"));
        accountList.add(0, new dev.mccrackin.shmedia.model.Account("Tori", "Phillips", "test3@example.com", LocalDateTime.of(1995,5,16,12,30), "tphillips"));
        accountList.add(0, new dev.mccrackin.shmedia.model.Account("Chauncey", "Billups", "test4@example.com", LocalDateTime.of(1995,3,3,15,30), "cbillups"));
        return accountList;
    }

    public dev.mccrackin.shmedia.model.Account getAccount(int id) {
        return new dev.mccrackin.shmedia.model.Account("Billy", "MAC", "test@example.com", LocalDateTime.of(1995,10,22,14,33), "wmccra");
    }


    public dev.mccrackin.shmedia.model.Account updateAccount(int id) {
        return null;
    }


    public dev.mccrackin.shmedia.model.Account createAccount(String firstName, String lastName, String email, LocalDateTime DOB, String username) {
        System.out.println("hi");
        return new dev.mccrackin.shmedia.model.Account(firstName, lastName, email, DOB, username);
    }

    @Override
    public String deleteAccount(int id) {
        return String.format("Account deleted (Account id: %s)", id);
    }

}
