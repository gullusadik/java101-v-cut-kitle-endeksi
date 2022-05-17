import java.util.Scanner;

public class Kiloendeks {
    public static void main (String[] args) {
        double kilo,boy;
        Scanner input =  new Scanner(System.in);
        System.out.print("Kilonuzu giriniz :");
        kilo = input.nextDouble();
        System.out.println("Boyunuzu giriniz :");
        boy = input.nextDouble();

        double kitleendeksiniz = (kilo / (boy * boy));
        System.out.println("Vücut kitle endeksiniz :" + kitleendeksiniz );

    }
}
