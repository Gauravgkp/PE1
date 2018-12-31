import java.util.Scanner;

public class TomJerry {
    public static void oddEven(int number) {
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
