package Oops;

public class Employee {
	private int id;
	private String name;
	private String email;
	private double salary;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int d) {
		id=d;
	}
	

	public String getName() {
		return name;
	}
	
	public void setId(String n) {
		name=n;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		email=e;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double s) {
		if(s<10000) {
			salary=0;
		}else {
			salary=s;
		}
		
	}

}
