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
public class product {
    private int id;
    private String name;
    private double price;
    private int qty;
    private String description;
    
    public product(){
        this.price = 1000;
        this.qty = 5;
        this.description = "nước lọc";
    }
    public product (double price, int qty, String description){
         this.price = price;
         this.qty = qty;
         this.description = description;
    }
    public double getPrice(){
         return this.price;
}
    public int getQty(){
        return this.qty;
    }
     public void setPrice(double newprice){
        this.price = newprice;
     }
    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", description=" + description + '}';
    }
    
}

