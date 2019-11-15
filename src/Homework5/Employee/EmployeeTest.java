package Homework5.Employee;

import Homework5.Employee.Company;
import Homework5.Employee.Department;
import Homework5.Employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Company twino = new Company("TWINO","401030405060");
        Department twinoFinance = new Department ("Finance", twino);
        Employee Edgars = new Employee("D0070", 1000, twinoFinance);

        System.out.println(twino.toString());
        System.out.println(twinoFinance.toString());
        System.out.println(Edgars.toString());
    }
}
