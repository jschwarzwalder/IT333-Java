package edu.greenriver.it.fibonacci;

import java.util.Arrays;


/*
 * Jami Schwarzwalder
 * 3/27/2016
 * Fibonacci.java
 * Exercises - Introduction
 * 2a. The fibonacci sequence is a series of numbers with the following pattern:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Notice that each term after the first two terms is the sum of the last two terms visited in the sequence.
 * Each of the numbers in the sequence is given an index, starting at zero. So fib(0) = 0, fib(1) = 1, fib(2) = 1, ...
 *
 * This sequence shows up nature and science in surprising areas, including data structure design!
 * You can read more about the sequence here (wiki article (Links to an external site.)).
 * Write a function that returns an array of the first n fibonacci numbers.
 * (ie. the input to the function should be an integer n,
 * and the output should be an array of integers of size n that contains the first n numbers in the fibonacci sequence).
 *
 * 2b. Write a function that returns the nth fibonacci number (ie. fib(n)).
 * Your function should use iteration and not recursion.
 * We will discuss later how recursion can be a pitfall here.
 * You should also use no more than a few temporary variables.
 * The solution you provide should not use arrays of any other data structure.
 * 
 * 3. See Below
 */

/**
 * This class calculates values in the Fibonacci Sequence
 *
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class Fibonacci {
    public static void main (String[] args ){
        System.out.println(Arrays.toString(fibonacci(0)));
        System.out.println(Arrays.toString(fibonacci(1)));
        System.out.println(fibonacciAt(0));
        System.out.println(Arrays.toString(fibonacci(5)));
        System.out.println(fibonacciAt(4));
        System.out.println(fibonacciAtArray(4));
        System.out.println(Arrays.toString(fibonacci(12)));
        System.out.println(fibonacciAt(11));
        System.out.println(fibonacciAtArray(11));
    }
    
    /**
     * Returns an array of the fibonacci sequence of length num
     *
     * @param num an integer indicating desired length of fibonacci sequence.
     * @return an array of fibonacci numbers length num
     * 
     */
    public static int[] fibonacci (int num){
        //create an int array that is the length of num
        int[] fibonacciSequence = new int[num];

        //if they asked for length of 0 give them an empty array
        if (num == 0){
            return fibonacciSequence;
        }

        //set the first value. It will always be 0
        fibonacciSequence[0] = 0;

        //if they ask for length 1 return the array
        if (num == 1) {
            return fibonacciSequence;
        }

        //n should be greater than 1
        // add second value to sequence
        fibonacciSequence[1] = 1;

        // we already set the first two values
        //now keep adding values until the length is num
        for (int i = 2; i < num; i++){
            //value at index i is the sum of the previous two values
           fibonacciSequence[i] = fibonacciSequence[i-1] +  fibonacciSequence[i-2];
        }

        return fibonacciSequence;
    }
    
    /**
     * Returns a specific value in the fibonacci sequence
     *
     * @param num an integer indicating which value of fibonacci desired.
     * @return the numth value of fibonacci
     * 
     */
    public static int fibonacciAt (int num){
        //Value of fibonacci at length num
        int fib = 0;

        //if they want length 0 return first number
        int fibZero = 0;
        if (num == 0){
           fib = fibZero;
        }

        int fibOne = 1;
         //if they want length 1 return second number
         if (num == 1){
            fib = fibZero;
        }

        //calculate sequence until we reach the nth place of fibonacci if n is greater than 1
        if (num > 1){
            for (int i = 1; i < num; i++){
                fib = fibZero + fibOne;
                fibZero = fibOne;
                fibOne = fib;
             }
        }

        //return the value of fib
        return  fib;
    }

    
    /**
     * Returns a specific value in the fibonacci sequence
     *
     * @param num an integer indicating which value of fibonacci desired.
     * @return value of fibonacci at index num
     * 
     */
    //3. Is it possible to use your solution to (2a) to solve (2b)? Yes
    // If this is not possible, make an argument why.
    // If it is possible, then write the function and argue about why this is a good or bad design.
    public static int fibonacciAtArray (int num){

        //Calculate an array the length requested plus 1
        //so we can have an index n since fibonacci array has index 0
        int[] sequence = fibonacci(num+1);

        return sequence[num];

        //(Bad design) - This takes up more memory since we have to store a continuous array instead of just 3 variables

    }
}