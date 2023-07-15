/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sub;

import Main.Deposit;

/**
 *
 * @author kalana
 */
public class Dep extends Handler{

    @Override
    public double calculate(Sum amt) {
        double amount = 0;
        Deposit dep = new Deposit();
        if (amt.getCalculation()=="Deposit") {
            
            amount = amt.getAmount()+amt.getAmount2();
            amt.setAmount2(amount);
            dep.VerifiedMsg();//popup msg
            
            return amt.getAmount2();//returning the account balance
            
        }else{
            successor.calculate(amt);
            return amt.getAmount2();//returning the account balance
        }
    }
    
}
