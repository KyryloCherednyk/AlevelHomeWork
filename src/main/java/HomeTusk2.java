public class HomeTusk2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("До:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = b - a;
        a = a + b;

        System.out.println("Після:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
