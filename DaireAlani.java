import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        int yaricap, merkezAci;
        double toplamAlan, PI=3.14;

        Scanner sc=new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap=sc.nextInt();

        System.out.println("Merkez açısını giriniz : ");
        merkezAci=sc.nextInt();

        toplamAlan=(PI*(Math.pow(yaricap,2))*merkezAci)/360;

        System.out.println("Dairenin alanı : "+toplamAlan);
    }
}
