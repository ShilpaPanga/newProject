package org.example;

import java.util.HashSet;
import java.util.Set;

public class TestEmployeeSet {
    public static void main(String[] args) {
        Set<Employee> employee = new HashSet<>();
        Employee e1 = new Employee(100, "John", "Snow", 100000.00, "1234567890");
        Employee e2 = new Employee(101, "Peter", "Parker", 101000.00, "3846913221");
        Employee e3 = new Employee(102, "Johny", "Smith", 120000.00, "2353558999");
        Employee e4 = new Employee(104, "sony", "Singh", 12000.00, "345678922");
        Employee e5 = new Employee(105, "Amit", "Shah", 122000.00, "2137568907");
        Employee e6 = new Employee(106, "Ashish", "Reddy", 123000.00, "3457891234");
        Employee e7 = new Employee(107, "Amar", "Nath", 122000.00, "345678922");
        Employee e8 = new Employee(108, "Samar", "Reddy", 113000.00, "3457891234");
        Employee e9 = new Employee(109, "Ajit", "Ram",122000.00, "345678922");
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);
        employee.add(e7);
        employee.add(e8);
        employee.add(e9);
        System.out.println(employee);
    }
}