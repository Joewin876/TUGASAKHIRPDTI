/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufvokal;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class Hurufvokal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String huruf;
        System.out.println("Masukan Huruf Anda (Input 1 huruf saja) = ");
        huruf = input.next();
        if ("a".equalsIgnoreCase(huruf)){
            System.out.println("Huruf Vokal");
        }
        else if ("i".equalsIgnoreCase(huruf)){
            System.out.println("Huruf Vokal");
        }
        else if ("u".equalsIgnoreCase(huruf)){
            System.out.println("Huruf Vokal");
        }
        else if ("e".equalsIgnoreCase(huruf)){
            System.out.println("Huruf Vokal");
        }
        else if ("o".equalsIgnoreCase(huruf)){
            System.out.println("Huruf Vokal");            
        }
        else {
            System.out.println("Huruf Konsonan");
        }
    }
    
}
