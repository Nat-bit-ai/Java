package main;

class Student{
	
	private int id;
	private String name;
	private int age;
	private double grade;
	
	public final String SCHOOL_NAME = "AAU";
	public  static int count;
	
	public Student(){
		count++;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setGrade(double grade) {
		this.grade=grade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void display() {
		System.out.println("school name : " + SCHOOL_NAME);
		System.out.println("ID: " + id);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("----------");
	}
	
	public static int getStud() {
		return count;
	}
}