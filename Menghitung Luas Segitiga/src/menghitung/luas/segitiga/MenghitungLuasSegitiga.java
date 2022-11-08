package menghitung.luas.segitiga;

import java.util.Scanner;


public class MenghitungLuasSegitiga {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double alas, tinggi, sisimiring, keliling, luas;
        System.out.print("Masukkan alas Anda = ");
        alas=input.nextInt();
        System.out.print("Mauskkan tinggi Anda= ");
        tinggi=input.nextInt();
        sisimiring=(int) Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        System.out.println("Nilai siimiring Anda= " + sisimiring);
        keliling= alas + tinggi + sisimiring;
        System.out.println("Keliling segitiga anda adalah = " + keliling);
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga anda ialah = " + luas);
        
    }
    
}
