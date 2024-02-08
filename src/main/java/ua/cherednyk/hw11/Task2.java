package ua.cherednyk.hw11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key + ", " + value + "}";
    }
}

public class Task2 {

    public static List<Pair<Integer, List<String>>> groupByStringLength(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            resultMap.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }
        List<Pair<Integer, List<String>>> resultList = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : resultMap.entrySet()) {
            resultList.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> inputStrings = List.of("тут", "там", "стол");
        List<Pair<Integer, List<String>>> result = groupByStringLength(inputStrings);
        System.out.println(result);
    }
}