import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
    
        Scanner console = new Scanner (System.in);
        Random rand = new Random();

        System.out.print("Vvedit Chuslo 1:");
        int n = console.nextInt();
        int A[] = new int[2 * n];
        int A2[] = new int[n];

        // array creation
        for (int i = 0; i < (n * 2); i++) {
            A[i] = rand.nextInt(1000);
        }
        System.out.println("Random array: " +  Arrays.toString(A));

        // check mean
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        int mean = sum / n;

        // fill new array with values
        int a2Index = 0;
        for (int i = n; i < 2 * n; i++) {
            if (A[i] > mean) {
                    A2[a2Index] = A[i];
                    a2Index++;
            }
        }

        System.out.print("Final array: " + Arrays.toString(A2));
        console.close();
    }
}

