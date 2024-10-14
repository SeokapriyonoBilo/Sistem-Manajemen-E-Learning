/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Slimbook 14 R5
 */
public class UndergraduateStudent extends Student{
    private String minor;

    public UndergraduateStudent(String studentName, String studentID, String major, String minor) {
        super(studentName, studentID, major);
        this.minor = minor;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Minor: " + minor);
    }
}
