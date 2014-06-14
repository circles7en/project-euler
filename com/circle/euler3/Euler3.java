package com.circle.euler3;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler3 {
    private static final long CAP = 600851475143L;

    public static void main( String[] args ) {
        System.out.println( "Result: " + gpf( CAP ) );
    }

    private static long gpf( long value ) {
        long factor = 2;
        long lastFactor = 1;

        while( value > 1 ) {
            if( value % factor == 0 ) {
                lastFactor = factor;
                value = value / factor;
                while( value % factor == 0 ) {
                    value = value / factor;
                }
            }

            factor++;
        }

        return lastFactor;
    }

}
