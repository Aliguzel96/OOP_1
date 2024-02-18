package org.example;

import java.util.ArrayList;

public class AdministrativeStaff extends Staff{
    private String department;
    private String position;
    private Integer tenure;
    private ArrayList<String> tasks;

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    public void manageDepartment() {
        for(String task : tasks) {
            System.out.println("- " + task);
        }

    }

    public void createPersonnelReport() {
        System.out.println("Personnel Report Created!");
    }

}
