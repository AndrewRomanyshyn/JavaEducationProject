package com.romanyshyn;

public class ArrayMinandMax {
    public static void main(String[] args) {
        int array[] = {35,45,21,3,46,5235,24,1,2,99};
        int minValue = array[0];// number 35
        int maxValue = array[0];//number 35

        for (int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        for (int c = 1; c < array.length; c++){
            if (array[c] > maxValue){
                maxValue = array[c];
            }
        }
        System.out.println("min value of array is: " + minValue );
        System.out.println("max value of array is: " + maxValue);
    }
}
