package Behavioral.Visitor;

public interface EmployeeVisitor {
    void visit(FullTimeEmployee employee);

    void visit(PartTimeEmployee employee);
}
