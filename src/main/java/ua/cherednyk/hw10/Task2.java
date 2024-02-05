package ua.cherednyk.hw10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = getSum(numbers);
        System.out.println("Сумма элементов списка: " + sum);

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Нечетные числа: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("Список строк: " + stringList);

        List<String> doubledList = doubling(stringList);
        System.out.println("Удвоенные строки: " + doubledList);
    }
}