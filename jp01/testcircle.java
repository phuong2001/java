/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp01;

/**
 *
 * @author Admin
 */
public class testcircle {
    public static void main(String[] args){
        circle c1 = new circle();
        String color1 = c1.getColor();
        System.out.println(c1.toString());
        
        circle c2 = new circle("red");
        System.out.println(c2.toString()); 
        
         circle c3 = new circle(1.2);
        System.out.println(c3.toString()); 
        
         circle c4 = new circle(19.4, "green");
        System.out.println(c4.toString()); 
    }
    
}
