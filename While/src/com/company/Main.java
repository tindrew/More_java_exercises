package com.company;

public class Main {

    public static void main(String[] args) {
//	int count = 1;
//	while ( count != 6) {
//        System.out.println("count value is " + count);
//        count ++;
//
//        }
//	count = 1;
//	   while (true) {
//	       if(count == 6) {
//	           break;
//           }
//           System.out.println("count value is " + count);
//	       count++;
//       }
//    }
        int number = 4;
        int finishNumber = 20;
        int count = 1;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                count++;
                continue;
            } else if (count >= 5) {
                break;
            }
            System.out.println("Even number " + number);
            System.out.println("The amount of even numbers is " + count);
            number++;
        }





    }
    public static boolean isEvenNumber ( int num){

        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }


    }


}
