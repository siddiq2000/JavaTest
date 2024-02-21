import java.util.*;

public class FloorAndCeilingApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    for(int i=0; i<arr.length; i++) {
        arr[i] = sc.nextInt();
    } 
    int n = arr.length;
    int x = 7;
    sc.close();
    int[] result = floorAndCeil(arr, n, x);
    System.out.println("Floor is " + result[0]);
    System.out.println("Ceil is " + result[1]);
  }

  static int[] floorAndCeil(int[] arr, int n, int x) {
    int[] result = new int[2];
    int low = 0, high = n - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] > x) {
        high = mid - 1;
      } else if (arr[mid] < x) {
        low = mid + 1;
      } else {
        result[0] = arr[mid];
        result[1] = arr[mid];
        return result;
      }
    }
    result[0] = (high == -1) ? -1 : arr[high];
    result[1] = (low == arr.length) ? -1 : arr[low];
    return result;
    }
}

