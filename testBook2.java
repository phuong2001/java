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
public class testBook2 {
    public static void main(String[] args){
        
   
    Author[] authors = new Author[2];
    authors[0] = new Author( "tranvanphuong", "phuong@gmail.com", 'm');
     authors[1] = new Author( "trannphuong", "tranphuong@gmail.com", 'm');
     
      Book2 javaDummy = new Book2("mm", authors, 12.8 ,9);
      System.out.println(javaDummy); 
}
    
}
