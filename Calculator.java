/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_06;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = initArray(5);
        for(int i=0; i<myIntegers.length;i++){
             System.out.println("Element" +i+", typed value was " +myIntegers[i]);
        }
         System.out.println("the average is" + getAverage(myIntegers));
         for(int i=myIntegers.length-1;i>=0;i--){
              System.out.println("Element" +i+", typed value was " +myIntegers[i]);
         }
    }
    public static int[] initArray(int size){
        System.out.println("Enter " + size + " integer values.\r");
    int[] values = new int[size];
    
    for(int i=0;i<values.length;i++){
        values[i] = scanner.nextInt();
    }
    return values;
    }
    
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/(double)array.length;
    }
}
