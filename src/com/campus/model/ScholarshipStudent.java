package com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public ScholarshipStudent(int studentid , String studentName, int age, String department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentName, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    //getter

    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    //setter

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    } 

    // Implement abstract method

    public void StudentType(){
        System.out.println("scholarship Student");
    }
    @Override 
    public void displayStudentInfo(){
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
    @Override 
    public void displayStudentInfo(boolean showMarks){
        super.displayStudentInfo(showMarks);
    }

}
