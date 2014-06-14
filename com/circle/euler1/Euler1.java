package com.circle.euler1;

import java.util.ArrayList;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler1 {
    private static final int[] MULTIPLES = { 3, 5 };
    private static final int CAP = 1000;

    public static void main( String[] args ) {
        int total = 0;

        for( int i = 0; i < CAP; i++ ) {
            for( int y = 0; y < MULTIPLES.length; y++ ) {
                if( i % MULTIPLES[y] == 0 ) {
                    total += i;
                    break;
                }
            }
        }

        System.out.println( "Result: " + total );
    }
}
