package com.design.patterns.adapter;

public interface BankAPI {
    public boolean pay(String fromUsername, String password, String toUsrname);
    public double fetchBalance(String username, String password);
}
