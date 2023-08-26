import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String userName = "patika",correctPassword = "java1234",password;

       System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
       String newuserName = input.nextLine();
       System.out.print("Lütfen Şifrenizi Giriniz: ");
       String newPassword = input.nextLine();

       if (userName.equals(newuserName) && correctPassword.equals(newPassword)){
           System.out.println("Giriş Başarılı...");


       } else if (userName.equals(newuserName)) {
           System.out.println("Kullanıcı Adı Veya Şifre Hatalı!!!");
           System.out.print("Yeni Şifre Oluşturmak İçin 1, Çıkış Yapmak İçin 2'ye Basınız:  ");
           String resetPassword = input.nextLine();
           if (resetPassword.equals("1")){
               System.out.print("Lütfen Yeni Şifrenizi Giriniz: ");
               String userPassword = input.nextLine();
               if (userPassword.equals(newPassword) || userPassword.equals(correctPassword)){
                   System.out.println("Şifre Oluşturalamadı");
               }else {
                   System.out.println("Yeni Şifreniz Oluşturuldu");
               }
           }
            else {
               System.out.println("Çıkış Yapıldı..");
           }

       }else {
           System.out.println("Kullanıcı Adı Veya Şifre Hatalı");
       }
      
    }
}