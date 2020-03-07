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
public class Point3D extends Point2D{
    private float z;
    
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
        super();
        this.z=0;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
