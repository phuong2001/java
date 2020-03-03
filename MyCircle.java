/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
}
