package org.example;

public class Employee {

    private int empNum;
    private String empName;
    private int empAge;

    public Employee() {
    }

    public Employee(int empNum, String empName, int empAge) {
        this.empNum = empNum;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void jobDesc(){
        System.out.println("Varies with each employee");
    }

}
