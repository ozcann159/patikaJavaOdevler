import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Üç sayı giriniz.");
        System.out.print("1.Sayı a: ");
        a = input.nextInt();
        System.out.print("2.Sayı b: ");
        b = input.nextInt();
        System.out.print("3.Sayı c: ");
        c = input.nextInt();

        if((a < b) && (a < c)) {

            if( b < c ) {
                System.out.print(" a < b < c ");
            }

            else if ( c < b ) {
                System.out.print(" a < c < b ");

            } else {
                System.out.print(" a < c = b ");
            }
        }

        else if((b < a) && (b < c)) {

            if( a < c ) {
                System.out.print(" b < a < c ");
            }
            else if ( c < a ) {
                System.out.print(" b < c < a ");
            } else {
                System.out.print(" b < a = c ");

            }

        }

        else if((c < a) && (c < b)) {

            if( a < b ) {
                System.out.print(" c < a < b ");
            }
            else if ( b < a ) {
                System.out.print(" c < b < a ");
            } else {
                System.out.print(" c < a = b ");
            }

        }
        else {
            System.out.print(" a = b = c ");

        }

    }

}