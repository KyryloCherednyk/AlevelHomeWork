import java.util.Scanner;

public class Hw2Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.println("Число " + number + " четное.");

        } else {

            System.out.println("Число " + number + " нечетное.");
        }


    }
}

