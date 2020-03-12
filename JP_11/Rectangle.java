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
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle (){
        super();
        width = 1;
        length = 1;
    }
    public Rectangle( double width, double length){
        super();
        this.width = width;
        this.length= length;
    }
    public Rectangle (double width, double length, String color,Boolean filled){
        super(color,filled);
        this.width = width;
        this.length= length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
     public void setLength(double length){
        this.length = length;
    }
      public double getArea(){
        return length*width;
    }
      public double getPerimeter(){
          return length*2 + width*2;
      }
      public String toString(){
          return "Rectangle[width = " +width+ ",length = " +length+ "]";
      }
}
