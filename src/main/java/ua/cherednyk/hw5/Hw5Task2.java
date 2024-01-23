package ua.cherednyk.hw5;

import java.util.Arrays;

public class Hw5Task2 {
    public static void main(String[] args) {

        int[][] originalArray = generateArray(3, 3);

        int[] array1 = {1, 2, 3, 4, 5};

        System.out.println("Одномерный масив " + isDescending(array1));

        System.out.println("\nИсходный массив:");
        printArray(originalArray);

        int[][] modifiedArray = copyArray(originalArray);

        fillArrayWithIndexes(modifiedArray);

        System.out.println("Измененный массив:");
        printArray(modifiedArray);

        boolean isDescending = isDescending(modifiedArray);

        System.out.println("Массив упорядочен по убыванию: " + isDescending);
    }

    public static int[][] generateArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
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

    public static void fillArrayWithIndexes(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i % 2 == 0 ? value : -value;
                value++;
            }
        }
    }

    public static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    // Метод для двумерных массивов
    public static boolean isDescending(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j - 1] < array[i][j]) {
                    return false;
                }
            }
        }
        return true;
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