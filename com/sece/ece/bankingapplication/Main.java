package com.sece.ece.bankingapplication;

public class Main {
    public static void main(String args[]){
        Bank sbi = new Bank("SBI","Kinathikidavu","Coimbatore");
        System.out.println("Bank Name is : "+sbi.getBankname());
        System.out.println("Bank Branch is : "+sbi.getBankBranch());
        System.out.println("Bank City is : "+sbi.getBankCity());

        System.out.println("\n========================================================\n");
        Bank hdfc = new Bank("HDFC","Kinathikidavu","Coimbatore");
        System.out.println("Bank Name is : "+hdfc.getBankname());
        System.out.println("Bank Branch is : "+hdfc.getBankBranch());
        System.out.println("Bank City is : "+hdfc.getBankCity());
    }
}
