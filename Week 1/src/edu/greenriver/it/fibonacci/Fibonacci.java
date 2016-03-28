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

    private static int fibonacciAt (int n){
        //Value of fibonacci at length n
        int fib = 0;

        //if they want length 0 return first number
        int fibZero = 0;
        if (n== 0){
           fib = fibZero;
        }

        int fibOne = 1;
         //if they want length 1 return second number
         if (n == 1){
            fib = fibZero;
        }

        //calculate sequence until we reach the nth place of fibonacci if n is greater than 1
        if (n > 1){
            for (int i = 1; i < n; i++){
                fib = fibZero + fibOne;
                fibZero = fibOne;
                fibOne = fib;
             }
        }

        //return the value of fib
        return  fib;
    }

    private static int fibonacciAtArray (int n){

        //Calculate an array the length requested plus 1
        //so we can have an index n since fibonacci array has index 0
        int[] sequence = fibonacci(n+1);

        return sequence[n];

        //this takes up more memory since we have to store a continuous array instead of just 3 variables

    }
}
