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
public class invoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public invoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getID(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public double getTotal(){
        return this.unitPrice*qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "invoiceItem{" + "id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }
    
}
