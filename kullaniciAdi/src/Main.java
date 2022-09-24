import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       String userName,password,decision,newPassword;

       Scanner inp = new Scanner(System.in);

       System.out.println("Kullanıcı Adı Giriniz : " );
       userName = inp.nextLine();
       System.out.println("Şifreniz : ");
       password = inp.nextLine();

       if(userName.equals("elif") && password.equals("2907")){
           System.out.print("Hoşgeldiniz ");
       }else{
           System.out.println("Kullanıcı adı veya Şifre Hatalı");
           System.out.print("Şifrenizi sıfırlamak ister misiniz? (e/h): ");
           decision = inp.nextLine();


           if (decision.equals("e"));
           System.out.print("Yeni Şifrenizi Giriniz :");
           newPassword = inp.nextLine();
           while (newPassword.equals("123") || newPassword.equals(password)) {
               System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
               newPassword = inp.nextLine();
           }
           System.out.println("Şifreniz oluşturuldu");

           System.out.println("Yeniden giriş yapabilirsiniz: ");

           System.out.print("Kullanıcı adını giriniz: ");
           userName = inp.nextLine();
           System.out.print("Şifrenizi giriniz: ");
           password = inp.nextLine();

           if (userName.equals("elif") && password.equals(newPassword)) {
               System.out.println("Hoşgeldiniz");
           } else {
               System.out.println("Kullanıcı adı veya şifre hatalı");
           }

     }
   }
 }