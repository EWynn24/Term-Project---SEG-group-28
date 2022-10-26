package com.example.finalproject;

public class Admin {
    public String userName;
    public String passWord;


    public Admin(String userName, String passWord){
        this.userName=userName;
        this.passWord=passWord;

    }

    private Class createClass(String className, int courseCode){
        Class newClass = new Class(className,courseCode);
        return newClass;
    }



    private void deleteClass(Class classToDelete){
        classToDelete=null;
    }
    private void deleteStudent(Student studentToDelete){
        studentToDelete=null;
    }
    private void deleteInstructor(Instructor instructorToDelete){
        instructorToDelete=null;
    }






}
