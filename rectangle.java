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
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        width=1;
        length=1;
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return this.width*length;
    }
    public double getPerimater(){
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    
}
