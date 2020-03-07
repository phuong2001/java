/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_7;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle extends Shape{
    
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
       super(color,filled,side);
    }
}
