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
public class Square extends Shape implements Rectangle{
    private double side;
            
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.side = side;
    }
    public Square(double side,String color , Boolean filled){
        super(color,filled);
        this.side= side;
    }
    public double  getSquare(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setWidth(double side){
        this.side = width;
    }
    public void setLength(double side){
        this.side = length;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
   
