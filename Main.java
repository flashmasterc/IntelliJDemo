package com.learning;

public class AnotherClass {

    public static void main(String[] args) {
	    //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte  has a width of 6
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByte = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has width of 64
        long myLongValue = 100000000L;

        byte chrisByte = -128;
        short chrisShort = 30_000;
        int chrisInt = 96_000;
        int chrisSum = (chrisByte + chrisShort + chrisInt) * 10;
        long chrisLong = 50_000 + 10 * (chrisByte + chrisShort + chrisInt);

        System.out.println(chrisLong);



    }
}
