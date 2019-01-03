/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take two input from user. One of them is a String and the other one is 
 * integer value. the output of the call is String value with repetition of last
 * n charcater n times where n is the second input by user. 
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class StringInput {

    /* This is main function.It repeats last n character of the string n number of times. */
    public static void main(String [] args){
        System.out.println("Enter the string");
        Scanner scan = new Scanner(System.in);
	
	/* Scan string input from the user*/
        String input1 = scan.nextLine();
        System.out.println("Enter the number");
        Scanner scannum = new Scanner(System.in);

	/* Scan integer input from the user to repeat the character. */
        int input2 = scannum.nextInt();
        System.out.print(input1);
        for(int i=0; i<input2; i++){
            for(int j=(input1.length()-input2); j<input1.length(); j++){
                System.out.print(input1.charAt(j));
            }
        }
        return;
    }
}
