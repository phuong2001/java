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
public class Student {
    private String name;
    private double gpa;
    
    public Student(){
        name = "nam";
        gpa = 3.5;
    }
    public Student(String name, double gpa){
        this.name= name;
        this.gpa=gpa;
    }
    public String getName(){
        return name;
    }
    public  void setGpa(double gpa){
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
    
}
