/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Yad
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int target = 104978;
  int[] ara = new int[6];         

  for(int i=0;i<ara.length;i++)
  {
         ara[i]=target%10; 
         target=target/10;
  }
        
        // TODO code application logic here
    }
    
}
