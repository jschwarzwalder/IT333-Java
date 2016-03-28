package edu.greenriver.it.randomsort;

import java.util.Arrays;

/*
* Jami Schwarzwalder
* 3/27/2016
* Fibonacci.java
* Exercises - Introduction
* Writing algorithms is all about finding strategies for solving a problem.
* Suppose you were given the problem of sorting an array of n random integers.
* One strategy for sorting is described below:
*
* Assume that each of the random integers is within the range 0 to k, where k is a positive integer.
* (ie. you could assume the array only has integers from 1-20)
*
* Create a temporary array of size k + 1. Set temp[index] = 0 for each element in the array.
*
* Loop over each element in your input array. Let m be the current element. Increment temp[m] by one.
* For example, if we see m three times in our input array during this loop then temp[m] will be 3.
*
* Lastly, loop over your temporary array to print your results in sorted order.
* For each m = temp[index], print index m times.
* (ie. if temp[2] = 4, then print 2, 2, 2, 2 as part of your sorted output).
*
*/
public class RandomSort {

    public static void main(String[] args) {

        randomSort(new int[]{}, 0);
        randomSort(new int[]{0, 1, 1, 0, 0}, -5);
        randomSort(new int[]{0, 1, 1, 0, 0}, 1);
        randomSort(new int[]{0, 1, 1, 2, 3}, 3);
        randomSort(new int[]{9, 0, 7, 6, 5, 4, 3, 2, 1}, 9);
        randomSort(new int[]{7, 2, 9, 0, 1, 2, 0, 9, 7, 4, 4, 6, 9, 1, 0, 9, 3, 2, 5, 9}, 9);
    }

    public static void randomSort(int[] numbers, int k) {

        //make an array of k+1 if k is a non negative number
        if (k >= 0) {
            int[] temp = new int[k + 1];
            //Java already sets every value equal to 0
            // System.out.println(Arrays.toString(temp));

            //look at current element (m) and increase value at that index by 1
            for (int i = 0; i < numbers.length; i++) {
                int m = numbers[i];
                temp[m] += 1;
            }

            //print values based on how many of each integer was in original array.
            System.out.print("[");
            for (int i = 0; i <= k; i++) {
                if (temp[i] > 0) {
                    for (int j = 0; j < temp[i]; j++) {
                        System.out.print(i);
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("]\n");

        }
    }
}
