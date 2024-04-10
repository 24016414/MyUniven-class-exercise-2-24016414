
import java.util.Scanner;

public class compoundint {
    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);

        double p, n;
        System.out.println("Enter the principal amount:");
        p = com.nextDouble();

        System.out.println("Enter the annual percentage in integer form:");
        int i = com.nextInt();
        double perc = ((double) i / 100); // Cast one operand to double before division

        System.out.println("Enter the period:");
        n = com.nextDouble();

        double a = p * Math.pow((1 + perc), n);

        System.out.println("The answer: " + a);
    }
}
