package ua.cherednyk.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Hw4Task2 {
    public static void main(String[] args) {
        int[] array = new int[400];
        generateRandomArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        int primeCount = countPrimeNumbers(array);
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }

    public static int[] generateRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 1000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}
