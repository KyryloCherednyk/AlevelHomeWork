package ua.cherednyk.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Hw4Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        generateRandomArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        int[] modifiedArray = replaceEvenWithZeros(array);
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

    public static int[] replaceEvenWithZeros(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                newArray[i] = 0;
            }
        }
        return newArray;
    }
}
