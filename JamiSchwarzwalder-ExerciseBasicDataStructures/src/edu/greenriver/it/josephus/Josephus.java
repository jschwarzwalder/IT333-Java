package edu.greenriver.it.josephus;


import java.util.Arrays;
import java.util.LinkedList;


/*
 * Jami Schwarzwalder
 * 4/15/2016
 * Josephus.java
 * Exercises - Basic Data Structures
 *  The Josephus problem is the following game: 
 *  N people, numbered 1 to N, are sitting in a circle. 
 *  Starting at person 1, a hot potato is passed. 
 *  
 *  After M passes, the person holding the hot potato is eliminated, the circle closes ranks, 
 *  and the game continues with the person who was sitting after the eliminated person 
 *  picking up the hot potato. 
 *  
 *  The last remaining person wins. 
 *  Thus, if M = 0 and N = 5, players are eliminated in order, and player 5 wins. 
 *  If M = 1 and N = 5, the order of elimination is 2, 4, 1, 5.
 *  
 * 	Write a program to solve the Josephus problem for general values of M and N. 
 *  Try to make your program as efficient as possible. 
 *  
 *  Big O = 2n or  O(n) it goes through num of players to build the players list
 *  then again removing each player when Potato is passed. 
 *  
 */

/**
 * Solve Josephus Problem
 * return last reaming person
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */

public class Josephus {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(josephus(5,0)));
		System.out.println(Arrays.toString(josephus(1,1)));
		System.out.println(Arrays.toString(josephus(5,1)));
		System.out.println(Arrays.toString(josephus(5,1)));

	}
	
	public static Integer[] josephus(int numPlayers , int potatoPasses ){
		//create a list of players represented by integers
		LinkedList<Integer> players = new LinkedList<Integer>() ;
		for (int i=1; i <= numPlayers; i++){
			players.add(i);
		}
		//create a list to store each player as they are eliminated
		//if you want to include last player remove the -1
		Integer[]  eliminated = new Integer[numPlayers-1] ;
		
		//set value to store which player has been removed
		int removedPlayerIndex = 0;
		
		//move to first player left with potato
		int currentIndex = potatoPasses;
		//go through players and at the end of potatoPasses
		//remove that current player and add them to the eliminated arrayList
		while (players.size() > 1){
					
			//if reached end of list wrap around to begin of list
			currentIndex = currentIndex%players.size();
			
			//remove Player from players and add to eliminated list
			int removedPlayer = players.remove(currentIndex);
			eliminated[removedPlayerIndex] = removedPlayer;
			
			//increase index tracker for eliminated list
			removedPlayerIndex ++;
			
			//pass the potato
			currentIndex += potatoPasses;
		};
		//Optional: uncomment below
		//add the last player standing to the eliminated list before returning
		//eliminated[numPlayers-1] = players.getFirst();
		
		
		return eliminated;
	}

}
