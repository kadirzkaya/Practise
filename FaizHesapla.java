import java.util.Scanner;

public class FaizHesapla {
    public static void main(String[] args) {
        double oran, kdv, paraMiktarı,kdvliParaDegeri;

        Scanner sc= new Scanner(System.in);

        System.out.println("Para miktarını giriniz = ");
        paraMiktarı=sc.nextDouble();

        oran=(0<paraMiktarı&&paraMiktarı<1000)?0.18:0.08;
        kdv=oran*paraMiktarı;
        kdvliParaDegeri=kdv+paraMiktarı;

        System.out.println("KDV'siz Fiyat: " +paraMiktarı);
        System.out.println("KDV'li Fiyat: " +kdvliParaDegeri);
        System.out.println("KDV Tutarı: " +kdv);
    }
}
