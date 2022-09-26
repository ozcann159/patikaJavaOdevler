import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        // @author: Evren Akgün

        Scanner input = new Scanner(System.in);

        double perKm = 0.10;
        double indirimsizBilet;
        double cocukBilet;
        double gencBilet;
        double yasliBilet;
        double gidisDonusCocuk;
        double gidisDonusGenc;
        double gidisDonusYasli;

        System.out.print("Gideceginiz mesafeyi km cinsinden yaziniz: ");
        int kmGidilecek = input.nextInt();
        indirimsizBilet = kmGidilecek * perKm;

        if (kmGidilecek > 0) {
            System.out.print("Yasinizi giriniz: ");
            int yas = input.nextInt();

            if (yas > 0) {
                System.out.println("Yolculuk tipini seciniz:\n" + "1: Tek Yon\n" + "2: Gidis-Donus");
                int islem = input.nextInt();

                switch (islem) {
                    case 1:
                        if (yas < 12) {
                            cocukBilet = indirimsizBilet - (indirimsizBilet * 0.5);
                            System.out.println("Toplam Tutar: " + cocukBilet );
                        }

                        else if (yas >= 12 && yas <= 24) {
                            gencBilet = indirimsizBilet - (indirimsizBilet * 0.1);
                            System.out.println("Toplam Tutar: " + gencBilet );
                        }

                        else if (yas >= 65) {
                            yasliBilet = indirimsizBilet - (indirimsizBilet * 0.3);
                            System.out.println("Toplam Tutar: " + yasliBilet );
                        }

                        else {
                            System.out.println("Toplam Tutar: " + indirimsizBilet);
                        }

                        break;

                    case 2:
                        if (yas < 12) {
                            cocukBilet = indirimsizBilet - (indirimsizBilet * 0.5);
                            gidisDonusCocuk = cocukBilet - (cocukBilet * 0.2);
                            System.out.println("Toplam Tutar: " + gidisDonusCocuk * 2);
                        }

                        else if (yas >= 12 && yas <= 24) {
                            gencBilet = indirimsizBilet - (indirimsizBilet * 0.1);
                            gidisDonusGenc = gencBilet - (gencBilet * 0.2);
                            System.out.println("Toplam Tutar: " + gidisDonusGenc * 2);
                        }

                        else if (yas >= 65) {
                            yasliBilet = indirimsizBilet - (indirimsizBilet * 0.3);
                            gidisDonusYasli = yasliBilet - (yasliBilet * 0.2);
                            System.out.println("Toplam Tutar: " + gidisDonusYasli * 2);
                        }

                        else {
                            System.out.println("Toplam Tutar: " + indirimsizBilet * 2);
                        }

                        break;

                    default:
                        System.out.println("Hatali veri girdiniz.");
                        break;
                }
            }

            else {
                System.out.println("Hatali veri girdiniz.");
            }
        }

        else {
            System.out.println("Hatali veri girdiniz.");
        }

    }
}