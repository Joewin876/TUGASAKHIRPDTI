/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Masukan Angka pertama anda = ");
        System.out.println("Masukan angka kedua anda = ");
        a = input.nextInt();
        b = input.nextInt();
        if (a>b){
            System.out.println("bilangan pertama =" + a + "lebih besar");
        }
        else
        {
            System.out.println("bilangan kedua = " + b + "lebih besar");
        }        
            
                
        
    
    
    
    
    
    
                
                
                }
    
}
