package ua.cherednyk.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {

    public static void addElementsToLists() {
        List<Integer> arrayList = new ArrayList<>();
        long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Время добавления 1 млн элементов в ArrayList: " + (endTimeArrayList - startTimeArrayList) + " мс");

        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Время добавления 1 млн элементов в LinkedList: " + (endTimeLinkedList - startTimeLinkedList) + " мс");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выбора наугад 1 млн элементов из списка: " + (endTime - startTime) + " мс");
    }

    public static void main(String[] args) {
        addElementsToLists();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        getRandomElements(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        getRandomElements(linkedList);
    }
}