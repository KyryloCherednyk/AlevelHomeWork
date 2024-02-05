package ua.cherednyk.hw10;

import java.util.Optional;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/432556";
        PHONE_BOOK[1] = "016/768768";
        PHONE_BOOK[2] = "016/161617";

        Optional<Integer> index = findIndexByPhoneNumber("016/161617");
        System.out.println("Индекс телефона: " + (index.isPresent() ? index.get() : "Телефон не найден"));

        System.out.println("Элементы в телефонной книге:");
        for (String phoneNumber : PHONE_BOOK) {
            System.out.println(phoneNumber);
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i] != null && PHONE_BOOK[i].equals(phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}