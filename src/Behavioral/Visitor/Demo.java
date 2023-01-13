package Behavioral.Visitor;

public class Demo {
    public static void main(String[] args) {
        Organization company = new Organization();

        company.addEmployee(new FullTimeEmployee("Haytham", 10000));
        company.addEmployee(new PartTimeEmployee("Hamza", 30));
        company.calculateSalary();
    }
}
