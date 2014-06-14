package com.circle.math;

/**
 * Created by CircleS7en on 6/14/2014.
 */
public class Functions {
    //Basic Constructor
    public Functions() { }

    //Least common multiple
    public int LCM(int i1, int i2) {
        return abs(i1 * i2) / GCD(i1,i2);
    }

    //Greatest Common Divisor
    //Euclidean Algorithm
    public int GCD(int i1, int i2) {
        int small, big;
        if(i1 >= i2) {
            big = i1;
            small = i2;
        } else {
            big = i2;
            small = i1;
        }
        if(big % small == 0)
            return small;
        else
            return GCD(small, (big % small));
    }


    //Factorial
    public int factorial(int i) {
        if(i < 0)
            //throw custom exception
            return -1;
        else if(i == 0)
            return 1;
        else
            return i * factorial(i-1);
    }

    //Absolute value
    public int abs(int i) {
        if(i < 0)
            return (-1 * i);
        else
            return i;
    }

}
