
package com.mycompany.ujian3;
import java.util.Scanner;
public class Ujian3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jumlahElemen = scanner.nextInt();

        int[] array = new int[jumlahElemen];
        System.out.println("Masukkan elemen-elemen array:");
        
        for (int i = 0; i < jumlahElemen; i++) {
            array[i] = scanner.nextInt();
        }

        boolean adaNegatif = false;
        StringBuilder elemenNegatif = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (adaNegatif) {
                    elemenNegatif.append(", ");
                }
                elemenNegatif.append(array[i]);
                adaNegatif = true;
            }
        }

        
        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif: " + elemenNegatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
}

      

