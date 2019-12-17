package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(4);
        sumDigits(32123);
        sumDigits(-125);
        sumDigits(16549877);

    }

    public static int sumDigits (int number) {
        if(number < 10) {
            System.out.println("negative number");
            return -1;
            }

            int num = 0;
            while (number > 0) {
                num += (number % 10);
                number = number / 10;


        }
        System.out.println(num);
        return num;
    }


}
