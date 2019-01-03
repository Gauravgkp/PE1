/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * This class find whether the entered number is palindrome or not. If it is palindrome then it
 * add all its even number and check whether the sum of even number is greater then 25.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Palindrome {

    /* This function find whether the input number is palindrome or not. */
    public static boolean palindrome (int num){
	
	/* It stores the copy of input number. */
        int newNum = num;

	/* It stores the new number generated after reversing the number */
        int palin = 0;

	/* It stores the last digit of the input number */
        int lastNum = 0;

	/* This loop will generate the reverse of input number. */
        while (newNum>1) {
            lastNum = newNum % 10;
            newNum = newNum / 10;
            palin = palin*10 + lastNum;
        }

	/* It checks whether the reserve number and the input number is equal. */
        if (palin == num) {
            return true;		//Set that input is palindrome.
        }else{
            return false;		//Set that input is not a palindrome.
        }
    }

    /* This function find the sum of all the even number in the input.*/
    public static int sum (int num){

	/* It stores the sum of the even digit in input.*/
        int sum = 0;
	
	/* It stores the last digit of the input number. */
        int digit = 0;
        while(num>1){
           digit = num % 10;
           num = num / 10;
           if(digit % 2 == 0){
               sum = sum + digit;
           }
        }
        return sum;		//returns the sum of all the even digit in input number.
    }

    /* This is main function which will call the palindrome and sum function. */
    public static void main(String[] args) {
	
	/* Stores the sum of even digit if number is palindrome. */
        int sum = 0;

        /*enter any number to check whether palindrome*/
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
	
	/* read the integer from the user. */
        int num = scan.nextInt();

	/* Set whether number is palindrome of not.*/
        boolean palin = palindrome(num);

	/* If number is palindrome finds the sum of even digit. */
        if(palin){
            System.out.print(num + " is a palindrome number");
            sum = sum (num);

	    /* Checks is the sum of even digit greater then 25 or less then. */
            if (sum>25){
                System.out.println(" and sum of even number is greater than 25");
            }else{
                System.out.println(" and sum of even number is less than 25");
            }
        }else{
            System.out.println(num + " is not a palindrome number");		// Print number is not palindrome.
        }
    }
}
