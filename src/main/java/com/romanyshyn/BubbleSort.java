package com.romanyshyn;

public class BubbleSort {
        public static void main(String[] args) {
            int array[] = {445,41,5235,124,125,6654,532,2234,12,52,5,6,72};
            BubbleSort(array);
        }
        public static void BubbleSort(int c[]){
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < c.length - 1; i++) {
                    if (c[i] > c[i + 1]) {
                        int tmp = c[i];
                        c[i] = c[i + 1];
                        c[i + 1] = tmp;
                        isSorted = false;
                    }
                }
            }
            for (int b: c)
                System.out.print(b + " ");
        }
    }
