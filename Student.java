package main;

class Student {

    private int id;
    private String name;
    private double grade;

    // final + static shared value (same for all students)
    public static final String SCHOOL_NAME = "Addis Tech School";

    // static counter (shared)
    private static int count = 0;

    public Student() {
        count++;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // display
    public void display() {
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------");
    }

    // static method
    public static int getTotalStudents() {
        return count;
    }
}