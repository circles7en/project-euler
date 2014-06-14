package com.circle.euler5;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler5 {
    private static final int CAP = 20;

    public static void main( String[] args ) {
        int result = calculateSmallestDivisible();
        System.out.println( "Result: " + result);
    }

    private static int calculateSmallestDivisible() {
        boolean foundIt = false;
        int currentValue = CAP;

        while( !foundIt ) {
            if( isDivisibleByAll( currentValue ) )
                foundIt = true;
            else
                currentValue++;
        }

        return currentValue;
    }

    private static boolean isDivisibleByAll( int value ) {
        boolean isDivisibleByAll = true;

        for( int i = 1; i <= CAP; i++ ) {
            if( value % i != 0 ) {
                isDivisibleByAll = false;
                break;
            }
        }

        return isDivisibleByAll;
    }

}
