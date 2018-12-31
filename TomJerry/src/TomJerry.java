/*
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
    public static void oddEven(int number) {
	if(number < 30 && number > 20){
	  System.out.println("Wrong input. Please enter between 30 and 20");
	}
        if (number % 2 == 0) {
            if (number < 30 && number > 20) {
                System.out.println("Jerry");
            }
        } else {
            if (number < 30 && number > 20) {
                System.out.println("Tom");
            }
        }
    }
        public static void main (String[]args){
            System.out.println("Enter any number between 20 and 30");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            oddEven(number);
        }
    }
