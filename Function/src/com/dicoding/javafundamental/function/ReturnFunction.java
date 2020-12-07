package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args){
        double p = 9;
        double l = 4;

        // Ini untuk memanggil fungsinya
        double hasil = hitungLuas(p, l);
        System.out.println("Ini adalah hasil perkaliannya " + hasil);
    }


    // Fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
