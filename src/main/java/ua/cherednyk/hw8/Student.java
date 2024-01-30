package ua.cherednyk.hw8;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }

    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "GroupA", 4.5);
        Aspirant aspirant = new Aspirant("Alice", "Smith", "GroupB", 5.0, "Research on Java");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}


