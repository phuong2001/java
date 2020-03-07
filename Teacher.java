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
public class Teacher extends Person{
    private int numCourses;
    private String[] courses;
    
    public Teacher(String name, String address){
        super(name,address);
        
    }
}
