package metotlar;

import java.util.Scanner;
//ÇÖZÜM 1 : KULLANICIDAN SAYIYI STRİNG OLRAK ALDIM.
//DAHA SONRA FOR DÖNGÜSÜ İLE SAYIYI TERSTEN YAZDIRDIM
//GİRİLEN SAYI İLE TERSTEN OLUŞTURULAN SAYI EŞİT İSE POLİDROM DEĞİL İSE POLİDROM DEĞİL OLARAK EKRANA SONUŞ YAZDIRDIM
public class Pratik1PolidromNumber {
    public static void main(String[] args) {
        String number;
        String reversNumber = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextLine();
        for (int i = number.length() -1; i >= 0; i--) {
            reversNumber = reversNumber + number.charAt(i);
        }
        if (number.equals(reversNumber)) {
            System.out.println(number + " polidrom bir sayıdır.");
        } else {
            System.out.println(number + " polidrom bir sayı değildir.");

        }
    }
/*
    ÇÖZÜM 2 : VİDEODAKİ ÇÖZÜM
    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while (temp!=0){
            lastNumber =temp % 10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            System.out.println("Reverse Number : "+reverseNumber);
            temp /=10;
        }
        System.out.println("----------------");
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(99));
     }
*/

}
