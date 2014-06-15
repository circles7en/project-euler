package com.circle.euler6;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler6 {

    public static void main( String[] args ) {
        int difference = squareOfSum( 1, 100 ) - sumSquares( 1, 100 );
        System.out.println( "Result: " + difference );
    }

    private static int sumSquares( int starting, int ending ) {
        int total = 0;

        for( int i = starting; i <= ending; i++ ) {
            total += ( i * i );
        }

        return total;
    }

    private static int squareOfSum( int starting, int ending ) {
        int total = 0;

        for( int i = starting; i <= ending; i++ ) {
            total += i;
        }

        total = total * total;

        return total;
    }
}
