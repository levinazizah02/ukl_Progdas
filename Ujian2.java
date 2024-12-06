
package com.mycompany.ujian2;

public class Ujian2 {

    public static void main(String[] args) {
        int tabunganBulanan = 100000; 
        int totalTabungan = 0;

        for (int bulan = 1; bulan <= 12; bulan++) {
            totalTabungan += tabunganBulanan;
            
            System.out.println("Bulan " + bulan + ": Rp" + tabunganBulanan);
            tabunganBulanan += 50000;
        }
        System.out.println("Total tabungan setelah 12 bulan: Rp" + totalTabungan);
    }
}

    

    

