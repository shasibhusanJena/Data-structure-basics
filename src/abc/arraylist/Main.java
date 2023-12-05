package abc.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new Vector<Employee>();
		employeeList.add(new Employee("Shasi", "Jena", 1234));
		employeeList.add(new Employee("Amit", "Singh", 3322));
		employeeList.add(new Employee("Varun", "Verma", 4433));
		employeeList.add(new Employee("Saurav", "Sanjay", 5555));
		employeeList.add(new Employee("sunil", "Kumar", 1299));
		
		
		
		System.out.println("find first element from the arrayList"+ employeeList.get(0));
		
		// check is the array is empty
		System.out.println(employeeList.isEmpty());
		
		// replace 2nd value with a new element.
		employeeList.set(1, new Employee("Amar", "Khan", 6578));
		
		// Print value in the array 
	//	employeeList.forEach(employee -> System.out.println(employee));
		
		// convert arrayList into an array 
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee employee2 : employeeArray) {
			System.out.println(employee2);
		}
	// check element is part of the array without equals method it will give error.	
		System.out.println(employeeList.contains(new Employee("Varun", "Verma", 4433)));
	}
	
}
