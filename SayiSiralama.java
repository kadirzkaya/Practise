import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int ilkSayi, ikinciSayi, ucuncuSayi,enKucuk=0,enBuyuk=0,ortanca=0;

        Scanner sc=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        ilkSayi=sc.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        ikinciSayi=sc.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        ucuncuSayi=sc.nextInt();

        if(ilkSayi>ikinciSayi && ilkSayi>ucuncuSayi){
            enBuyuk=ilkSayi;
            if (ikinciSayi>ucuncuSayi){
                ortanca=ikinciSayi;
                enKucuk=ucuncuSayi;
            }else {
                ortanca=ucuncuSayi;
                enKucuk=ikinciSayi;
            }
        } else if (ikinciSayi>ilkSayi && ikinciSayi>ucuncuSayi) {
            enBuyuk=ikinciSayi;
            if (ilkSayi>ucuncuSayi){
                ortanca=ilkSayi;
                enKucuk=ucuncuSayi;
            }else {
                ortanca=ucuncuSayi;
                enKucuk=ilkSayi;
            }
        } else if (ucuncuSayi>ilkSayi && ucuncuSayi>ikinciSayi) {
            enBuyuk=ucuncuSayi;
            if (ikinciSayi>ilkSayi){
                ortanca=ikinciSayi;
                enKucuk=ilkSayi;
            }else {
                ortanca=ilkSayi;
                enKucuk=ikinciSayi;
            }
        }

        System.out.println("Sayıların küçükten büyüğe sıralanışı :" + enKucuk +" "+ortanca+" "+enBuyuk);
    }
}
