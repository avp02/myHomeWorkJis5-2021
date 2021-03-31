package com.avp.homework10diagonal.service;

public class DiagonalService {

    public int returnSumAllNumbersOfDiagonal(int n, int p) throws NumberFormatException{
        if (n > 0 && p > 0 && n > p) {
            int numberOfElements = n - p + 1;
            int[][] elementTriangle = fillArray(n);
            int sum = 0;
            for (int i = 0; i < numberOfElements; i++) {
                sum += elementTriangle[i][p];
            }
            return sum;
        }
        throw new NumberFormatException("Is always must be: n > 0, p > 0, n > p");
    }

    private int[][] fillArray(int n) {
        int[][] elementTriangle = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            elementTriangle[i][0] = 1;
        }
        for (int j = 0; j < n + 1; j++) {
            elementTriangle[0][j] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                elementTriangle[i][j] = elementTriangle[i][j - 1] + elementTriangle[i - 1][j];
            }
        }
        return elementTriangle;
    }
}
