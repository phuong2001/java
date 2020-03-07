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
public class Point2D {
    private float x;
    private float y;
    
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
        x=0;
        y=0;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + this.x + " , " + this.y +" )";
    }
    
}
