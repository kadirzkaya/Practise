import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar,ucuncuKenar;
        double cevre,alan;

        Scanner sc=new Scanner(System.in);
        System.out.println("İlk kenarı giriniz: ");
        ilkKenar=sc.nextInt();

        System.out.println("İkinci kenarı giriniz: ");
        ikinciKenar=sc.nextInt();

        System.out.println("Üçüncü kenarı giriniz: ");
        ucuncuKenar=sc.nextInt();

        cevre=(ilkKenar+ikinciKenar+ucuncuKenar)/2;

        alan=cevre*(cevre-ilkKenar)*(cevre-ikinciKenar)*(cevre-ucuncuKenar);

        System.out.println("Üçgenin alanı: "+Math.sqrt(alan));
    }
}
