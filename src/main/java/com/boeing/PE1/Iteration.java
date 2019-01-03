package com.boeing.PE1;/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take an integer value and generate a series upto the entered value by
 * by repeating the number as many times as the number itself represents. 
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Iteration {

    /* This function repeat a number n number of times as the number represent. */
    public static boolean iteration(int times){
        for(int i=1; i<=times; i++){
            for(int j=1; j<=i; j++){
                /* Print the number as many times as the number value is. */
                System.out.print(i+" ");
            }
        }
        return true;
    }

    /* This is main function which calls the iteration function and pass the user input. */
    public static void main(String [] args){
        System.out.println("Enter number of iteration");
        Scanner scan = new Scanner(System.in);
        /* Scan the input from user for number of iteration*/
        int times = scan.nextInt();
        boolean pass = iteration(times);	//Call the iteration function.
        return;
    }
}
