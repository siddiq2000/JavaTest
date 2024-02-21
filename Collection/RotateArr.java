import java.util.*;
public class RotateArr { 
    public static void rotateArray(int[] arr, int index) {
        for(int i=index; i<arr.length-1; i++) {
                arr[i] = arr[i+1]; 
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter values in array");
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index to rotate array");
        int index = sc.nextInt();
        rotateArray(arr,index);
        sc.close();
    }
}