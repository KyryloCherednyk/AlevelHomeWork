package ua.cherednyk.hw11;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> calculateStringLengths(String[] strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            resultMap.put(str, length);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String[] inputStrings = {"тут", "там", "стол"};
        Map<String, Integer> result = calculateStringLengths(inputStrings);
        System.out.println(formatMap(result));
    }

    public static String formatMap(Map<String, Integer> map) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.append("{")
                    .append("\"").append(entry.getKey()).append("\"")
                    .append(", ")
                    .append(entry.getValue())
                    .append("}, ");
        }

        if (!map.isEmpty()) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("}");
        return builder.toString();
    }
}