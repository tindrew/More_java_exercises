package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for ( int i = 1; i < 1000; i++) {
            if(sum % 3 == 0 || sum % 5 == 0) {
                System.out.println(sum);
            }
            if (sum == 6) {
                System.out.println("breakout");
                break;
            }
            

            sum++;
        }
    }



}

