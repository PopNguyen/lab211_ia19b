/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ASUS
 */

public class Matrix {

    private int row;
    private int column;
    int array[][];

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.array = new int[row][column];
    }

    public Matrix() {

    }

    int[][] inputMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = Test2.checkInputInt("Enter Matrix" + "[" + i + "]" + "[" + j + "]:");
            }
        }
        return array;
    }

    void displayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }

    static void additionMatrix(Matrix m1, Matrix m2) {
        m1.displayMatrix();
        System.out.println("+");
        m2.displayMatrix();
        System.out.println("=");
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.column; j++) {
                System.out.print("[" + (m1.array[i][j] + m2.array[i][j]) + "]");
            }
            System.out.println();
        }
    }

    static void subtractionMatrix(Matrix m1, Matrix m2) {
        m1.displayMatrix();
        System.out.println("+");
        m2.displayMatrix();
        System.out.println("=");
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.column; j++) {
                System.out.print("[" + (m1.array[i][j] - m2.array[i][j]) + "]");
            }
            System.out.println();
        }
    }

    static void multiplicationMatrix(Matrix m1, Matrix m2) {
        m1.displayMatrix();
        System.out.println("*");
        m2.displayMatrix();
        System.out.println("=");
        if (m1.column != m2.row) {
            System.err.println("Can't multiple");
            return;
        }
        Matrix matrixResult = new Matrix(m1.row, m2.column);
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m2.column; j++) {
                matrixResult.array[i][j] = 0;
            }
        }
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m2.column; j++) {
                for (int k = 0; k < m1.column; k++) {
                    matrixResult.array[i][j] += m1.array[i][k] * m2.array[k][j];
                }
            }
        }
        matrixResult.displayMatrix();
    }
}
