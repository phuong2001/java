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
public class Temprature {
 public static void main(String[] args) {
   int n,sum=0;
   double medium;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số ngày: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    // khởi tạo và cấp phát bộ nhớ cho mảng
    int array[] = new int[n];
         
    System.out.println("Nhập nhiệt độ các ngày: ");
    for (int i = 0; i < n; i++) {
        System.out.print("");
        array[i] = scanner.nextInt();
    }
    
    for(int i=0; i<array.length;i++){
             System.out.println("Element" +i+", typed value was " +array[i]);
        }
     
          // tính tổng các phần tử có trong mảng
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
   //tính trung bình cộng
     medium = sum / n;
      System.out.println("nhiệt độ trung bình  = " +medium );
     
}
}