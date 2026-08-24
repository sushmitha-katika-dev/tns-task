package com.java.tnstask;

class CheckPalindrome{
    public  static void main(String argos[]){
        int n = 32123;
        int temp = 32123;
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if(rev == temp){
            System.out.println(n + "is Palindrome");
        } else{
            System.out.println(n + "is Not Palindrome");
        }
    }
}
