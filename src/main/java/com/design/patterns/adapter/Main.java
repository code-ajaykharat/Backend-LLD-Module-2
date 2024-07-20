package com.design.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        //To use other bank API, I need to do muliple changes in my codebase - OCP violets
//        PhonePe p = new PhonePe(new YesBankAPI());
//        System.out.println(p.fetchBalance("Ajay","1234"));
//        System.out.println(p.pay("Ajay","1234","Abhay"));

        BankAPI b = new YesBankAdapter(new YesBankAPI());
//        BankAPI b = new HDFCBankAdapter(new HDFCBankAPI()); //one line change only
        PhonePe p = new PhonePe(b);
        System.out.println(p.balance("Ajay","123"));
        System.out.println(p.transaction("Ajay", "123","Abhay"));
    }
}
