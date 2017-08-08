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
public class NetSaverAccounts extends ATM  {
    public NetSaverAccounts()//Creating Net Saver Accounts Numerical
    {
        depoist = 6000;
        interest = 2.06;
        month = 12;
        monthlyInterest = ((interest/100)/month)*depoist;
    }
}
