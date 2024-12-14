package com.krishnavel.assignment;
import com.krishnavel.assignmnet.ManagerEmployee;
import com.krishnavel.assignmnet.DeveloperEmployee;
import com.krishnavel.assignmnet.EmployeeUtilities;
public class Managermain {
public static void main(String[] args) {
ManagerEmployee manager = new ManagerEmployee("John", 101, 90000, "Sales");
DeveloperEmployee developer = new DeveloperEmployee("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
