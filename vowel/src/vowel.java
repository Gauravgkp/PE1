/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class allow the user check the alphabet is vowel or consonant.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class vowel {

    /*This functions take input as string and check its each letter whether
     * is vowel, consonant or not a letter. 
     */
    public static void vowel(String word){
        for(int i=0; i<= word.length(); i++ ){

	    /* take the char at position i */
            char c = word.charAt( i );
            if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
                if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c =='o'
                        || c=='O' || c == 'u' || c == 'U'){
                    System.out.println (c + " is a vowel");
                }else{
                    System.out.println (c + " is a consonant");
                }
            }else{
                System.out.println ("This is not a letter");
            }
        }
        return;
    }

    /*This is main function. It takes user input and call the vowel function. */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        vowel (word);
        return;
    }
}
