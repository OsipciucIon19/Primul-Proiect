package com.company;

import java.awt.geom.NoninvertibleTransformException;

public class Main {

    static void myMethod() {
        System.out.println("I just got executed!");
    }


    public static void main(String[] args) {

        for (int i =0; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        String[] user = {"Ion", "Cezar", "Alex"};

        for (String i: user) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        double[] media = {1.345D,3.56D,5.89D};

        for (double d: media) {
            System.out.println(d);
        }

        int aa = 9;
        long bb = 5L;

        aa = (int) bb;

        System.out.println("----------------------------");

        int[] arr = {0,1,23,5,6};

        try{
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The 'try-catch' is finished");
        }

        System.out.println("----------------------------");

        myMethod();
    }

}
