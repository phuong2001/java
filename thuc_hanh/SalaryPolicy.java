/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuc_hanh;

/**
 *
 * @author Admin
 */
abstract public class SalaryPolicy {
    private float baseSalary;
    
    public SalaryPolicy(float baseSalary){
        this.baseSalary = baseSalary;
    }
    public float getBaseSalary(){
        return baseSalary;
    }
    
   abstract public float getSalary();

    @Override
    public String toString() {
        return "SalaryPolicy[baseSalary = " + baseSalary + "]";
    }
        
   
}
