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
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint(float x, float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        xSpeed=0;
        ySpeed=0;
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
   
   
}
