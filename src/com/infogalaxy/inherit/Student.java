package com.infogalaxy.inherit;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String Name;

    void getStud() {
        System.out.println("-------------------------");
        System.out.println("Enter the ID No & Name : ");
        id = scanner.nextInt();
        Name = scanner.next();
    }
}
class Internal extends Student {
    int im1;
    int im2;

    void getInternal() {
        System.out.println("Internal Marks : ");
        im1 = scanner.nextInt();
        im2 = scanner.nextInt();
    }
    void setStud() {
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+Name);
        System.out.println("Internal Marks : "+im1);
        System.out.println("Internal Marks : "+im2);
    }
}
class External extends Student {
    int em1 ;
    int em2 ;
    void getExternal() {
        System.out.println("Enter the External Marks : ");
        em1 = scanner.nextInt();
        em2 = scanner.nextInt();
    }
    void setExternal () {
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+Name);
        System.out.println("External Marks : "+em1);
        System.out.println("External Marks : "+em2);
    }
}
class Main {
    public static void main(String[] args) {
        Internal internal = new Internal();
        External external = new External();
        internal.getStud();
        internal.getInternal();
        internal.setStud();
        external.getStud();
        external.getExternal();
        external.setExternal();
    }
}