package org.example;


public class SoftwareDeveloper extends Employee {

    public SoftwareDeveloper(int empNum, String empName, int empAge) {
        super(empNum, empName, empAge);
    }

    @Override
    public void jobDesc() {
        System.out.println("Analyze users' needs and then design, test, and develop software to meet those needs");
    }

    public static void main(String [] args){

        SoftwareDeveloper sd = new SoftwareDeveloper(217248756, "Madeleine", 20);

        System.out.println("Employee Num: " + sd.getEmpNum());
        System.out.println("Employee Name: " + sd.getEmpName());
        System.out.println("Employee Age: " + sd.getEmpAge());
        System.out.print("Job Description: ");
        sd.jobDesc();
    }
}
