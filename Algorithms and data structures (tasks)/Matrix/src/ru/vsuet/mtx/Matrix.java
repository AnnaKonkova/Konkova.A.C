package ru.vsuet.mtx;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private int[][] matrix;
    public int sumUpDiagonal;
    public int sumDownDiagonal;
    public int productDiagonal;

    Random rand = new Random();
    public Matrix(int size) {
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
    }

    public int matrSumUpDiagonal(){
        this.sumUpDiagonal = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j= i +1; j < matrix.length ; j++) {
                sumUpDiagonal += matrix[i][j];
            }
        }
        return sumUpDiagonal;
    }

    public int matrSumDownDiagonal(){
        this.sumDownDiagonal = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; ++j) {
                sumDownDiagonal -= ints[j];
            }
        }
        return sumDownDiagonal;
    }

    public int matrProductDiagonal(){
        this.productDiagonal=1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    productDiagonal*=matrix[i][j];
                }
            }
        }
        return productDiagonal;
    }

    public String toString(){
        StringBuilder builer = new StringBuilder();
        for(int[] ints:matrix){
            for(int j=0;j<matrix.length;j++){
                builer.append(ints[j]).append(" ");
            }
            builer.append("\n");
        }
        return builer.toString();
    }

}
