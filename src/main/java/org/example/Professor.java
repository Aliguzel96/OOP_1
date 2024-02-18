package org.example;

public class Professor extends Faculty{

    private String profession;
    private Integer publicationNumber;
    private Integer advisedStudentNumber;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(Integer publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public Integer getAdvisedStudentNumber() {
        return advisedStudentNumber;
    }

    public void setAdvisedStudentNumber(Integer advisedStudentNumber) {
        this.advisedStudentNumber = advisedStudentNumber;
    }

    public void addPublication() {

    }

    public void consult() {

    }
}
