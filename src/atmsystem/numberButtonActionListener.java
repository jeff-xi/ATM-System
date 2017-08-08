/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author jeff
 */
public class numberButtonActionListener implements ActionListener {
    
    public int number; //the number on the button
    public AtmSystemUI ui;
    
    public numberButtonActionListener(int number, AtmSystemUI ui) {
        this.number = number;
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ui.EnterNum += number;//adds number to string
        ui.updateGUI();
    }
    
}
