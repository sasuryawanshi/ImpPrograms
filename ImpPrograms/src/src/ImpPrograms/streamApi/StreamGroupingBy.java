package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeData {
	int id;
	String name;
	int salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public EmployeeData(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class StreamGroupingBy {
	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData(101, "Sam", 140000);
		EmployeeData e2 = new EmployeeData(102, "Deep", 140000);
		EmployeeData e3 = new EmployeeData(101, "Ken", 140000);
		EmployeeData e4 = new EmployeeData(102, "Tim", 140000);
		EmployeeData e5 = new EmployeeData(103, "John", 140000);
		List<EmployeeData> list = Arrays.asList(e1, e2, e3, e4, e5);
		// Map<Integer, List<EmployeeData>> collect =
		// list.stream().collect(Collectors.groupingBy(EmployeeData::getId));
		// System.out.println(collect);
		Map<Integer, Integer> sum = list.stream()
				.collect(Collectors.groupingBy(EmployeeData::getId, Collectors.summingInt(EmployeeData::getSalary)));
		System.out.println(sum);

	}
}
