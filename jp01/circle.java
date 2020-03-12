/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp01;

/**
 *
 * @author Admin
 */
public class circle {
    private double radius;
    private String color;
//constructor khởi tạo  ddooois tượng
    public circle(){
        radius = 5;
        color = "blue";
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(String color){
        this.color = color;
    }
    public circle(double radius , String color){
         this.radius = radius;
          this.color = color;
    }
/**
 * lấy ra bán kính
 * @return 
 */
public double getRadius(){
    return radius;
}
/**
 * lấy ra màu sắc
 * @return 
 */
public String getColor(){
    return color;
}
/**
 * lấy ra diện tích
 * @return 
 */
public double getArea(){
    return radius * radius * Math.PI;
    
}

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    
    }