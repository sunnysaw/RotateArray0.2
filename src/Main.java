/*
In this section we will see how we can rotate an array by given step 'k' element :
___________________________________________________________________________________
Question : Rotate the given array 'a' by k steps , where k is non-negative without using extra space.
           Note : k can be greater than n as well.
_________________________________________________________________________________________________________
 */

import java.util.Scanner;
public class Main {
    static void reverse(int arr[] , int i , int k ){
        int l1 = i;
        int r1 = k;
        while (l1 < r1){
            int temp = arr[l1];
            arr[l1] = arr[r1];
            l1++;
            r1--;
         }
    }
    static void rotate(int[] arr, int k){
        k = k % arr.length;
        reverse(arr , 0 , arr.length - k -1);
        reverse(arr , arr.length - k , arr.length-1 );
        reverse(arr , 0, arr.length-1);
        for (int i =0 ; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE OF ARRAY : ");
        int arr[] = new int[a];
        System.out.println("NOW PRINTING THE OF ARRAY :");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Enter the digit where you want to change the array :");
        int m = sc.nextInt();
        System.out.println("NOW PRINTING THE SWAPPED VALUE OF ARRAY : ");
        rotate(arr , m);
    }
}