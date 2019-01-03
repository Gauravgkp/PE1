package com.boeing.PE1;/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class allow the user to guess the number and suggest whether the guessed number is
 * greater than or less then the supposed number.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class TomJerry {

    /*This fucntion checks whether the input number is odd or even and in 20 to 30 range. */
    public static String oddEven(int number) {

    String oddEven ="";
	/* Checks the input is valid and in range 20 to 30 */
	if(number > 30 && number < 20){
	  System.out.println("Wrong input. Please enter between 30 and 20");
	}
	
	/* Checks if number is even or odd. */
        if (number % 2 == 0) {
            if (number < 30 && number > 20) {
                System.out.println("Jerry");
                oddEven = "Jerry";
            }
        } else {
            if (number < 30 && number > 20) {
                System.out.println("Tom");
                oddEven = "Tom";
            }
        }
        return oddEven;
    }

	/* This is main function. It reads user input and call oddEven function. */
        public static void main (String[]args){
            System.out.println("Enter any number between 20 and 30");
            Scanner scan = new Scanner(System.in);
	    /* Read input from the user. */
            int number = scan.nextInt();
            String oddEven = oddEven(number);
        }
    }
