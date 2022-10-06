import java.util.Scanner;

/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        int n = 1, r = 1, nDeger = 1, rDeger = 1, xDeger = 1, x, c;

        System.out.println("Lutfen n degerini giriniz: ");
        n = yazici.nextInt();

        System.out.println("Lutfen r degerini giriniz: ");
        r = yazici.nextInt();

        x = (n - r);


        for (int i = 1; i <= n; i++) {
            nDeger *= i;

        }
        for (int i = 1; i <= r; i++) {
            rDeger *= i;

        }
        for (int i = 1; i <= x; i++) {
            xDeger *= i;

        }
        c = nDeger / (rDeger * xDeger);
        System.out.println(c);


    }
}