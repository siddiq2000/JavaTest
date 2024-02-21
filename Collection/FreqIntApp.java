import java.util.*;

public class FreqIntApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        sc.close();

        FreqNum(num); // Call the FreqNum method
    }

    public static void FreqNum(int num) {
        int[] freq = new int[10]; // Array to store frequencies of digits 0-9
        // for(int i=0; i<freq.length; i++){
        //     System.out.println("Arrray "+freq[i]);
        // }

        // Count frequencies efficiently using a single loop
        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        // Print the frequencies
        System.out.println("Digit frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + ": " + freq[i]);
            }
        }
    }
}
