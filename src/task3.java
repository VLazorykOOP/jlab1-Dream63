import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
    
        // initialization
        Scanner console = new Scanner (System.in);
        Random rand = new Random();
        System.out.print("Vvedit Chuslo:");
        int n = console.nextInt();
        
        int A[][] = new int[n][n];

        // Random martix creation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand.nextInt(100);   
            }
        }
        System.out.println("Random matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(A[i]));
        }

        // sum
        int sum = 0;
        for(int i = 0; i < n; i++) { 
            sum += GetMinValue(A[i]) * GetMaxValue(A[n - i - 1]);
        }

        System.out.println("Sum: " + sum);
        console.close();
    }

    static int GetMinValue(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    static int GetMaxValue(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
