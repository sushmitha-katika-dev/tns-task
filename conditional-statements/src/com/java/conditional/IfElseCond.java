package com.java.conditional;

public class IfElseCond {
    int age = 15;
    public void eligibility(){
        System.out.println("Age: " + age);
        if(age > 18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
