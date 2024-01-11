package ua.cherednyk.hw3;
import java.util.Scanner;
public class Hw3Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в строке: " + wordCount);
    }

    public static int countWords(String str) {
        int wordCount = 0;

        boolean insideWord = false;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (insideWord) {
                    wordCount++;
                    insideWord = false;
                }
            } else {
                insideWord = true;
            }
        }


        if (insideWord) {
            wordCount++;
        }

        return wordCount;
    }
}

