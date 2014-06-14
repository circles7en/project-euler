package com.circle.euler2;

/**
 * Created by CircleS7en on 6/13/2014.
 */
public class EvenFibonacci {
    private static final int FIBONACCI_CAP = 4000000;
    private static int total = 0;

    public static void main( String[] args ) {
        getFibonacciSum( 1, 1 );
        System.out.printf( "The sum of all even integers in the Fibonacci Sequence" +
                " up to %d is:\n\t%d\n", FIBONACCI_CAP, total );
    }

    private static void getFibonacciSum( int fib1, int fib2 ) {
        int fib3 = fib1 + fib2;

        if( fib3 % 2 == 0 )
            total += fib3;

        if( fib3 < FIBONACCI_CAP )
            getFibonacciSum( fib2, fib3 );
    }
}
