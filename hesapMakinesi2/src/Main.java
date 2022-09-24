import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner (System.in);
        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz :");
        select = input.nextInt();

        switch (select) {
            case 1 :
                System.out.println("Sonuç =" + (n1 + n2));
                break;
            case 2 :
                System.out.println("Sonuç" + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç" + (n1 * n2));
                break;
            case 4:
                if (n2 ==0) {
                System.out.println("Bir sayı 0'a bölünemez.");
                }else{
                System.out.println("Sonuç=" + (n1 / n2));
                }
                break;

            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");
        }
    }

}