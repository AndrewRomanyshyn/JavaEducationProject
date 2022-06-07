package com.romanyshyn;

public class PowerofNumber {
        public static void main(String[] args) {
            int base = 3;
            int exponent = 10;
            int rezult = 1;
            while(exponent>0){
                rezult = rezult * base;
                exponent --;}
            System.out.println(rezult);
        }
    }
