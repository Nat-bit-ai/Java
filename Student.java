package main;

public class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name +"\n" + "Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sui";
        s1.age = 41;

        s1.display();
    }
}