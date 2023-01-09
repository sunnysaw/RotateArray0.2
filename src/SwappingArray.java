import java.util.Scanner;

public class SwappingArray {
    static void reverse(int arr[]){
       for (int i = arr.length -1 ; i >= 0; i--){
           System.out.print(" " + arr[i]);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE IN ARRAY : ");
        int arr[] = new int[a];
        System.out.println("PRINTING THE ORIGINAL VALUE OF ARRAY : ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("PRINTING THE REVERSED VALUE OF ARRAY : ");
        reverse(arr);
    }

}
