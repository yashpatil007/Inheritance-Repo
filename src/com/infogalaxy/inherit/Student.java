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
class Internal extends Student {
    int im1 ;
    int im2 ;
    void getInternal() {
        System.out.println("Internal Marks : ");
        im1 = scanner.nextInt();
        im2 = scanner.nextInt();
    }
}
