package ua.cherednyk.hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleToCSV {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        String currentLine = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                if ("end".equals(input)) {
                    if (!currentLine.isEmpty()) {
                        lines.add(currentLine.trim());
                    }
                    break;
                } else if ("next".equals(input)) {
                    lines.add(currentLine.trim());
                    currentLine = "";
                } else {
                    currentLine += input.trim() + ", ";
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.csv")) {
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (i == lines.size() - 1) {
                    line = line.substring(0, line.length() - 1);
                }
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}