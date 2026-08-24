package com.java.conditional;

public class ElseIfCond {
    int marks = 50;
    public void calculate(){
        System.out.println("Marks: " + marks);
        if(marks <= 100 && marks >= 90){
            System.out.println("A Grade");
        } else if(marks < 90 && marks >= 70){
            System.out.println("B Grade");
        } else if (marks < 70 && marks >= 50) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
