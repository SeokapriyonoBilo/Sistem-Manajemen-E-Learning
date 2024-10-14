/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Slimbook 14 R5
 */
public class OnlineCourse extends Course {
    private final String platform;

    public OnlineCourse(String courseName, String courseCode, int credits, String platform) {
        super(courseName, courseCode, credits);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
    }
}
