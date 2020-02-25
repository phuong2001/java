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
public class rectangle {
    private int width;
    private int height;
    
    public rectangle(){
        width = 10;
        height = 5;
    }
    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void display(){
        for(int i=0;i<=width;i++){
            for(int j=0;j<=height;j++){
                System.out.println("#");
            }
        }
    }
    // tinh dien tich
    public int getArea(){
        return this.width * height;
    }
    public void setHeight(int value){
        this.height=value;
    }
    //chu vi
    public int getPerimeter(){
        return this.width*2 + height*2;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int value){
        this.width = value;
    }

    @Override
    public String toString() {
        return "rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
}
