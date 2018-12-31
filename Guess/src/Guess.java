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
public class Guess {

    /* It has a main function implementing all the use case */
    public static void main(String [] args){

        int numberGuessed = 40;         /* Number to be guessed is set in this variable. */
        boolean guessed = true;         /* Variable to keep a check till right number is guessed. */

        /* This while loop will take input from user till correct number is guessed. */
        while(guessed) {
            System.out.println("Kindly Guess the number");
            Scanner scan = new Scanner(System.in);

            /* To read the integer number entered by user. */
            int number = scan.nextInt();

            /* Check whether user entered number is greater, less or equal to the number to be guessed*/
            if(number > numberGuessed){
                System.out.println("Number guessed is more than original number");
            }else if (number < numberGuessed) {
                System.out.println("Number guessed is less than original number");
            }else{
                System.out.println("Number guessed matches the original number");

                /* Exit the user from guessing the number once it is correct guessed*/
                guessed = false;
            }
        }
        return;
    }
}
