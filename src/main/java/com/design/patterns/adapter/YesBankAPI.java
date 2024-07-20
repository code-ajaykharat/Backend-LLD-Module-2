package com.design.patterns.adapter;

public class YesBankAPI {
    public double getBalance(String username, String password){
        return 10.0;
    }

    public boolean doPayment(String fromUsername, String password, String toUsrname){
        return true;
    }
}
