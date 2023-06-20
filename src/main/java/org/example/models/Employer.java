package org.example.models;

import java.io.File;

public class Employer {

    int id;
    String firstName;
    String lastName;
    String firstCompany;
    int age;
    String firstCompanyStartDate;
    String firstCompanyLastDate;
    String secondCompany;
    String secondCompanyStartDate;
    String secondCompanyLastDate;


    public Employer(String line) {

        String[] elements = line.split("\\;");

        this.id = Integer.parseInt(elements[0]);
        this.firstName = elements[1];
        this.lastName = elements[2];
        this.age = Integer.parseInt(elements[3]);
        this.firstCompany = elements[4];
        this.firstCompanyStartDate = elements[5];
        this.firstCompanyLastDate = elements[6];
        this.secondCompany = elements[7];
        this.secondCompanyStartDate = elements[8];
        this.secondCompanyLastDate = elements[9];
    }

    public String getFirstCompany() {
        return firstCompany;
    }


    @Override
    public String toString() {
        return "Employer{" +
                "id" + id +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age ='" + age + '\'' +
                ", firstCompany='" + firstCompany + '\'' +
                ", firstCompanyStartDate='" + firstCompanyStartDate + '\'' +
                ", firstCompanyLastDate='" + firstCompanyLastDate + '\'' +
                ", secondCompany='" + secondCompany + '\'' +
                ", secondCompanyStartDate='" + secondCompanyStartDate + '\'' +
                ", secondCompanyLastDate='" + secondCompanyLastDate + '\'' +
                '}';
    }
}
