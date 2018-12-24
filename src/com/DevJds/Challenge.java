package com.DevJds;

public class Challenge {
    public static  void main(String []args){
        //1.Create A Byte Variable and set it to any valid byte Number.
        byte myValidByte = 10 ;
        //2.Create A short Variable and ser it to any valid short Number.
        short myValidShort = 1;
        //3.Create a ibt Variable and set it to any valid int number.
        int myValidInt = 10000;
        //4.Create a variable of type Long, and make it equal to
        //  50000 + 10 times the sum of the byte, plus the short plus the int
        long myLong = 50000 + 10 *  (myValidByte + myValidShort + myValidInt) ;

        System.out.println("long Total = " + myLong);

    }


}