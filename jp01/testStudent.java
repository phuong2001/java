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
public class testStudent {
    public static void main(String[] args) {
        Student c1 = new Student("bao",6);
        System.out.println(c1.toString());
        
         Student c2 = new Student();
        System.out.println(c2.toString());
    }
    
}
