/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

/**
 *
 * @author jeff
 */

public class SavingAccounts extends ATM {
    
    public SavingAccounts()//Creating Saving Accounts Numerical
    {
         
        depoist = 8000;
        dailyWithdrawalLimit = 3000;
        SavingAccounts = depoist - EnterNum;
        interest = 1.06;
        year = 365;
        dailyInterest = ((interest/100)/year)*SavingAccounts;
        DepositeAmount = depoist + EnterNum;
        
    }
}
