package com.design.patterns.adapter;

public class PhonePe {
    private BankAPI b;
    public PhonePe(BankAPI b){
        this.b = b;
    }
    public int transaction(String fromUsername, String password, String toUsrname){
        if(b.pay(fromUsername, password, toUsrname)) return 1;
        else return 0;
    }
    public double balance(String username, String password){
        return b.fetchBalance(username,password);
    }
}
