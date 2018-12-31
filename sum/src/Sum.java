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
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        int n;
        int sum = 0;
        while ((n = input.nextInt()) > 0) {
            sum = sum + n;
        }
        System.out.println(sum + " is the sum of input no.");
        return;
    }
}
