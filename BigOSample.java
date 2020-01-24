/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author int320
 */
public class BigOSample {

    private static int N = 1000000;
    private static Random r = new Random();

    private static void initial(Integer[] a1) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt(N);
        }
    }

    public static void main(String[] args) {
        Integer[] a1 = new Integer[N];
        Integer[] a2 = new Integer[N];
        Integer[] a3 = new Integer[N];
        Integer[] a4 = new Integer[N];
        initial(a1);
        System.arraycopy(a1, 0, a2, 0, a1.length);
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a1, 0, a4, 0, a1.length);

        long begin;
        long end;
        long cal;

        begin = System.currentTimeMillis();
        Arrays.sort(a2);
        end = System.currentTimeMillis();
        cal = end - begin;
        System.out.println("TIME FOR ARRAY SORT : " + cal);

        begin = System.currentTimeMillis();
        bubbleSort(a2);
        end = System.currentTimeMillis();
        cal = end - begin;
        System.out.println("TIME FOR BUBBLE SORT : " + cal);
    }

    static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

}
