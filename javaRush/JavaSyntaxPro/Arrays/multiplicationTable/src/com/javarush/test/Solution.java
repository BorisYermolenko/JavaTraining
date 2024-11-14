package com.javarush.test;

public class Solution {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];
        int i, j;
        for (i = 1; i <= 10; i++){
            for (j = 1; j <= 10; j++){
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}

