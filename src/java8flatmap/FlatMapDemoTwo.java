package java8flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemoTwo {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Tom1", Arrays.asList(1111, 2222)));
		empList.add(new Employee(2, "Tom2", Arrays.asList(1111, 2222)));
		empList.add(new Employee(3, "Tom3", Arrays.asList(1111, 2222)));
		empList.add(new Employee(4, "Tom4", Arrays.asList(1111, 2222)));
		empList.add(new Employee(5, "Tom5", Arrays.asList(4444, 3333)));
		
		//Get the list of distinct mobileNumbers from the employee list
		
		List<Integer> collect = empList.stream()
										.map(emp -> emp.getMobileNumbers())
										.flatMap(e -> e.stream())
										.distinct()
										.sorted()
										.collect(Collectors.toList());
		System.out.println("Distinct sorted list of mobile numbers is = " + collect);
		
	}

}

class Employee {
	private int id;
	private String name;
	private List<Integer> mobileNumbers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public Employee(int id, String name, List<Integer> mobileNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumbers = mobileNumbers;
	}
	
	
}
