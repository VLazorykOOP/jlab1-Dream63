import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vvedit chuslo 1: ");
        double a = scan.nextDouble();
        System.out.println("Vvedit chuslo 2: ");
        double b = scan.nextDouble();

        int sum = (int)(a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3));
        System.out.println("sum: " + sum);
    }

}
