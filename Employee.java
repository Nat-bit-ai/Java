package main;

public class Employee {
	private String id;
	private double price;
	private String dep;
	
	Employee(String id){
		this.id = id;
	}
	
	Employee(String id, double price){
		this(id);
		this.price = price;
	}
	
	Employee(String id, double price, String dep){
		this(id, price);
		this.dep = dep;
	}
	
	void updateSalary(Employee e , int price) {
		e.price = price;
	}
	Employee getPromotedEmployee(String newDept, double newSalary) {
		return new Employee(id,newSalary, newDept);
	}
	
	void display() {
		System.out.println("id : " + id + "\n Salary : " + price + "\n Department : " + dep);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
	}
}
