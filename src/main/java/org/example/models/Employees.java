package org.example.models;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employees {
    Employer[] employers;
    int length;

    public Employees(String filename) {

        File file = new File(filename);

        try {
            Scanner in = new Scanner(file);
            length = Integer.parseInt(in.nextLine());
            this.employers = new Employer[length];

            for (int i = 0; i < length; i++) {
                employers[i] = new Employer(in.nextLine());
            }

            Arrays.sort(employers, Comparator.comparing(Employer::getFirstCompany));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printEmployers() {
        for (int i = 0; i < length; i++) {
            System.out.println(employers[i]);
        }
    }
}
