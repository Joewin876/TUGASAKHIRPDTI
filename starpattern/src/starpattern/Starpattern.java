/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class Starpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i,j,k,n;
        System.out.print("Masukan angaka rows yang mau di print = ");
        n =sc.nextInt();
        for(i= 0;i<= n-1;i++)
        {
        for(j=0;j<i;j++) 
        {
        System.out.print(" ");    
        }
        for(k=i;k<=n-1;k++)
        {
        System.out.print("*" + " ");
        {
        System.out.println("");
        {
        for(i=n-1;i>=0;i--)
        {
        for(j=0;j<i;j++)
        {
        System.out.print(" ");
        }
        for(k=i;k<=n-1;k++)
        {
        System.out.print("*" + " ");
        }
        System.out.println("");
        }
        sc.close();
        }
        }
        
        
        
        
        
        
        
        
            
            
            
    

