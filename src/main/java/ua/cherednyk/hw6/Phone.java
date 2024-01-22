package ua.cherednyk.hw6;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public void displayInfo() {
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " г");
    }

    public void receiveCall(String callerName) {
        System.out.println("\nЗвонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 150.5);
        Phone phone2 = new Phone("987654321", "iPhone 12");
        Phone phone3 = new Phone();

        phone3.number = "555555555";
        phone3.model = "Nokia";
        phone3.weight = 120.3;

        System.out.println("Информация о телефоне 1:");
        phone1.displayInfo();

        System.out.println("\nИнформация о телефоне 2:");
        phone2.displayInfo();

        System.out.println("\nИнформация о телефоне 3:");
        phone3.displayInfo();

        phone1.receiveCall("Полина");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Евгения");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Дмитрий");
        System.out.println("Номер телефона: " + phone3.getNumber());
    }
}