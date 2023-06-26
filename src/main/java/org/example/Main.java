package org.example;


import org.example.models.Employees;


public class Main {

  public static void main (String[] args) {

    // This will work only for Windows OS...
    String filePath = "src\\main\\resources\\Employees.csv";

    Employees e = new Employees(filePath);

    e.printEmployers();

  }
}