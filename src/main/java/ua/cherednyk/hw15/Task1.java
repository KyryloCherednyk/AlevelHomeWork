package ua.cherednyk.hw15;
import java.lang.reflect.Field;

public class Task1 {
    public static void main(String[] args) throws Exception {
        // Создание экземпляра класса A с помощью рефлексии
        A instance = createInstance(A.class);

        // Изменение значений переменных
        setPrivateField(instance, "id", "456");
        setPrivateField(instance, "name", "B");

        // Вывод информации о экземпляре
        System.out.println(instance);
    }

    // Создание экземпляра класса с приватным конструктором с помощью рефлексии
    public static <T> T createInstance(Class<T> clazz) throws Exception {
        java.lang.reflect.Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    // Установка значения приватной переменной с помощью рефлексии
    public static void setPrivateField(Object object, String fieldName, Object value) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    }
}