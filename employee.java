/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getTD(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public String getName(){
        return this.firstName+lastName;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    
    public int raiseSalary(int percent,int newsalary){
        return this.salary * percent = newsalary;
    }
    
    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
    
}
