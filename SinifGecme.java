import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        double avg;

        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat=sc.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fiz=sc.nextInt();
        System.out.print("Türkçe notunu giriniz : ");
        tur=sc.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kim=sc.nextInt();
        System.out.print("Müzik notunu giriniz : ");
        muz=sc.nextInt();

        mat=(mat<0 || mat>100)?0:mat;
        fiz=(fiz<0 || fiz>100)?0:fiz;
        tur=(tur<0 || tur>100)?0:tur;
        kim=(kim<0 || kim>100)?0:kim;
        muz=(muz<0 || muz>100)?0:muz;
        avg=(mat+fiz+kim+tur+muz)/5.0;

        if (avg>55){
            System.out.println("Sınıfı geçtiniz, ortalamanız: " +avg);
        }else {

            System.out.println("Sınıfta kaldınız, ortalamanız: " +avg);
        }
    }
}
