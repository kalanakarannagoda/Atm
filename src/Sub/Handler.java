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
public abstract class Handler {
    protected Handler successor;
    
    public void setSuccessor(Handler successor){
        this.successor =successor;
    }
    
    public abstract double calculate(Sum amt);
}
