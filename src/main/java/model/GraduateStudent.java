/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Slimbook 14 R5
 */
public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String studentName, String studentID, String major, String thesisTitle) {
        super(studentName, studentID, major);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
