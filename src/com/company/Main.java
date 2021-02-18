package com.company;


public class Main {
    // Задание 1;
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] zeroNull = {0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0};
        for (int z = 0; z < zeroNull.length; z++) {
            if (zeroNull[z] == 0) {
                zeroNull[z] = 1;
                System.out.print(zeroNull[z] + " ");
            } else {
                zeroNull[z] = 0;
                System.out.print(zeroNull[z] + " ");
            }
        }
        System.out.println();
        System.out.println("Задание 2:");
        // Задание 2
        int[] plusThree = new int[8];
        for (int a = 0, b = 0; a < plusThree.length; a++, b += 3) {
            plusThree[a] = b;
            System.out.print(plusThree[a] + " ");
        }
        System.out.println();
        System.out.println("Задание 3:");
        //задание 3
        int[] onTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < onTwo.length; a++) {
            if (onTwo[a] < 6) {
                onTwo[a] = onTwo[a] * 2;
                System.out.print(onTwo[a] + " ");
            } else {
                System.out.print(onTwo[a] + " ");
            }
        }//Задание 4
        System.out.println();
        System.out.println("Задание 4:");
        int[][] diagonalOne = new int[8][8];
        for (int a = 0; a < diagonalOne.length; a++) {
            for (int b = 0; b < diagonalOne[a].length; b++) {
                if (a + b == (diagonalOne.length) - 1 || a == b)
                    diagonalOne[a][b] = 1;
            }
        }
        for (int a = 0; a < diagonalOne.length; a++) {
            for (int b = 0; b < diagonalOne[a].length; b++) {
                System.out.print(diagonalOne[a][b] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("Задание 5:");
        //Задание 5 
        int[] maxMin = {74, 2, 6, 8, 7, -13, 5, 8, 25, 8, 9,99,5};
        int min = maxMin[0], max = maxMin[0] ;
        for (int i = 0; i < maxMin.length; i++) {
            if (maxMin[i] > max) {
                max = maxMin[i];
            }
            if (maxMin[i] < min) {
                min = maxMin[i];
            }
        }
        System.out.println("Максимальное значение массива:  " + max);
        System.out.println("Минимальное значение массива:  " + min);
     // Задание 6 (Подглядел решение,но с кодом разобрался)
    } static boolean balance(int[] leftRight){
        int leftSum=0;
                for(int i=0;i< leftRight.length;i++){
                    leftSum+=leftRight[i];
                    int rightSum=0;
                    for(int j=(i+1);j<leftRight.length;j++) {
                        rightSum += leftRight[j];
                    } if (leftSum==rightSum) {
                        return true;
                    }
                    }
                return false;
                }
                // Задание 7 сделать не успел
    }

























