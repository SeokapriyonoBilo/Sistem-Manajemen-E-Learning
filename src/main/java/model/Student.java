/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
        
/**
 *
 * @author Slimbook 14 R5
 */
public class Student {
    private final String studentName;
    private final String studentID;
    private final String major;

    // Constructor
    public Student(String studentName, String studentID, String major) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.major = major;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }

    // Getter untuk studentID
    public String getStudentID() {
        return studentID;
    }
}

