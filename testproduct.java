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
public class testproduct {
    public static void main(String[] args) {
            product c1 = new product();
            System.out.println(c1.toString());   
            
            product c2 = new product(10,5,"nước khoáng");
            System.out.println(c2.toString());
    }
      
}
