package com.epam;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {


    public void start() {
        System.out.println("Guessing Game Started!");


        Integer random = ThreadLocalRandom.current().nextInt(0, 50 + 1);
        do {
            Integer userNumber = getNumber();
            if (random > userNumber) {
                System.out.println("My number is bigger");
            } else if (random < userNumber) {
                System.out.println("My number is smaller");
            } else if (random == userNumber) {
                System.out.println("You are  winner!!!");
                public void getAnswer();
                boolean userAnswer = getAnswer();
                if (scan1 = true) {start();
                }
                else if (scan1 = false){
                        System.exit(0);
                }



                System.exit(0);
            }
        }while (true);
    }

    public Integer getNumber() {
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public Scanner getAnswer() {
        System.out.println("EPlay more?:");
        Scanner scan1 = new Scanner(System.in);
        return scan1.userAnswer();

        //return boolean();
    }
}