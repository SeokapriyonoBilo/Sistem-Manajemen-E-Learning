/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Course;
/**
 *
 * @author Slimbook 14 R5
 */
public class OnsiteCourse extends Course {
    private final String classroom;

    public OnsiteCourse(String courseName, String courseCode, int credits, String classroom) {
        super(courseName, courseCode, credits);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Classroom: " + classroom);
    }
}
