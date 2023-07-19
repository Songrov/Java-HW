package com.auto.germany;

public class HWChar {
    public static void main(String[] args) {

// с помощью String.valueOf

        char y = '9';
        int yInt = Integer.parseInt(String.valueOf(y));
        System.out.println(yInt);

        // с помощью Character.getNumericValue

        char u = '9';
        int uInt = Character.getNumericValue(u);
        System.out.println(uInt);








    }
}
