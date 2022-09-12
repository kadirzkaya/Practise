import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double ort;
        String res;

        Scanner sc= new Scanner(System.in);

        System.out.println("Matematik notunuz = ");
        mat=sc.nextInt();

        System.out.println("Fizik notunuz = ");
        fiz=sc.nextInt();

        System.out.println("Kimya notunuz = ");
        kim=sc.nextInt();

        System.out.println("Türkçe notunuz = ");
        tur=sc.nextInt();

        System.out.println("Tarih notunuz = ");
        tar=sc.nextInt();

        System.out.println("Müzik notunuz = ");
        muz=sc.nextInt();

        ort=(mat+fiz+kim+tur+tar+muz)/6.0;

        res=(ort>60)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Not ortalaması: " +ort + " "+res);
    }
}
