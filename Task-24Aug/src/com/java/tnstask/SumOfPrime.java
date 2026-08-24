package com.java.tnstask;

public class SumOfPrime {
    public  static void main(String argos[]){
        int n = 10;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println("Sum of Prime Numbers: " + sum);
    }
    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }

        return true;
    }
}

