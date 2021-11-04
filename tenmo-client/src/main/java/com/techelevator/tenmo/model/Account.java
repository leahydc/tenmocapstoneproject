package com.techelevator.tenmo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Account {

    @JsonProperty("account_id")
    private int accountId;
    @JsonProperty("user_id")
    private int userId;
    @JsonProperty("balance")
    private BigDecimal balance;

    public int getAccountId() { return this.accountId; }

    public int getUserId() { return this.userId; }

    public BigDecimal getBalance() { return this.balance; }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Account() {}

    public Account(int accountId, int userId, BigDecimal balance) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;
    }
}
