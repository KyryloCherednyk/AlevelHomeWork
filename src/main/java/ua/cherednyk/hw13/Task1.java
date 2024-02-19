package ua.cherednyk.hw13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Box {
    @SerializedName("from")
    String origin;

    @SerializedName("material")
    String material;

    @SerializedName("color")
    String color;

    @SerializedName("max-lifting-capacity")
    LiftingCapacity liftingCapacity;

    @SerializedName("cargo")
    Cargo cargo;

    @SerializedName("delivery-date")
    LocalDateTime deliveryDate;

    static class LiftingCapacity {
        String unit;
        int value;
    }

    static class Cargo {
        String name;

        @SerializedName("class")
        String classType;
    }
}

public class Task1 {
    public static void main(String[] args) {

        String jsonFilePath = "box.json";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();

            // Преобразование JSON в объект Box
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer())
                    .create();
            Box box = gson.fromJson(stringBuilder.toString(), Box.class);

            // Вывод информации о Box
            System.out.println("Origin: " + box.origin);
            System.out.println("Material: " + box.material);
            System.out.println("Color: " + box.color);
            System.out.println("Lifting Capacity: " + box.liftingCapacity.value + " " + box.liftingCapacity.unit);
            System.out.println("Cargo Name: " + box.cargo.name);
            System.out.println("Cargo Class: " + box.cargo.classType);
            System.out.println("Delivery Date: " + box.deliveryDate);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class LocalDateTimeDeserializer implements com.google.gson.JsonDeserializer<java.time.LocalDateTime> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public java.time.LocalDateTime deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
        String dateString = json.getAsString();
        return java.time.LocalDateTime.parse(dateString, FORMATTER);
    }
}