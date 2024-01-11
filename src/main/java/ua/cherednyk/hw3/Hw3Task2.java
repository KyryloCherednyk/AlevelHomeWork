package ua.cherednyk.hw3;

import java.util.Scanner;

public class Hw3Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String input = scanner.nextLine();


        String stringWithoutSpaces = removeSpaces(input);


        if (isPalindrome(stringWithoutSpaces)) {

            System.out.println("Строка является палиндромом.");

        } else {

            System.out.println("Строка не является палиндромом.");

        }
    }


    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
