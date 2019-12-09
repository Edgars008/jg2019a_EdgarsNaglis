package Homework_5.Employee;

import java.util.Objects;

//Ok
public class Employee {
    private String contractNumber;
    private double salary;
    Department department;

    public Employee(String contractNumber, double salary, Department department) {
        this.contractNumber = contractNumber;
        this.salary = salary;
        this.department = department;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(contractNumber, employee.contractNumber) &&
                Objects.equals(department, employee.department);

    }


    @Override
    public String toString() {
        return "Darbinieka dati: " +
                "darba līgums: " + contractNumber +
                ", darba alga: " + salary +
                ", departaments: " + department.getName() + ", " + department.getCompany();
    }
}
