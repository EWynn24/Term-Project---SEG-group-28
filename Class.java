package com.example.finalproject;

import java.util.ArrayList;

public class Class {
    /*
+ className: String
+ courseCode: int
+ courseDays: String
+ courseHours: String
+ capacity: int
+ studentsEnrolled: arrayList[Student]
*/
    public String className;
    public int courseCode;
    public String courseDays;
    public String courseHours;
    public int capacity;
    public ArrayList<Student> studentsEnrolled;
    public Instructor teachingInstructor;

    public Class(String className, int courseCode){
        this.className=className;
        this.courseCode=courseCode;
    }

}
