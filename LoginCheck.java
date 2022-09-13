import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String userName, password, newPassword;
        char secim;
        Scanner sc=new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName=sc.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password=sc.nextLine();

        if (userName.equals("coder") && password.equals("java101")){
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.println("Giriş yapılamadı.\nŞifrenizi sıfırlamak ister misiniz? E|H ");
            secim=sc.next().charAt(0);

            switch (secim){
                case 'E':
                    System.out.println("Yeni şifrenizi giriniz : ");
                    String s=sc.nextLine();
                    newPassword=sc.nextLine();
                    if (newPassword.equals("java101")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 'H':
                    System.out.println("Kullanıcı adınız veya parolanız yanlıştır.");
                    break;
                default:
                    break;
                }
        }
    }
}
