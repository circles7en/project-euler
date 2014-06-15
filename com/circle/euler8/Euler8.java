package com.circle.euler8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Euler8 {
    private static final String FILE = "V:\\CircleS7en\\IdeaProjects\\Euler\\src\\com\\circle\\euler8\\hugeNumber";
    private static final int WIDTH = 13;
    private static BufferedReader reader;

    public static void main( String[] args ) {
        String inputAsString = getNumberStringFromFile();

        if( inputAsString.equals( "" ) ) {
            System.out.println( "Input Empty: Check File!" );
            System.exit(0);
        }

        long largestProduct = getLargestProduct( inputAsString );
        System.out.println( "Result: " + largestProduct );
    }

    private static String getNumberStringFromFile() {
        String currentLine;
        String inputNumber = "";

        try {
            reader = new BufferedReader( new FileReader( FILE ) );

            while( ( currentLine = reader.readLine() ) != null ) {
                inputNumber += currentLine;
            }

        } catch( IOException e ) {
            e.printStackTrace();
        }

        return inputNumber;
    }

    private static long getLargestProduct( String input ) {
        long currentProduct;
        long largestProduct = 0;

        char[] charNumber = input.toCharArray();

        for( int i = 0; i < ( charNumber.length - WIDTH + 1 ); i++ ) {
            int startingInt = Character.getNumericValue( charNumber[i] );
            currentProduct = startingInt;
            for( int y = 1; y < WIDTH; y++ ) {
                currentProduct = currentProduct * Character.getNumericValue( charNumber[ i + y ] );
            }

            if( currentProduct > largestProduct )
                largestProduct = currentProduct;
        }

        return largestProduct;
    }

}
