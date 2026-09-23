package com.campus.service;

import com.campus.model.Student;

public class StudentService {

    //calculate Total Marks

    public int calculateTotal(Student student) {
        int total = 0;
        int[] marks = student.getMarks();
        if (marks == null) {
            return 0;
        }
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    //calculate Average Marks

    public double calculateAverage(Student student) {
        int total = calculateTotal(student);
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        return (double) total / marks.length;
    }

    // Find Maximum Marks

    public int findMax(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int max = marks[0];

        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    //Find Minimum Marks

    public int findMin(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }

        int[] marks = student.getMarks();
        int min = marks[0];

        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    //Grade based on user Marks 

    public char grade(Student student){
        int marks[] = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int total = calculateTotal(student);
        double average = calculateAverage(student);
        if (average >= 80) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else if (average >= 40) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // pass or fail

    public String passOrFail(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverage(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Display Report Card

    public void displayReportCard(Student student) {
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Total Marks: " + calculateTotal(student));
        System.out.println("Average Marks: " + calculateAverage(student));
        System.out.println("Maximum Marks: " + findMax(student));
        System.out.println("Minimum Marks: " + findMin(student));
        System.out.println("Grade: " + grade(student));
        System.out.println("Result: " + passOrFail(student));
    }

}