/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author jeff
 */
public class AtmSystemUI{
        SavingAccounts savAcc = new SavingAccounts();//Instantiate a SavingAccounts object 
        ChequeAccounts cheAcc = new ChequeAccounts();//Instantiate a ChequeAccounts object 
        NetSaverAccounts netSavAcc = new NetSaverAccounts();//Instantiate a Net Saver Accounts object 
        FixedAccounts fixACC = new FixedAccounts();//Instantiate a Fixed Accounts object 
        Date date = new Date();// Instantiate a Date object   
        
        
        JFrame frame;//create frame 
        JTextArea TopBox;//create topbox
        JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7,//create number, dot and clr
                btn8,btn9, btn0,btnDot,btnCLR;
        
        JButton btnCancel,btnEnter;//create cancel and enter
        
        JButton btnWithdraw, btnDeposite,btnBalanceInquiry,btnHelp;//create withdraw ,deposite, balance inquiry , help

        JPanel  leftPanel,rightPanel,bottomPanel;//create Panel
    
        
        String leftNum ="",rightNum = "";//Create and manipulate strings.
        String operator = "";//Create and manipulate strings.
      
        String EnterNum = "";//Create and manipulate strings.
        
        String TopMessage = "Hello, Welcome to AIT bank.Plaze select you option.\n"+date.toString() // ATM top message 
            +"\n================================================\n"
            +"Your account number is:                           1234-5678\n "
            +"Account Type:                                              Saving\n\n";
           
        void setupUI() {
        frame = new JFrame("AIT ATM System");//frame name
        frame.setSize(360, 600);//frame size 360 width , 600 height
                
        TopBox = new JTextArea(10,200);//top box size 10 width,200 height
        TopBox.append(TopMessage);
        TopBox.setLineWrap(true);
        frame.add(TopBox, BorderLayout.NORTH);//Define the location
        
        setupButtons();
        setupPanels();
        
        frame.setVisible(true);
        }

        private void setupPanels() {
            leftPanel = new JPanel(new GridLayout(4,3));//Left panel ,4 rows, 3 columns
            rightPanel = new JPanel(new GridLayout(4,1));//rightPanel,4 rows, 1 colums
            bottomPanel = new JPanel(new GridLayout(1,2));//bottomPanel, 1 rows, 2 colums
            
            //create left Panel btn1-btn9 ,dot and clr
            leftPanel.add(btn1);
            leftPanel.add(btn2);
            leftPanel.add(btn3);
            leftPanel.add(btn4);
            leftPanel.add(btn5);
            leftPanel.add(btn6);
            leftPanel.add(btn7);
            leftPanel.add(btn8);
            leftPanel.add(btn9);
            leftPanel.add(btn0);
            leftPanel.add(btnDot);
            leftPanel.add(btnCLR);
            
            //create right panelwithdraw ,deposite,banlance inquiry and help
            rightPanel.add(btnWithdraw);
            rightPanel.add(btnDeposite);
            rightPanel.add(btnBalanceInquiry);
            rightPanel.add(btnHelp);
            
            //create bottom panel cancel and enter
            bottomPanel.add(btnCancel);
            bottomPanel.add(btnEnter);
            
            //Set button location
            frame.add(leftPanel,BorderLayout.WEST);
            frame.add(rightPanel,BorderLayout.CENTER);
            frame.add(bottomPanel,BorderLayout.PAGE_END);   
        }

        private void setupButtons() {
            //Settings left panel button position
            btn7 = new JButton("7");
            btn8 = new JButton("8");
            btn9 = new JButton("9");
            btn4 = new JButton("4");
            btn5 = new JButton("5");
            btn6 = new JButton("6");
            btn1 = new JButton("1");
            btn2 = new JButton("2");
            btn3 = new JButton("3");
            btn0 = new JButton("0");
            btnDot = new JButton(".");
            btnCLR = new JButton("CLR");
                      
            //Settings right Panel button position
            btnWithdraw = new JButton("Withdraw");
            btnDeposite = new JButton("Deposite");
            btnBalanceInquiry = new JButton("Balance Inquiry");
            btnHelp = new JButton("Help");
            
            //Settings bottom Panel button position
            btnCancel = new JButton("Cancel");
            btnEnter = new JButton("Enter");
            
            
            
            btn1.addActionListener(new numberButtonActionListener(1,this));//button for number1
            btn2.addActionListener(new numberButtonActionListener(2,this));//button for number2
            btn3.addActionListener(new numberButtonActionListener(3,this));//button for number3
            btn4.addActionListener(new numberButtonActionListener(4,this));//button for number4
            btn5.addActionListener(new numberButtonActionListener(5,this));//button for number5
            btn6.addActionListener(new numberButtonActionListener(6,this));//button for number6
            btn7.addActionListener(new numberButtonActionListener(7,this));//button for number7
            btn8.addActionListener(new numberButtonActionListener(8,this));//button for number8
            btn9.addActionListener(new numberButtonActionListener(9,this));//button for number9
            btn0.addActionListener(new numberButtonActionListener(0,this));//button for number0
            
            
            
            btnDot.addActionListener(new ActionListener() { // button dot
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        TopBox.setText(TopMessage);
                        TopMessage +=  EnterNum;
                        EnterNum = "";
                        operator = ".";
                        updateGUI();
                }
            });
             
