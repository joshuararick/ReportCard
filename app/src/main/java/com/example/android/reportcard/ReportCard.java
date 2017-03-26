package com.example.android.reportcard;


import java.util.ArrayList;


/**
 * Created by Joshua on 3/16/17.
 */
public class ReportCard {

    public static void main(String[] args) {
        //ArrayList created to store student data, using contructor studentReportCard
        ArrayList<studentReportCard> StudentReportCards = new ArrayList<studentReportCard>();
        StudentReportCards.add(new studentReportCard("Joshua", "Rarick", "B+", 88.88, "Geometry"));
        StudentReportCards.add(new studentReportCard("Caleb", "Doogle", "B+", 88.67, "History"));

        //Testing setters
        StudentReportCards.get(1).setFirstName("Joshua");
        StudentReportCards.get(0).setLastName("Rarick");
        StudentReportCards.get(0).setPercentage(88.99);
        StudentReportCards.get(0).setGrade("B+");
        StudentReportCards.get(0).setSubject("Biology");
        StudentReportCards.get(1).setSubject("History");

        //Testing Getters
        StudentReportCards.get(1).getGrade();
        StudentReportCards.get(0).getGrade();
        StudentReportCards.get(1).getPercentage();
        StudentReportCards.get(0).getSubject();

        //Testing toString
        StudentReportCards.get(1).toString();
        StudentReportCards.get(0).toString();

    }

}

class studentReportCard {
    final static String School = "Blackhawk HighSchool";
    final static int year = 2010;
    String firstName;//First
    String lastName;
    String grade; // Letter scale from A, B, C, D, F
    Double percentage; // percentage of the corresponding grade
    String subject;

    //Constructor
    public studentReportCard(String firstName, String lastName, String grade,
                             double percentage, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.percentage = percentage;
        this.subject = subject;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {

        //ArrayList created for grading scale
        ArrayList<String> gradeScale = new ArrayList<String>();
        gradeScale.add("A+");
        gradeScale.add("A");
        gradeScale.add("A-");
        gradeScale.add("B+");
        gradeScale.add("B-");
        gradeScale.add("B");
        gradeScale.add("C+");
        gradeScale.add("C-");
        gradeScale.add("C");
        gradeScale.add("D+");
        gradeScale.add("D-");
        gradeScale.add("D");
        gradeScale.add("F");

        //for loop to determine if received parameter is valid with gradingScale
        for (int i = 0; gradeScale.size() > i; i++)
            if (grade.equals(gradeScale.get(i))) {
                this.grade = grade;
                return;
            } else {
                System.out.println(R.string.wrongGrade);
                return;
            }

    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getYear() {
        return year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //prints summary of report card

    //Returns Students Grade overview
    @Override
    public String toString() {
        return "studentReportCard{" +
                "name='" + firstName + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", percentage=" + percentage +
                ", year=" + year +
                ", subject='" + subject + '\'' +
                '}';
    }


}


