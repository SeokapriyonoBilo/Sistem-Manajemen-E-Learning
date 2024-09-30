/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
        
/**
 *
 * @author Slimbook 14 R5
 */
public class Course {
    private final String courseName;
    private final String courseCode;
    private final int credits;

    // Constructor
    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    // Method untuk menampilkan informasi kursus
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }

    // Getter untuk courseCode
    public String getCourseCode() {
        return courseCode;
    }
}
