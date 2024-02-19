package ua.cherednyk.hw14;

import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Thread thread1 = new Thread(new PrimeCounter(numbers, 0, numbers.length / 2));
        Thread thread2 = new Thread(new PrimeCounter(numbers, numbers.length / 2, numbers.length));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total prime numbers: " + PrimeCounter.totalPrimes);
    }
}

class PrimeCounter implements Runnable {
    private final int[] numbers;
    private final int start;
    private final int end;
    public static AtomicInteger totalPrimes = new AtomicInteger(0);

    public PrimeCounter(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        totalPrimes.addAndGet(count);
        System.out.println("Prime numbers found by thread " + Thread.currentThread().getId() + ": " + count);
    }

    private boolean isPrime(int number) {
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
}