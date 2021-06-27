package java8flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemoThree {

	public static void main(String[] args) {
		
		List<EmployeeWithProjects> empList = new ArrayList<EmployeeWithProjects>();
		empList.add(new EmployeeWithProjects(1, "Tom1", Arrays.asList("Java", "Spring")));
		empList.add(new EmployeeWithProjects(2, "Tom2", Arrays.asList("Java", "Python")));
		empList.add(new EmployeeWithProjects(3, "Tom3", Arrays.asList("Java 8", "Spring")));
		empList.add(new EmployeeWithProjects(4, "Tom4", Arrays.asList("Spring Boot", "Python", "Spring JPA")));
		empList.add(new EmployeeWithProjects(5, "Tom5", Arrays.asList("Rest API", "Cucumber")));
		
		//Get the list of distinct projects from the employee list
		
		List<String> collect = empList.stream()
				.map(emp -> emp.getProjects())
				.flatMap(e -> e.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
			
		System.out.println("Distinct sorted list of project is = " + collect);
		
		List<String> collect2 = empList.stream()
									.flatMap(emp -> emp.getProjects().stream())
									.distinct()
									.sorted()
									.collect(Collectors.toList());
		System.out.println("collect2 = " + collect2);
		
		//empList.forEach(emp -> System.out.println(emp));
		
		//Find all employees who have project = Python
		System.out.println("Employees with project = python are");
		empList.stream().filter(emp -> emp.getProjects().contains("Python")).forEach(System.out::println);
		
	}

}

class EmployeeWithProjects {
	private int id;
	private String name;
	private List<String> projects;
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
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public EmployeeWithProjects(int id, String name, List<String> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "EmployeeWithProjects [id=" + id + ", name=" + name + ", projects=" + projects + "]";
	}
	
}
