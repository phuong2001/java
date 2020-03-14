/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuc_hanh;

import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class testSalary {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        EmployeeFullTime full = new EmployeeFullTime();
        EmployeePartime part = new EmployeePartime();
        System.out.println("input fulltime");
        full.setBaseSalary(in.nextFloat());
        System.out.println("input partime");
        System.out.println("");
        part.setBaseSalary(in.nextFloat());
        System.out.println("salary fulltime" + full.getSalary());
        System.out.println("salary partime" + part.getSalary());
    }

}
