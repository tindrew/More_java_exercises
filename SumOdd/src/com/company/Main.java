package com.company;

public class Main {

    public static void main(String[] args) {
	sumOdd(1, 11);
    }


    public static boolean isOdd(int number) {

        if(number <= 0) {
            return false;
        }
        if (number % 2!= 0 ) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumOdd (int start, int end) {

        int sum = 0;
        if((end >= start) && (start>0) && (end > 0) ) {
            for(int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                    System.out.println("Number is odd " + sum);
                }
            }

        } else {
            return -1;
        }

        System.out.println(sum);
        return sum;
    }

}
