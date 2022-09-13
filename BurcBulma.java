import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay,gun;
        String burc="";
        boolean isError=false;

        Scanner sc=new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz : ");
        ay=sc.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        gun=sc.nextInt();

        if (ay==3){
            if (gun>=1 && gun<=31){
                if (gun>20){
                    burc="Koç burcu";
                }else
                    burc="Balık burcu";
            }else
                isError=true;
        }else if (ay==4){
            if (gun>=1 && gun<=30) {
                if (gun > 20) {
                    burc="Boğa burcu";
                } else
                    burc="Koç burcu";
            }else
                isError=true;
        }else if (ay==5){
            if (gun>=1 && gun<=31) {
                if (gun > 21) {
                    burc="İkizler burcu";
                } else
                    burc="Boğa burcu";
            }else
                isError=true;
        }else if (ay==6){
            if (gun>=1 && gun<=30) {
                if (gun > 22) {
                    burc="Yengeç burcu";
                } else
                    burc="İkizler burcu";
            }else
                isError=true;
        }else if (ay==7){
            if (gun>=1 && gun<=31){
                if (gun>22){
                    burc="Aslan burcu";
                }else
                    burc="Yengeç burcu";
            }else
                isError=true;
        }else if (ay==8){
            if (gun>=1 && gun<=31) {
                if (gun > 22) {
                    burc="Başak burcu";
                } else
                    burc="Aslan burcu";
            }else
                isError=true;
        }else if (ay==9){
            if (gun>=1 && gun<=30) {
                if (gun > 22) {
                    burc="Terazi burcu";
                } else
                    burc="Başak burcu";
            }else
                isError=true;
        }else if (ay==10){
            if (gun>=1 && gun<=31) {
                if (gun > 22) {
                    burc="Akrep burcu";
                } else
                    burc="Terazi burcu";
            }else
                isError=true;
        }else if (ay==11){
            if (gun>=1 && gun<=30) {
                if (gun > 21) {
                    burc="Yay burcu";
                } else
                    burc="Akrep burcu";
            }else
                isError=true;
        }else if (ay==12){
            if (gun>=1 && gun<=31) {
                if (gun > 21) {
                    burc="Oğlak burcu";
                } else
                    burc="Yay burcu";
            }else
                isError=true;
        }else if (ay==1){
            if (gun>=1 && gun<=31) {
                if (gun > 21) {
                    burc="Kova burcu";
                } else
                    burc="Oğlak burcu";
            }else
                isError=true;
        }else if (ay==2){
            if (gun>=1 && gun<=31) {
                if (gun > 19) {
                    burc="Balık burcu";
                } else
                    burc="Kova burcu";
            }else
                isError=true;
        }else
            isError=true;

        if (isError){
            System.out.println("Hatalı bir ay veya gün girdiniz.");
        }else
            System.out.println("Burcunuz : " + burc);
    }
}
