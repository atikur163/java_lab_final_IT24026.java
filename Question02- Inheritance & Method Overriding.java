class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    public double calculateSalary() {
        return 42000.0;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public double calculateSalary() {
        return 8200.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        System.out.println("Full Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + emp2.calculateSalary());
    }
}
