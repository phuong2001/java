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
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius=1.0;
        color="red";
          System.out.println("construced ()");
    }
    public Circle (double radius){
        this.radius=radius;
        this.color="red";
         System.out.println("construced a(radius)");
    }
    public Circle (double radius, String color){
        this.radius=radius;
        this.color=color;
         System.out.println("construced a(radius,color)");
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    public double getArea(){
        return this.radius*radius*Math.PI;
    }
}
