/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Scanner input = new Scanner(System.in);
       int nilai;
       System.out.println("Masukan Nilai Anda = ");
       nilai=input.nextInt();
       if (nilai >80){
           System.out.println("A");
       }
       else if (nilai >60){
           System.out.println("B");
       }
       else if (nilai >40){
           System.out.println("C");
       }    
       else if (nilai <40){
           System.out.println("D");
       }
    
    }  
    
}
