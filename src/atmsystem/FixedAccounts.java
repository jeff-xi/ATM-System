/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.util.Calendar;

/**
 *
 * @author jeff
 */
public class FixedAccounts extends ATM{

    String c1;
   
    public FixedAccounts()//Creating Fixed Accounts Numerical
    {
        depoist = 6000;
        month = 6;
        interestRate = 2.6;
        interest = (interestRate/100/2)*depoist;
       
        Calendar c1 = Calendar.getInstance();
        c1.set(2009, 12 - 1, 12);
        
        if(depoist < 6000){
            System.out.println("If you withdraws fixed accounts depoist or before the due date "+c1
                    + ", will not get any interest");
        }
    }
    
}