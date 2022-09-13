import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        int sicaklik;

        Scanner sc=new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        sicaklik=sc.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        } else if (sicaklik<10) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (sicaklik<16) {
            System.out.println("Sinemaya ya da pikniğe gidebilirsin.");
        } else if (sicaklik<26) {
            System.out.println("Pikniğe gidebilirsin.");
        }else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
