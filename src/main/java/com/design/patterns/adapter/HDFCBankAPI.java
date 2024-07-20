package com.design.patterns.adapter;

public class HDFCBankAPI {
    public double checkBalance(String username, String password){
        return 10222.0;
    }

    public boolean doTransaction(String fromUsername, String password, String toUsrname){
        return true;
    }
}
