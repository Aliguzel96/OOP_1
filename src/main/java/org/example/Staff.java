package org.example;

import java.time.LocalDate;
import java.time.Period;

public abstract class Staff implements StaffInterface{
    private String name;
    private String surName;
    private double identificationNum;
    private LocalDate birthDate;
    private String gender;
    private LocalDate startingTime;

    public LocalDate getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalDate startingTime) {
        this.startingTime = startingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getIdentificationNum() {
        return identificationNum;
    }

    public void setIdentificationNum(double identificationNum) {
        this.identificationNum = identificationNum;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int calculateAge() {

        LocalDate today = LocalDate.now();
        Period difference = Period.between(birthDate, today);
        return difference.getYears();
    }

    public int calculateWorkingTime() {

        LocalDate today = LocalDate.now();
        Period difference = Period.between(startingTime, today);
        return difference.getYears();
    }

}
