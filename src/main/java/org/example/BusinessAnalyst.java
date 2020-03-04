package org.example;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(int empNum, String empName, int empAge) {
        super(empNum, empName, empAge);
    }

    @Override
    public void jobDesc() {
        System.out.println("The analyst solves business problems and, as needed, designs technical solutions");
    }

    public static void main(String [] args){

        BusinessAnalyst ba = new BusinessAnalyst(218342316, "Phelang", 25);


        System.out.println("Employee Num: " + ba.getEmpNum());
        System.out.println("Employee Name: " + ba.getEmpName());
        System.out.println("Employee Age: " + ba.getEmpAge());
        System.out.print("Job Description: ");
        ba.jobDesc();

    }
}
