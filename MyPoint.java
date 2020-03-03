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
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(int x, int y){
      this.x=x;
      this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    @Override
    public String toString() {
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }
   public double distance(int x,int y){
       int x1 = this.x-x;
       int y1 = this.y-y;
       return Math.sqrt(x1*x1+y1*y1);
   }
}
