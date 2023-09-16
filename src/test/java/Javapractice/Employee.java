package Javapractice;

import java.util.HashMap;

public class Employee {
	

	   public String firstName;
	   public String lastName;
	   public double hourlyPayRate;

	    public Employee(String firstName, String lastName, double hourlyPayRate) {
	       this.firstName = firstName;
	        this.lastName = lastName;
	        this.hourlyPayRate = hourlyPayRate;
	    }

	    public String getFullName() {
	        return this.firstName + " " + this.lastName;
	    }

	    public double calculateWeeklyPay() {
	        return this.hourlyPayRate * 40;
	    }

	    public static void main(String[] args) {
	        HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
	        
	        // adding 3 new employees
	        employees.put(1001, new Employee("John", "Doe", 25.0));
	        employees.put(1002, new Employee("Jane", "Smith", 30.0));
	        employees.put(1003, new Employee("Bob", "Johnson", 20.0));
	        
	        // retrieving employee details by EID
	        int eid = 1002;
	        Employee employee = employees.get(eid);
	        
	        // displaying employee details
	        System.out.println("Employee Name: " + employee.getFullName());
	        System.out.println("Weekly Pay: $" + employee.calculateWeeklyPay());
	    }
	}

