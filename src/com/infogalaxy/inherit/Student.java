package com.infogalaxy.inherit;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String Name;

    void setStud() {
        System.out.println("Enter the ID No & Name : ");
        id = scanner.nextInt();
        Name = scanner.next();
    }
}
class Show extends Student {
    void getStud() {
        System.out.println("Student ID no : "+id);
        System.out.println("Student Name : "+Name);
    }
}
class Main {
    public static void main(String args[]) {
        Show show = new Show();
        show.setStud();
        show.getStud();
    }
}
