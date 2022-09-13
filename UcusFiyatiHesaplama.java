import java.util.Scanner;

public class UcusFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double mesafeUcret=0.10, toplamFiyat,indirimOrani=1;

        Scanner sc=new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe=sc.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas=sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi=sc.nextInt();

        if (mesafe>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){
            if (yas<12){
                indirimOrani*=0.5;
            } else if (yas>12 && yas<24) {
                indirimOrani*=0.9;
            } else if (yas>65) {
                indirimOrani*=0.7;
            }

            if (yolculukTipi==2){
                indirimOrani*=1.6;
            }

            toplamFiyat=mesafeUcret*indirimOrani*mesafe;

            System.out.println("Toplam tutar : " +Math.ceil(toplamFiyat));
        }else
            System.out.println("Hatalı Veri Girdiniz !");

    }
}
