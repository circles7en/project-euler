package com.circle.euler4;

/**
 * Created by CircleS7en on 6/14/2014.
 */

public class Euler4 {
    private static final int CAP = 999;

    public static void main( String[] args ) {
        int largestPalindrome = findLargestPalindrome();
        System.out.println( "Result: " + largestPalindrome );
    }

    private static int findLargestPalindrome() {
        int currentTopPalindrome = 0;
        int product = 0;

        for( int i = CAP; i > 0; i-- ) {
            for( int y = i; y > 0; y-- ) {
                product = i * y;

                if( isPalindrome( product ) && product > currentTopPalindrome ) {
                    currentTopPalindrome = product;
                    break;
                }
            }
        }

        return currentTopPalindrome;
    }

    private static boolean isPalindrome( int number ) {
        boolean isPalindrome = false;

        String numberAsString = Integer.toString( number );
        String reverseString = new StringBuilder( numberAsString ).reverse().toString();

        if( reverseString.equals( numberAsString ) )
            isPalindrome = true;
        else
            isPalindrome = false;

        return isPalindrome;
    }
}
