package com.boeing.PE1;/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class allow the user print reverse of the input string.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Reserve {

    /* This is main function which will call reverse function to reserve the user string. */
    public static void main(String[] args) {
        System.out.println("Enter any string to get its reverse.");
        Scanner scan = new Scanner(System.in);

        /* Read the user string in input variable */
        String input = scan.nextLine();
        String pass = reverse(input);
    }
	public static String reverse(String input){
	/* Create new StringBuilder object to implement the reserve function.*/
        StringBuilder input1 = new StringBuilder();

        /* append a string into StringBuilder input1 */
        input1.append(input);
        input1 = input1.reverse();		// reverse StringBuilder input1.
        String reverseInput = input1.toString();
        return reverseInput;
    }
}
