/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sub;

/**
 *
 * @author kalana
 */
public class Sum {
    
    private double amount;
    private static double amount2 = 35000; 
    private String calculation;

    public Sum(double amount, String calculation) {
    
        this.amount = amount;
        this.calculation = calculation;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @return the calculation
     */
    public String getCalculation() {
        return calculation;
    }

    /**
     * @return the amount2
     */
    public static double getAmount2() {
        return amount2;
    }

    /**
     * @param aAmount2 the amount2 to set
     */
    public static void setAmount2(double aAmount2) {
        amount2 = aAmount2;
    }
    
    
    
    
}
