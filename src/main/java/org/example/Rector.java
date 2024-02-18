package org.example;

import java.util.Date;

public class Rector extends AdministrativeStaff{

    private Date joiningDate;
    private boolean authorityToDetermineVisionAndMission;
    private boolean authorityToCreateStrategicPlan;

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public boolean isAuthorityToDetermineVisionAndMission() {
        return authorityToDetermineVisionAndMission;
    }

    public void setAuthorityToDetermineVisionAndMission(boolean authorityToDetermineVisionAndMission) {
        this.authorityToDetermineVisionAndMission = authorityToDetermineVisionAndMission;
    }

    public boolean isAuthorityToCreateStrategicPlan() {
        return authorityToCreateStrategicPlan;
    }

    public void setAuthorityToCreateStrategicPlan(boolean authorityToCreateStrategicPlan) {
        this.authorityToCreateStrategicPlan = authorityToCreateStrategicPlan;
    }

    public void manageUniversity(){

    }

    public void createStrategicPlan(){

    }
}
