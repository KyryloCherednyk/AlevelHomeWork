package ua.cherednyk.hw9;

public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (CustomException2 ce2) {
            System.out.println("Перехвачено исключение CustomException2 в методе main: " + ce2.getMessage());
        }
    }

    public static void f() throws CustomException2 {
        try {
            g();
        } catch (CustomException1 ce1) {
            System.out.println("Перехвачено исключение CustomException1 в методе f: " + ce1.getMessage());
            throw new CustomException2("Исключение CustomException2 из метода f", ce1);
        }
    }

    public static void g() throws CustomException1 {
        throw new CustomException1("Исключение CustomException1 из метода g");
    }
}

class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message, Throwable cause) {
        super(message, cause);
    }
}