package edu.greenriver.it.fibonacci;

import java.util.Arrays;

/**
 * Created by Jami on 3/28/2016.
 */
public class Fibonacci {
    public static void main (String[] args ){
        System.out.println(Arrays.toString(fibonacci(0)));
        System.out.println(Arrays.toString(fibonacci(1)));
        System.out.println(Arrays.toString(fibonacci(5)));
        System.out.println(Arrays.toString(fibonacci(12)));
    }

    private static int[] fibonacci (int n){
        //create an int array that is the length of n
        int[] fibonacciSequence = new int[n];

        //if they asked for length of 0 give them an empty array
        if (n== 0){
            return fibonacciSequence;
        }

        //set the first value. It will always be 0
        fibonacciSequence[0] = 0;

        //if they ask for length 1 return the array
        if (n == 1) {
            return fibonacciSequence;
        }

        //n should be greater than 1
        // add second value to sequence
        fibonacciSequence[1] = 1;

        // we already set the first two values
        //now keep adding values until the length is n
        for (int i = 2; i < n; i++){
            //value at index i is the sum of the previous two values
           fibonacciSequence[i] = fibonacciSequence[i-1] +  fibonacciSequence[i-2];
        }

        return fibonacciSequence;
    }
}
