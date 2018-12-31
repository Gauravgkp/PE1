/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class reads an unspecified number of integer arguments using Scanner 
 * Class and adds them together.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Sum {

    /* It is main function to read input from user and then find the sum of the input. */
    public static void main(String [] args){
	System.out.println("Enter as many number as needed and end it with a");
        Scanner input = new Scanner(System.in);

	/*Reads the different input from the user. */
        int n;

	/*Stores the sum of all the input number. */
        int sum = 0;
        while ((n = input.nextInt()) != a ) {
            sum = sum + n;
        }

	/*Print the sum of the input number */
        System.out.println(sum + " is the sum of input no.");
        return;
    }
}
