package ImpPrograms.streamApi;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSortingExample {

    public static void main(String[] args) throws FileNotFoundException {
        // List of employees
        List<Employee> employees = Arrays.asList(
                new  Employee("Alice", 30, 70000),
                new  Employee("Bob", 25, 60000),
                new  Employee("Charlie", 35, 80000),
                new  Employee("David", 30, 75000),
                new  Employee("Eve", 29, 65000)
        );

        // 1. Sort employees by age in ascending order
        List< Employee> sortedByAge = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Sorted by age (ascending):");
        sortedByAge.forEach(System.out::println);

        // 2. Sort employees by salary in descending order
        List< Employee> sortedBySalaryDesc = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .collect(Collectors.toList());
        System.out.println("\nSorted by salary (descending):");
        sortedBySalaryDesc.forEach(System.out::println);

        // 3. Sort employees by name in alphabetical order
        List< Employee> sortedByName = employees.stream().sorted(Comparator.comparing( Employee::getName)).collect(Collectors.toList());
        System.out.println("\nSorted by name (alphabetical):");
        sortedByName.forEach(System.out::println);

        // 4. Sort employees by age first, then by salary if ages are the same
        List< Employee> sortedByAgeThenSalary = employees.stream()
                .sorted(Comparator.comparingInt( Employee::getAge).thenComparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("\nSorted by age, then salary:");
        sortedByAgeThenSalary.forEach(System.out::println);

        Stream<String> stringStream = employees.stream().filter(x -> x.getAge() > 35).map(y -> {
                    return y.getName();
        }
        );
    }
    
    
}
