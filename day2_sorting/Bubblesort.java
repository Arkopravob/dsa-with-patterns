/*
Example 1:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5


Example 2:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52


using buuble sort alogrithm  its the sorting technique

take n  = array length.
take unsorted array
outer loop start i = n-1  till 0 and i will be decreasing
inner loop j will start from  0 to till i-1
Push the maximum element to the end of the selected range: Use an inner loop (j) that runs from 0 to i-1. Compare adjacent elements and swap them if arr[j] > arr[j+1]. Repeating this process ensures the maximum element in the current range moves to index i.
then swap 

* */


import  java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public  static  void bubbleSort(int arr[] , int n)
    {
        for(int i = n-1 ;  i>= 0  ; i--){
            for(int j = 0 ; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("after sorting the array : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("enter the array length: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        n = arr.length;

        for(int i = 0  ; i < n ;   i++){
            System.out.println("enter " + i + " th t element of an Array: " );
            arr[i] = sc.nextInt();
        }
        System.out.println("the array before sorting");
        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr , n);


    }
}
