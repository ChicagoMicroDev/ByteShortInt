package com.DevJds;

public class Main {

    public static void main(String[] args) {
//        The Minimum Value an Integer can be is
//        Int has a width of 32
        int myMinValue = -214783648;
//        The Maximum Value an Integer can be is
        int myMaxValue = 214783647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);
//                        Any Number to the right of the equal sign is a literal

//        byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
//                             ^^^
//                            Casting
//        Byte is another Data type and can only store a value of -128 to 127
        System.out.println("myNewByteValue = "  + myNewByteValue);

//        short has a width of 16
        short myShortValue = 30000;
//        Short is another Data Type as well and can store values up -32768 to 37767
        short myNewShortValue =  (short)(myShortValue /2);


//        Long has width of 64
        long myLongValue = 100L;

    }
}

