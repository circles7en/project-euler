package com.circle.euler7;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler7 {
    private static final int DIMENSION = 1000;
    private static final int PRIME_TO_FIND = 10001;
    private static boolean[][] sieve;

    public static void main( String[] args ) {
        generateMatrix();
        sieveIt();
        ArrayList<Integer> allPrimes = getPrimesFromSieve();

        int result = allPrimes.size();
        if( result < PRIME_TO_FIND )
            System.out.println( "Not big enough! There are only " + result + " primes in the list." );
        else
            System.out.println( "Result: " + allPrimes.get( PRIME_TO_FIND - 1 ) );
    }

    private static void generateMatrix() {
        sieve = new boolean[ DIMENSION ][ DIMENSION ];

        for( int i = 0; i < DIMENSION; i++ ) {
            for( int y = 0; y < DIMENSION; y++ ) {
                sieve[i][y] = true;
            }
        }

        sieve[0][0] = false;
    }

    private static void sieveIt() {
        for( int y = 0; y < DIMENSION; y++ ) {
            for( int x = 0; x < DIMENSION; x++ ) {
                if( sieve[x][y] ) {
                    int currentPrime = getValueFromDimension( x, y );

                    // Mark the multiples as false, leave the current value as true
                    int currentMultiple = 2;
                    int markValue = currentPrime * currentMultiple;
                    while( markValue < DIMENSION * DIMENSION ) {
                        Point matrixDimension = getDimensionalPosition( markValue );
                        sieve[ (int)matrixDimension.getX() ][ (int)matrixDimension.getY() ] = false;

                        currentMultiple++;
                        markValue = currentPrime * currentMultiple;
                    }
                }
            }
        }
    }

    private static int getValueFromDimension( int x, int y ) {
        int value = ( y * DIMENSION ) + x + 1;
        return value;
    }

    private static Point getDimensionalPosition( int value ) {
        Point point = new Point();

        value--;
        int y = value / DIMENSION;
        int x = value % DIMENSION;

        point.setLocation( x, y );

        return point;
    }

    private static ArrayList<Integer> getPrimesFromSieve() {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for( int y = 0; y < DIMENSION; y++ ) {
            for( int x = 0; x < DIMENSION; x++ ) {
                if( sieve[x][y] )
                    primes.add( getValueFromDimension( x, y ) );
            }
        }

        return primes;
    }
}
