/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2_02;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculator {
    
   public static void main(String[] args) {
   int n,sum=0,medium;
    Scanner scanner = new Scanner(System.in);
     System.out.println("sống lượng các số: ");
         n = scanner.nextInt();
    if(n>0){    
        
    }
         
    int array[] = new int[n];
         
    System.out.println("Nhập số ");
    for (int i = 0; i < n; i++) {
        System.out.print("số :");
        array[i] = scanner.nextInt();
    }
    
    for(int i=0; i<array.length;i++){
             System.out.println("Element" +i+", typed value was " +array[i]);
        }
     
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
     medium = sum / n;
      System.out.println("trung binh  = " +medium );
}
}

    
