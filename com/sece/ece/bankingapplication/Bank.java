package com.sece.ece.bankingapplication;

public class Bank {

    private String bankname;
    private String bankBranch;
    private String bankCity;

    public Bank(String bankname, String bankBranch, String bankCity) {
        this.bankname = bankname;
        this.bankBranch = bankBranch;
        this.bankCity = bankCity;
    }
    public String getBankname() {
        return bankname;
    }
    public String getBankBranch(){
        return bankBranch;
    }
    public String getBankCity(){
        return bankCity;
    }

    
}
