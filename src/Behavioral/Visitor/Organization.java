package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    List<Employee> employees;

    public Organization() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateSalary() {
        SalaryCalculator calculator = new SalaryCalculator();
        for (Employee employee : employees) {
            employee.accept(calculator);
        }
        System.out.println("Total salary: " + calculator.getTotalSalary());
    }
}
