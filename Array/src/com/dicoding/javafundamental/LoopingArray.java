package com.dicoding.javafundamental;

public class LoopingArray {
    public static void main (String[] args){
        int[] arrInt = new int[100000];

        for(int x = 0; x < arrInt.length; x++){
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
