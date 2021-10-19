package org.example;

import java.util.Arrays;

public class homework3 {

    public static void main(String[] args) {
        integerArray();
        emptyIntegerArray();
        arrayLoop();
        arraySquare();
        lenInitialValue();
        minMaxArray();
        oneDimArray();


    }

    public static int[] integerArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] == 0) ? 1 : 0;
            System.out.print(a[i]);
        }
        System.out.println();
        return a;
    }

    public static void emptyIntegerArray() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(Arrays.toString(a));
        }
        System.out.println();
    }

    public static void arrayLoop() {
        int[] a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
            System.out.print(Arrays.toString(a));
        }
        System.out.println();
    }

    public static void arraySquare() {
        int[][] a = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
                if (a[0][2] == 0) {
                    a[0][2] = 1;
                }
                if (a[2][0] == 0) {
                    a[2][0] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lenInitialValue(int len, int initialValue){
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
            System.out.print(a[i]);
        }

    }

    public static void minMaxArray() {
        int[] a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static boolean oneDimArray() {
        int[] a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int right = 0;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            right += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            left += a[i];
            if (left == right - left) {
                return true;
            }
        }
        return false;
    }

}