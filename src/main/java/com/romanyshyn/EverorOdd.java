package com.romanyshyn;

import java.util.Scanner;

public class EverorOdd {

    //Write a program that check if a number even or odd by using switch
    //case

    public static void main(String[] args) {

        System.out.println(" Write down numbres from 1 to 10 ... ");
        Scanner sr = new Scanner(System.in);


         int numforchecking;

         numforchecking = sr.nextInt();



        switch ( numforchecking % 2) {

            case 0 :
                System.out.println(numforchecking + " Is even number");
                break;
            default:
                System.out.println(numforchecking + " is odd number ");
                break;






        }
    }
}
