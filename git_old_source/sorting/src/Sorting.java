/*
 * Gaurav Singh,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take input from user and then sort it in non-increasing order. It then finds  the sum of even number
 * and checks whether the sum is greater the 15 or less then.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Gaurav Singh
 */
public class Sorting {

    /* This is a bubble sort function to sort the number in non-increasing format. */
    public static void bubbleSort(int arr[])
    {
	/* Stores the lenght of array */
        int n = arr.length;

	/* Stores the sum of even number in the array. */
        int sum = 0;

	/* Loop to do the bubble sorting by comparing the two adjacent number and swapping it. */
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    /* swap arr[j+1] and arr[i] */
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.print("Sorted number in non-increasing order : ");

	/* Loop to print the sorted number and find the sum of even digits. */
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println();
        System.out.println(" Sum of even numbers : " + sum);

	/* Checks sum is greater then or less then 15 */ 
        if(sum > 15){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    /* Main function will read the user input and then call the bubbleSort function*/
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);

	/* Read the user input number series. */
        int num = scan.nextInt();
	
	/*Calculate the number of digit in the input number by type casting to string 
         * and finding its lenght through lenght function.
	 */
        int count = Integer.toString(num).length();

	/* Array to store the digits of number */
        int arrayNum [];
        arrayNum = new int[count];

	/*Loop to fill the array with the digits of input number. */
        for(int i=0;i<count;i++){
            arrayNum[i] = num % 10;
            num = num/10;
        }

	/*bubbleSort function to implement the sorting, find even digit sum and check the value. */
        bubbleSort(arrayNum);
        return;
    }
}