            btnCLR.addActionListener(new ActionListener() { //button clear
                @Override
                public void actionPerformed(ActionEvent e) {
                    TopBox.setText(TopMessage);
                    operator = ("");
                    EnterNum = ("");
                    String output = TopMessage;
                    //if statement gone, deleted
                    TopBox.setText(output);
                }
                
            });
            
            btnWithdraw.addActionListener(new ActionListener() {    //button Withdrawdeposite
                @Override
                public void actionPerformed(ActionEvent e) {
                    TopBox.setText(TopMessage);
                    operator = ("\n Please Enter Your Withdraw Amount : ");//top box print out Please Enter Your Withdraw  Amount : 
                    EnterNum = ("");
                    updateGUI();
                }
            });
            
            btnDeposite.addActionListener(new ActionListener() {    //button deposite
                @Override
                public void actionPerformed(ActionEvent e) {
                    TopBox.setText(TopMessage);
                    operator = ("\n Please Enter Your Deposite Amount : ");//top box print out Please Enter Your Deposite Amount : 
                    EnterNum = ("");
                    updateGUI();
                }
            });
            
            btnBalanceInquiry.addActionListener(new ActionListener() {  //button Balance Inquiry
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(operator.equals("\n Please Enter Your Withdraw Amount : ")){// in withdraw amount if the result is Please Enter Your Withdraw Amount system will output account information: 
                        
                        //Saving Accounts
                        TopBox.append("\nYou have depoist $"+savAcc.depoist);//Top box display depoist
                        TopBox.append("\nYour daily withdrawal limit is $"+savAcc.dailyWithdrawalLimit);//Top box display daily withdrawal limit 
                        TopBox.append("\nTodays interest rate is "+savAcc.interest);//Top box display Todays interest rate
                        TopBox.append("\nYour saving accounts daily interest is $"+savAcc.dailyInterest);//Top box saving accounts daily interest
                        
                        System.out.println("\nSaving Accounts:\nYou have depoist $"+savAcc.depoist);//display Saving Accounts and depoist
                        System.out.println("\nYou take out $"+EnterNum);// display take out
                        System.out.println("\nYour daily withdrawal limit is $"+savAcc.dailyWithdrawalLimit);// display daily withdrawal limit 
                        System.out.println("\nTodays interest rate is "+savAcc.interest);// Todays interest rate
                        System.out.println("\nYour saving accounts daily interest is $"+savAcc.dailyInterest);//saving accounts daily interest
                        
                        //Cheque Accounts
                        TopBox.append("\nCheque Accounts:\nYou have depoist $"+cheAcc.depoist);//Top box display cheque accounts and depoist
                        TopBox.append("\nYour don't have any interest in ChequeAccounts");//Top box display don't have any interest
                        TopBox.append("\nYour period is before 31-May-2016");//Top box display display period
                        
                        System.out.println("\nCheque Accounts:\nYou have depoist $"+cheAcc.depoist);//display Cheque Accounts and depoist
                        System.out.println("\nYour don't have any interest in ChequeAccounts");//display don't have any interest
                        System.out.println("\nYour period is before 31-May-2016");//display period
                        
                        //Net Saver Accounts
                        TopBox.append("\nNet Saver Accounts:\nYou have depoist $"+netSavAcc.depoist);//Top box display Net Saver Accounts and depoist
                        TopBox.append("\nThis month interest rate is "+netSavAcc.interest);//Top box display month interest rate
                        TopBox.append("\nYou have higher interest which is $"+netSavAcc.monthlyInterest+" in this month");//Top box display higher interest 
                        
                        System.out.println("\nNet Saver Accounts:\nYou have depoist $"+netSavAcc.depoist);//display Net Saver Accounts and depoist
                        System.out.println("\nThis month interest rate is "+netSavAcc.interest); //display month interest rate
                        System.out.println("\nYou have higher interest which is $"+netSavAcc.monthlyInterest+" in this month");//display higher interest 
        
                        //Fixed Accounts
                        TopBox.append("\nFixed Accounts:\nYou have depoist $"+fixACC.depoist);//Top box display Fixed Accounts and depoist
                        TopBox.append("\nYour interest is $"+fixACC.interest);//Top box display interest
                        
                        System.out.println("\nFixed Accounts:\nYou have depoist $"+fixACC.depoist);//display Fixed Accounts and depoist
                        System.out.println("\nYour interest is $"+fixACC.interest);//display interest
        
                    }
                    
                    if(operator.equals("\n Please Enter Your Deposite Amount : ")){//in deposite amount if the result is Please Enter Your Deposite Amount system will output account information: 
                        //Saving Accounts
                        TopBox.append("\nYou have depoist $"+savAcc.depoist);//Top box display depoist
                        TopBox.append("\nYour daily withdrawal limit is $"+savAcc.dailyWithdrawalLimit);//Top box display daily withdrawal limit 
                        TopBox.append("\nTodays interest rate is "+savAcc.interest);//Top box display Todays interest rate
                        TopBox.append("\nYour saving accounts daily interest is $"+savAcc.dailyInterest);//Top box saving accounts daily interest
                        
                        System.out.println("\nSaving Accounts:\nYou have depoist $"+savAcc.depoist);//display Saving Accounts and depoist
                        System.out.println("\nYou take out $"+EnterNum);// display take out
                        System.out.println("\nYour daily withdrawal limit is $"+savAcc.dailyWithdrawalLimit);// display daily withdrawal limit 
                        System.out.println("\nTodays interest rate is "+savAcc.interest);// Todays interest rate
                        System.out.println("\nYour saving accounts daily interest is $"+savAcc.dailyInterest);//saving accounts daily interest
                        
                        //Cheque Accounts
                        TopBox.append("\nCheque Accounts:\nYou have depoist $"+cheAcc.depoist);//Top box display cheque accounts and depoist
                        TopBox.append("\nYour don't have any interest in ChequeAccounts");//Top box display don't have any interest
                        TopBox.append("\nYour period is before 31-May-2016");//Top box display display period
                        
                        System.out.println("\nCheque Accounts:\nYou have depoist $"+cheAcc.depoist);//display Cheque Accounts and depoist
                        System.out.println("\nYour don't have any interest in ChequeAccounts");//display don't have any interest
                        System.out.println("\nYour period is before 31-May-2016");//display period
                        
                        //Net Saver Accounts
                        TopBox.append("\nNet Saver Accounts:\nYou have depoist $"+netSavAcc.depoist);//Top box display Net Saver Accounts and depoist
                        TopBox.append("\nThis month interest rate is "+netSavAcc.interest);//Top box display month interest rate
                        TopBox.append("\nYou have higher interest which is $"+netSavAcc.monthlyInterest+" in this month");//Top box display higher interest 
                        
                        System.out.println("\nNet Saver Accounts:\nYou have depoist $"+netSavAcc.depoist);//display Net Saver Accounts and depoist
                        System.out.println("\nThis month interest rate is "+netSavAcc.interest); //display month interest rate
                        System.out.println("\nYou have higher interest which is $"+netSavAcc.monthlyInterest+" in this month");//display higher interest 
        
                        //Fixed Accounts
                        TopBox.append("\nFixed Accounts:\nYou have depoist $"+fixACC.depoist);//Top box display Fixed Accounts and depoist
                        TopBox.append("\nYour interest is $"+fixACC.interest);//Top box display interest
                        
                        System.out.println("\nFixed Accounts:\nYou have depoist $"+fixACC.depoist);//display Fixed Accounts and depoist
                        System.out.println("\nYour interest is $"+fixACC.interest);//display interest
                    } 
                }
            });
            
            btnHelp.addActionListener(new ActionListener() {            //button help
                @Override
                public void actionPerformed(ActionEvent e) {
                    TopBox.setText(TopMessage);
                    operator = ("\n 1.Select Your Option.\n" +         //printl out method of operation
                                "\n 2.Enter Amount.\n" +
                                "\n 3.Information Show up.");
                    EnterNum = ("");
                    updateGUI();
                }
            });
            
            
            btnCancel.addActionListener(new ActionListener(){   // button Cancel
                @Override
                public void actionPerformed(ActionEvent e) {
                    TopBox.setText(TopMessage);
                    operator = ("");
                    EnterNum = ("");
                    String output = TopMessage;
                    //if statement gone, deleted
                    TopBox.setText(output);
                }
            });
            
            btnEnter.addActionListener(new ActionListener() { //button Enter
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(operator.equals("\n Please Enter Your Withdraw Amount : ")){ // if operator is Please Enter Your Withdraw Amount will print out take out 
                        TopBox.append("\nYou take out $"+EnterNum);
                        
                    }
                    
                    if(operator.equals("\n Please Enter Your Deposite Amount : ")){// if operator is Please Enter Your  Deposite Amount will print out depoist 
                        
                        TopBox.append("\nYou have depoist $"+savAcc.depoist+EnterNum);
                         
                    }
                }
            });
                      
        }

        
        
        void updateGUI() {
            String output = TopMessage+" "+ operator+""+EnterNum;   //Create and manipulate strings.
            
            //if statement gone, deleted
            TopBox.setText(output);
            
        } 
}
