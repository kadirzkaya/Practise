import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;
        String sifirKontrol;
        Scanner sc=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        sayi1=sc.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        sayi2=sc.nextInt();

        System.out.println("Yapılmasını istediğiniz işlemi seçiniz: ");
        System.out.println("1-Topla\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim=sc.nextInt();

        switch (secim){
            case 1:
                System.out.println(sayi1 +"+"+ sayi2 +" = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1 +"-"+ sayi2 +" = "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println(sayi1 +"*"+ sayi2 +" = "+(sayi1*sayi2));
                break;
            case 4:
                sifirKontrol=(sayi2==0)?"Sayı 0'a bölünemez.":(sayi1 +"\\"+ sayi2 +" = "+(sayi1/sayi2));
                System.out.println(sifirKontrol);
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız!");
                break;
        }
    }
}
