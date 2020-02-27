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
public class account {
    private String id;
    private String name;
    private int balance;
    
    public account(String id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public account(String id, String name, int balance){
        this.id=id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return balance + amount;
    }
    public int debit(int amount, account another){
        
    }

    @Override
    public String toString() {
        return "account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
