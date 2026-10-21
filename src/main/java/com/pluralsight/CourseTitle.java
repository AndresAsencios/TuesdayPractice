package com.pluralsight;

public class CourseTitle {
    public static String getCourseCode(String courseTitle) {

        int startIndex = courseTitle.indexOf("(");

        int endIndex = courseTitle.indexOf(")");

        if (startIndex == -1 || endIndex == -1 || endIndex <= startIndex + 1) {
            return "Invalid entry. Please use Course Name (CODE).";
        }

        String courseCode = courseTitle.substring(startIndex + 1, endIndex);
        String courseName = courseTitle.substring(0, startIndex).trim();

        System.out.println("Course Name: " + courseName);

        return courseCode;
    }


}
