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
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape (String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}
