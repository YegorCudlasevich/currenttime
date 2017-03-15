package dev8;

import java.util.Scanner;

/**
 * Class MatrixBuilder which contains a method
 * buildMatrix
 */
public class TheMatrixBuilder {

    /**
     * Make a matrix
     *
     * @return matrix
     */
    public double[][] buildMatrix() {
        final String INPUT_ROWS_NOTICE = "Input number of rows: ";
        final String INPUT_COLUMNS_NOTICE = "Input number of columns: ";
        final String INPUT_ELEMENTS_NOTICE = "Input elements of matrix";
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print(INPUT_ROWS_NOTICE);
        a = in.nextInt();
        System.out.print(INPUT_COLUMNS_NOTICE);
        b = in.nextInt();
        double[][] matrix = new double[a][b];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(INPUT_ELEMENTS_NOTICE + "[" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextDouble();
            }
        }
        return matrix;
    }
}