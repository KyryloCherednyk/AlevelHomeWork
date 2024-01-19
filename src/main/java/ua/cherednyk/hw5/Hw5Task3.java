package ua.cherednyk.hw5;

import java.util.Arrays;

public class Hw5Task3 {
    public static void main(String[] args) {

        int[][] originalArray = generateArray(2, 3);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int[][] transformedArray = transformArray(originalArray);

        System.out.println("Преобразованный массив:");
        printArray(transformedArray);
    }

    public static int[][] generateArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value++;
            }
        }
        return array;
    }

    public static int[][] copyArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(array[i], cols);
        }
        return copy;
    }

    public static int[][] transformArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transformedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transformedArray[j][i] = array[i][j];
            }
        }

        return transformedArray;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
