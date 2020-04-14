package com.inzy.ds.example;

public class TransposeOfMatrxi {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 6, 9}, {6, 3, 1, 4}, {5, 3, 7, 0}, {8, 3, 2, 0}};
        print2D(arr);
        transpose(arr, 4, 4);
    }

    private static void transpose(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                if (i != j || arr[i][j] != arr[j][i]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        System.out.println("");
        print2D(arr);
    }

    private static void print2D(int mat[][]) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }

}
