package com.boeing.PE1;/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class check whether the entered character is alphabet (Lower or Capital),
 * a digit (0-9) or a especial character.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Char {

   /* This function checks whether the input data is Alphabet, digit or especial Character. */
   public static String charCase(char Char)
    {
        String data;
        if (Char >= 65 && Char <= 90){					// Check Capital Letter
            data = " is a Capital Alphabet ";
        }else if(Char >= 97 && Char <= 122) {				// Check Small Letter
            data = " is a Small Alphabet ";
        }else if (Char >= 48 && Char <= 57) {				// Check Digit
            data = " is a Digit ";
        }else {								// Check Especial Character
            data = " is a Special Character ";
        }
        return data;
    }

    /* This is main function and it calls the Char function. */	
    public static void main (String[] args)
    {
       System.out.println("Enter any character");
       Scanner scan = new Scanner(System.in);
	/* Read the user input Char value in Char varibale*/
       char Char = scan.next().charAt(0);
        String data = charCase(Char);
        System.out.println(Char + data);
    }
}
