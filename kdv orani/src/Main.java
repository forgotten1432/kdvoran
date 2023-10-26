import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvOrani, kdvTutar, kdvliTutar, kdvsizTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("tutari giriniz");
        tutar = input.nextDouble();

        if (tutar<1000) {
            kdvOrani = 0.18;
        }
        else {
            kdvOrani = 0.20;
        };

        kdvTutar = tutar * kdvOrani ;
        kdvliTutar = kdvTutar + tutar;
        kdvsizTutar = tutar;

        System.out.println("kdvli tutar:"+ (kdvliTutar));
        System.out.println("kdvsiz tutar:"+ (kdvsizTutar));
        System.out.println("kdv tutari:" + kdvTutar);




    }
}