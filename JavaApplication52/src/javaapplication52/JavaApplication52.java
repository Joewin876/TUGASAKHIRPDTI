/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Masukan Angka = ");
        x = input.nextInt();
        if (x % 2 == 0 && x % 4 ==0)
        {
            System.out.println("Bilangan genap dan kelipatan 4");
        }
        else
        {
            System.out.println("Bukan bilangan genap dan kelipatan 4");
        }
    
    
    }
    
}
