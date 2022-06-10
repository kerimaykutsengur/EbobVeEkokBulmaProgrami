import java.util.Scanner;

public class EbobVeEkokBulmaProgrami {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1= 0, n2 = 0, buyukSayi = 0 , kucukSayi =0 ;
    int i = 1;
    int ebob = 1;
    int ekok;


        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2){
            kucukSayi += n1;
            buyukSayi += n2;

        }else {
            kucukSayi += n2;
            buyukSayi += n1;

        }
        i = kucukSayi;
        while (i >= 1){
            i--;
            if (kucukSayi % i==0 && buyukSayi % i==0){
                System.out.println("Ebob : " + i);
                ekok = (kucukSayi * buyukSayi)/ i;
                System.out.println("Ekok : " + ekok);
                break;
            }
        }




    }
}
