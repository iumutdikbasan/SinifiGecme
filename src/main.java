import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int mat,fizik,turk,kim,music,ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz : ");
        turk = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kim = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz : ");
        music = inp.nextInt();

        int i = 0, top = 0;
        if (mat<=100 && mat>=0) {
            i++;
            top = top + mat;
        }

        if (turk<=100 && turk>=0) {
            i = i + 1;
            top = top + turk;
        }

        if (fizik<=100 && fizik>=0) {
            i = i +1;
            top = top + fizik;
        }

        if (kim<=100 && kim>=0) {
            i = i + 1;
            top = top + kim;
        }

        if (music<=100 && music>=0) {
            i = i + 1;
            top = top + music;
        }
        double ort;
        ort = (top/i);

        System.out.println("Not Ortalaması : " + ort);
        if (ort<55) System.out.println("Kaldiniz... :(");
        else System.out.println("Geçtiniz... :)");

    }

}
