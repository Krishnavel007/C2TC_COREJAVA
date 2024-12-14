package com.krishnavel.assignment;
public class DeveloperEmployee extends Employee_01 {
private String programmingLanguage;
public DeveloperEmployee(String name, int employeeId, double salary, String programmingLanguage) {
super(name, employeeId, salary);
this.programmingLanguage = programmingLanguage;
}
public String getProgrammingLanguage() {
return programmingLanguage;
} public void setProgrammingLanguage(String programmingLanguage) {
this.programmingLanguage = programmingLanguage;
}
}