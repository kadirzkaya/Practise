import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy, vki;
        int kilo;
        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=sc.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=sc.nextInt();

        vki=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+vki);
    }
}
