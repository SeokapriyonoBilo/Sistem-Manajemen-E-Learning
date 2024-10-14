/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
        
/**
 *
 * @author Slimbook 14 R5
 */
public class Student extends Person {
    private final String major;

    public Student(String studentName, String studentID, String major) {
        super(studentName, studentID);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Major: " + major);
    }

    @Override
    public void displayInfo() {
        displayStudentInfo();
    }
}

