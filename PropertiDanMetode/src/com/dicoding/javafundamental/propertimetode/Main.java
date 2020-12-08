package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args){

        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        System.out.println("Umur kucing adalah " + kucing.getUmur());

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( (tinggi)*0.01) * ((tinggi)*0.01 )

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));

        System.out.println("Ini adalah sebuah hitungan berat dari kucing " + bmi);

    }
}
