/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x,y,z,hasil,akhir;
        
        System.out.println("Masukan Harga 1 = ");
        System.out.println("Masukan Harga 2 = ");
        System.out.println("Masukan Harga 3 = ");
        x=input.nextDouble();
        y=input.nextDouble();
        z=input.nextDouble();
        hasil=x+y+z;
        akhir=15 * hasil/100;
        if ( hasil >= 250000 )
        {
            System.out.println(hasil-akhir);            
        }
        else
        {
            System.out.println("Tidak mendapat potongan harga");
        }
           
    }
    
}
