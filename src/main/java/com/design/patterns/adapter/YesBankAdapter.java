package com.design.patterns.adapter;

public class YesBankAdapter implements BankAPI{//inherit
    private YesBankAPI y; // association
    public YesBankAdapter(YesBankAPI y){
        this.y = y;
    }
    @Override
    public boolean pay(String fromUsername, String password, String toUsrname) {
        return y.doPayment(fromUsername,password,toUsrname);
    }

    @Override
    public double fetchBalance(String username, String password) {
        return y.getBalance(username,password);
    }
}
