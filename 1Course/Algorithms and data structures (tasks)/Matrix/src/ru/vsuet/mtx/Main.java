package ru.vsuet.mtx;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter matrix size: ");
        int size = console.nextInt();

        Matrix matrix = new Matrix(size);
        System.out.println("Matrix has been created: ");
        System.out.println(matrix);

        System.out.println("Matrix summa over diagonal: " + matrix.matrSumUpDiagonal());
        System.out.println("Matrix summa down diagonal: " + matrix.matrSumDownDiagonal());
        System.out.println("Matrix product diagonal: " + matrix.matrProductDiagonal());

    }
}