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
public class Cricle extends Shape{
    private double radius;
    
   public Cricle(){
     radius=1;  
   }
    public Cricle(double radius){
        this.radius=radius;
    }
    public Cricle (String color,boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimater(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" + "radius=" + radius + '}';
    }
    
}
