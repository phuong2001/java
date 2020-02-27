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
public class circles {
   private double radius;

public circles(){
   radius = 1.0;
}

public circles(double radius){
    this.radius = radius;
}

public double getRadius(){
    return this.radius;
}

public double getArea(){
    return radius * radius *Math.PI;
}
public double getCircumferece(){
    return radius * Math.PI * 2;
}
public void setRadius(double radius){
    this.radius = radius;
}

    @Override
    public String toString() {
        return "circles{" + "radius=" + radius + '}';
    }

}