/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        super();
        radius = 1;
    }
    public Circle(double radius){
        super();
        this.radius= radius;
    }
    public Circle(double ridius, String color, Boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius = " +  radius + "]";
    }
    
}
