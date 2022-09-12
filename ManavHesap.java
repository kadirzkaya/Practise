import java.util.Scanner;

public class ManavHesap {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.00, toplamTutar;
        Scanner sc=new Scanner(System.in);

        System.out.print("Armut kaç kilo ? ");
        armut= sc.nextInt();

        System.out.print("Elma kaç kilo ? ");
        elma= sc.nextInt();

        System.out.print("Domates kaç kilo ? ");
        domates= sc.nextInt();

        System.out.print("Muz kaç kilo ? ");
        muz= sc.nextInt();

        System.out.print("Patlıcan kaç kilo ? ");
        patlican= sc.nextInt();

        toplamTutar=armut*armutFiyat + elma*elmaFiyat + domates*domatesFiyat + muz*muzFiyat + patlican*patlicanFiyat;

        System.out.print("Toplam Tutar :" +toplamTutar);
    }
}
