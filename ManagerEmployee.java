package com.krishnavel.assignment;

public class ManagerEmployee extends Employee_01 {
private String department;
public ManagerEmployee(String name, int employeeId, double salary, String department) {
super(name, employeeId, salary);
this.department = department;
} public String getDepartment() {
return department;
} public void setDepartment(String department) {
this.department = department;
}
}