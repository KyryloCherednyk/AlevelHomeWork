package ua.cherednyk.hw10;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");

        // 1. Цикл for
        System.out.println("1. Цикл for:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("\n2. Цикл for-each:");
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println("\n3. Цикл while:");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }
        System.out.println("\n4. Итератор:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}