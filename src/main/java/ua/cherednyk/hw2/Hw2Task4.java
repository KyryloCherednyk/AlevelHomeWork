package ua.cherednyk.hw2;

public class Hw2Task4 {
    public static void main(String[] args) {
        int a = -5;
        int b = 7;
        int c = 11;

        int modA = Math.abs(a);
        int modB = Math.abs(b);
        int modC = Math.abs(c);

        int minMod = Math.min(Math.min(modA, modB), modC);

        if (modA == minMod) {
            System.out.println(a);
        } else if (modB == minMod) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

}
