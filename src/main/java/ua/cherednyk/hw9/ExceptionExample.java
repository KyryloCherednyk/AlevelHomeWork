package ua.cherednyk.hw9;


public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throwExceptionWithMessage("Пример исключения");
        } catch (Exception e) {
            System.out.println("Поймано исключение. Сообщение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally. Выполнено всегда, независимо от того, было ли исключение.");
        }
    }

    public static void throwExceptionWithMessage(String message) throws Exception {
        throw new Exception(message);
    }
}

