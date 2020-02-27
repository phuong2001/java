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
public class rectangles {
    private float length;
    private float width;
    
    public rectangles(){
        this.length = 1.0f;
        this.width = 1.0f;
    }
    
    public rectangles(float length, float width){
        this.length = length;
        this.width = width;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public double getCircumferece(){
        return length * 2 + width * 2;
    }
    public void setLength(float Length){
        this.length = Length;
    }
    
    public void setWidth(float Width){
        this.width = Width;
    }

    @Override
    public String toString() {
        return "rectangles{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
