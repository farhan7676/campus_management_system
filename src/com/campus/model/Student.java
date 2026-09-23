package com.campus.model;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String department;
    private int[] marks;

    // static variables

    static int studentCount = 0;

    // default constructor

    public Student() {
        studentCount++;
    }

    // parameterized constructor

    public Student(int studentId, String studentName, int age, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    //getters

    public int getStudentID(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return department;
    }
    public int[] getMarks() {
        return marks;
    }

    //setters

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setstudentName(String studentName){
        this.age = age;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setmarks(int[] mark){
        this.marks= mark;
    }

    //instance methods - belongs to object

    public void displayStudentInfo(){
        System.out.println("Student ID" + studentId);
        System.out.println("Student Name" + studentName);
        System.out.println("Age:" + age);
        System.out.println("Department:" + department);
    }

    public void displayStudentInfo(boolean showMarks){
        displayStudentInfo();

        if (showMarks){
            System.out.println("Marks:"+ java.util.Arrays.toString(marks));
        }
    }

    //static methods - belongs to class not object 

    public static void displayStudentCount(){
        System.out.println("Total number of students:" + studentCount);
    }

}
    

