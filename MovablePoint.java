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
public  class MovablePoint implements Movable{
    private  int x,y,xSpeed,ySpeed;
    
    
    public MovablePoint(int x,int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    void setMoveUp(){
        y-= ySpeed;
    }
    void setMoveDown(){
        y+= ySpeed;
    }
    void setMoveLeft(){
        x-= xSpeed;
    }
    void setMoveRight(){
        x+= xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    
}

 
