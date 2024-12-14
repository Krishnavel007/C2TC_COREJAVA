package com.krishnavel.assignment;
import com.indira.assignment.Employee_01;
import com.indira.assignment.ManagerEmployee;
import com.indira.assignment.DeveloperEmployee;
public class EmployeeUtilities {
public static void printEmployeeDetails(Employee employee) {
System.out.println("Employee Name: " + employee.getName());
System.out.println("Employee ID: " + employee.getEmployeeId());
System.out.println("Salary: " + employee.getSalary());
if (employee instanceof Manager) {
ManagerEmployee manager = (Manager) Employee_01;
System.out.println("Department: " + manager.getDepartment());
} else if (employee instanceof Developer) {
DeveloperEmployee developer = (Developer) Employee_01;
System.out.println("Programming Language: " + developer.getProgrammingLanguage());
}
System.out.println();
}
}