package java.ds.sorting;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
/*
 * input : Student[] arr type
 * sort a Student object using comparator interface
 * 
 */
class Student{
	int rollNo;
	String name,address;
	
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
}
class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo - o2.rollNo;
	}
	
}

public class ArraySortingUsingComparator {
	public static void main(String[] args) {
	
	Student[] arr = {new Student(3, "amit", "Blore"),
					new Student(2, "Gaurav", "Pune"),
					new Student(5, "Saurav", "Mysore")};
	
	System.out.println("Onsorted "+Arrays.toString(arr));
	
	Arrays.sort(arr, new SortByRollNo());
	
	System.out.println("After sorting using roll No"+Arrays.toString(arr));
	
	}
	
}


