package ua.cherednyk.hw1;

public class Hw1Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("До:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("Після:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
