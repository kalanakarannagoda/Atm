/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sub;

import Main.Withdraw;

/**
 *
 * @author kalana
 */
public class With extends Handler{

    @Override
    public double calculate(Sum amt) {
        Withdraw with = new Withdraw();
        if (amt.getAmount() > amt.getAmount2()) { //checking whether the account has sufficient balance to withdraw

            with.ErrorMsg();
            return 0;

        }else{
            double amount = 0;
            if (amt.getCalculation() == "Withdrawal") {

                amount = amt.getAmount2() - amt.getAmount();
                amt.setAmount2(amount);

                with.VerifiedMsg();
                return amt.getAmount2();//returning the account balance

            } else {
                successor.calculate(amt);
                return amt.getAmount2();//returning the account balance
            }
        }
    }
    
}
