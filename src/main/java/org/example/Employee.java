package org.example;

import java.util.Objects;

public class Employee {
    private Integer empId;
    private String firstName;
    private String lastName;
    private Double Salary;
    private String phoneNumber;

    public Employee(int empId, String firstName, String lastName, double salary, String phoneNumber) {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId) && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && Salary.equals(employee.Salary) && phoneNumber.equals(employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, Salary, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Salary=" + Salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}


