package Behavioral.Visitor;

public class PartTimeEmployee implements Employee {
    private final String name;
    private final double hourlyRate;

    public PartTimeEmployee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
