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
public class Student2 extends Person{
    private String program;
    private int year;
    private double fee;
    
    public Student2(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram(){
        return this.program; 
    }
    public int year(){
        return this.year;
    }
    public double fee(){
        return this.fee;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void setfee(double fee){
        this.fee=fee;
    }

    @Override
    public String toString() {
        return  "(" + super.getName() + "," + super.getAddress() + "," + this.program + "," + this.year + "," + this.fee + ")";
    }
    
}
