package com.dicoding.javafundamental.propertimetode;

class Hewan {
    // Properti atau fields

    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;


    // Konstruktor dengan parameter
    Hewan(int umur){
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berjalan dengan sangat cepat");
    }

    void jalan(){
        System.out.println("Berjalan dengan sangat pelan");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut.....");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    double getUmur(){
        return umur;
    }
}
