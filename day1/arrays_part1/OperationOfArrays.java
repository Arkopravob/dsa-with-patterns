package arrays_part1;

import java.util.Arrays;
import java.util.Scanner;

public class OperationOfArrays {
    public static void main(String[] args) {

        //enter the element in this array take input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt(); // n is length of an array
        //length of an arrays
        int arr[] = new int[n];
        //enter element through the for loop
        for(int i = 0 ; i < n ; i++){
            System.out.println("enter the " + i +"th element of this array");
            arr[i] = sc.nextInt();

        }
        //printing the array by for loop
        System.out.println("the final array is: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(Arrays.toString(arr));
            break;
        }
        System.out.println();
        //find the length of this array:
        System.out.println(arr.length);

        //printing the array in reverse order
        System.out.println("printing the array is in reverse order: ");
        for(int i = n-1 ; i > 0 ; i-- ){
            System.out.print(arr[i]);

        }


    }
}
