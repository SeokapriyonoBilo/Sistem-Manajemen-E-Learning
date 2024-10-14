/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elearning;

/**
 *
 * @author Slimbook 14 R5
 */
import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ELearning {
    private static final ArrayList<Course> courseList = new ArrayList<>();
    private static final ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("Sistem Manajemen E-Learning");
                System.out.println("1. Tambah Kursus");
                System.out.println("2. Tambah Mahasiswa");
                System.out.println("3. Tampilkan Semua Kursus");
                System.out.println("4. Tampilkan Semua Mahasiswa");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Masukkan Nama Kursus: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Masukkan Kode Kursus: ");
                        String courseCode = scanner.nextLine();
                        System.out.print("Masukkan Jumlah Kredit: ");
                        int credits = scanner.nextInt();
                        System.out.print("Online atau Onsite? (o/s): ");
                        scanner.nextLine(); // Clear buffer
                        String type = scanner.nextLine();
                        
                        if (type.equals("o")) {
                            System.out.print("Platform: ");
                            String platform = scanner.nextLine();
                            courseList.add(new OnlineCourse(courseName, courseCode, credits, platform));
                        } else {
                            System.out.print("Classroom: ");
                            String classroom = scanner.nextLine();
                            courseList.add(new OnsiteCourse(courseName, courseCode, credits, classroom));
                        }
                    }
                        
                    case 2 -> {
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        String studentName = scanner.nextLine();
                        System.out.print("Masukkan ID Mahasiswa: ");
                        String studentID = scanner.nextLine();
                        System.out.print("Masukkan Jurusan: ");
                        String major = scanner.nextLine();
                        System.out.print("Undergraduate atau Graduate? (u/g): ");
                        String type = scanner.nextLine();
                        
                        if (type.equals("u")) {
                            System.out.print("Minor: ");
                            String minor = scanner.nextLine();
                            studentList.add(new UndergraduateStudent(studentName, studentID, major, minor));
                        } else {
                            System.out.print("Judul Tesis: ");
                            String thesisTitle = scanner.nextLine();
                            studentList.add(new GraduateStudent(studentName, studentID, major, thesisTitle));
                        }
                    }
                        
                    case 3 -> {
                        System.out.println("Daftar Kursus:");
                        for (Course course : courseList) {
                            course.displayCourseInfo();
                            System.out.println("----------------------");
                        }
                    }
                        
                    case 4 -> {
                        System.out.println("Daftar Mahasiswa:");
                        for (Student student : studentList) {
                            student.displayStudentInfo();
                            System.out.println("----------------------");
                        }
                    }
                        
                    case 5 -> System.out.println("Keluar dari sistem.");
                        
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (choice != 5);
        }
    }
}