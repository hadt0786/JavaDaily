import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                // System.out.println("even");
                count++;

            } 
            n--;

        }
        System.out.println(count + " Even count");
        System.out.println(Math.abs(n - count) + "Odd count");

    }
}