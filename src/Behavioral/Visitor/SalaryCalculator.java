package Behavioral.Visitor;

public class SalaryCalculator implements EmployeeVisitor {
    private double totalSalary;

    @Override
    public void visit(FullTimeEmployee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        totalSalary += employee.getHourlyRate() * 20 * 8;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
