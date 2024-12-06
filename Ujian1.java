
package com.mycompany.ujian1;
import java.util.Scanner;
public class Ujian1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        boolean isPrima = cekPrima(bilangan);

        if (isPrima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

    public static boolean cekPrima(int bilangan) {
        if (bilangan < 2) {
            return false;
        }
       
        for (int i = 2; i <= (bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }

        return true;
    }
}

     

