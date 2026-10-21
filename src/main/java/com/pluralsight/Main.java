package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String course1 = "Microsoft Azure Fundamentals (AZ-900)";
        String course2 = "Microsoft Azure Administrator (AZ-104)";

        System.out.println("Welcome to Course Title Splitter!");
        System.out.println("1. " + course1);
        System.out.println("2. " + course2);
        System.out.println("3. Enter your own course");

        System.out.print("Choose an option: ");
        int choice = read.nextInt();
        read.nextLine();

        String courseTitle = "";

        if(choice == 1) {
            courseTitle = course1;
        } else if (choice == 2) {
            courseTitle = course2;
        } else if (choice == 3) {
            System.out.println("Enter your course title: ");
            courseTitle = read.nextLine();
        } else {
            System.out.println("Input Invalid!");
        }

        if(!courseTitle.isEmpty()) {
            String courseCode = CourseTitle.getCourseCode(courseTitle);
            System.out.println("Course Code: " +courseCode);
        }
        read.close();
    }
}