package com.infogalaxy.inherit;

class Result extends Internal {
    double per = 0;
    int total = 0;

    void getResult() {
        total = im1 + im2 ;

        per = total / 2;
    }
    void showResult() {
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+Name);
        System.out.println("Internal Marks 1st : "+im1);
        System.out.println("Internal Mark 2nd : "+im2);
        System.out.println("Student Total Marks : "+total);
        System.out.println("Student Percentage : "+per);
    }
}
class Main {
    public static void main (String args[]) {
        Result result = new Result();
        result.setStud();
        result.getInternal();
        result.getResult();
        result.showResult();
    }
}
