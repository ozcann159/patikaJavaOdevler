import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We want to draw triangel star. This number will take from keyboard.
        // We take the number of the star from keyboard.
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many stars row do you want: ");
        n = scan.nextInt();
        // This first scope for loop related upper triangel star.
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // This second scope for loop related lower triangel star.
        // Firstly, We copy first "scope for loop" and copy and We change the some part of.
        // First loop says, the stars increase from zero to n but second loop the exact opposite.
        // It decrease from n-1 position to zero
        for (int i = n - 1; i > 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}