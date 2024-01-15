package ua.cherednyk.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Hw4Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        generateRandomArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        double average = calculateArithmeticMean(array);
        System.out.println("Среднее арифметическое: " + average);
        double geometricMean = calculateGeometricMean(array);
        System.out.println("Среднее геометрическое: " + geometricMean);
    }

    public static int[] generateRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static double calculateArithmeticMean(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        int product = 1;
        for (int element : array) {
            product *= element;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}
