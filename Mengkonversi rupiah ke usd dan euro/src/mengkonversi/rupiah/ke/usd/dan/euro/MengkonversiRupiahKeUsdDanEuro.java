/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengkonversi.rupiah.ke.usd.dan.euro;

import java.util.Scanner;

/**
 *
 * @author Joewi
 */
public class MengkonversiRupiahKeUsdDanEuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tanya;
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda lapar?(Ya atau Tidak) : " );
        tanya = input.next();
        if ("Ya".equalsIgnoreCase(tanya))
        {
            System.out.println("Makan");
            
        }
        else
        {
            System.out.println("Tidak Makan");
          
        }
                
    }
    
}
