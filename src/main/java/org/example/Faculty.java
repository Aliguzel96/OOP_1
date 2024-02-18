package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Faculty extends Staff{

    private String department;
    private String licenceDegree;
    private ArrayList<String> academicSuccesses;
    private HashMap<String, String> syllabus;

    public HashMap<String, String> getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(HashMap<String, String> syllabus) {
        this.syllabus = syllabus;
    }

    public ArrayList<String> getAcademicSuccesses() {
        return academicSuccesses;
    }

    public void setAcademicSuccesses(ArrayList<String> academicSuccesses) {
        this.academicSuccesses = academicSuccesses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLicenceDegree() {
        return licenceDegree;
    }

    public void setLicenceDegree(String licenceDegree) {
        this.licenceDegree = licenceDegree;
    }

    public void showAcademicSuccess() {

        for(String success : academicSuccesses)
        {
            System.out.println(success);
        }
    }

    public void createSyllabus() {

        for(String lesson : syllabus.keySet()) {
            String hour = syllabus.get(lesson);
            System.out.println("- " + lesson + ": " + hour);
        }
    }
}
