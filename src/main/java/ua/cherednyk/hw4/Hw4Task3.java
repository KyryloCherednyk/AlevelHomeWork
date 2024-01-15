package ua.cherednyk.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Hw4Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        generateRandomArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        int[] modifiedArray = Arrays.copyOf(array, array.length);
        modifiedArray = replaceEvenWithZeros(modifiedArray);
        System.out.println("Измененный массив:");
        printArray(modifiedArray);
        System.out.println("Проверка исходного массива:");
        printArray(array);
    }

    public static int[] generateRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 2000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] replaceEvenWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}
