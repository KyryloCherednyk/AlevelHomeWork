package ua.cherednyk.hw8;


@FunctionalInterface
interface Pow {
    int pow(int number, int exponent);
}

public class Task2 {
    public static void main(String[] args) {

        Pow powFunction = (number, exponent) -> {
            int result = 1;

            for (int i = 0; i < exponent; i++) {
                result *= number;
            }

            return result;
        };

        int base = 2;
        int exponent = 3;
        int result = powFunction.pow(base, exponent);

        System.out.println(base + " в степени " + exponent + " равно " + result);
    }
}

