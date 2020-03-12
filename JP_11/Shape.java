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
abstract public class Shape {
    private String color;
    private Boolean filled;
    
    public Shape(){
        color = "RED";
        filled = true;
    }
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color = " + color + ", filled = " + filled + "";
    }
    
}
