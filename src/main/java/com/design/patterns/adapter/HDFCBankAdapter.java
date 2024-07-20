package com.design.patterns.adapter;

public class HDFCBankAdapter implements BankAPI{
    public HDFCBankAPI h;
    public HDFCBankAdapter(HDFCBankAPI h){
        this.h = h;
    }
    @Override
    public boolean pay(String fromUsername, String password, String toUsrname) {
        return h.doTransaction(fromUsername,password,toUsrname);
    }

    @Override
    public double fetchBalance(String username, String password) {
        return h.checkBalance(username,password);
    }
}
