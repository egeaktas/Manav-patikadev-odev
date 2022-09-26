import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutfy = 2.14, armutkg, elmafy = 3.67, elmakg, domatesfy = 1.11, domateskg, muzfy = 0.95, muzkg, patlıcanfy = 5, patlıcankg, toplamfy;
        System.out.print("kaç kilo armut alındı: ");
        armutkg = input.nextDouble();
        System.out.print("kaç kilo elma alındı: ");
        elmakg = input.nextDouble();
        System.out.print("kaç kilo domates alındı: ");
        domateskg = input.nextDouble();
        System.out.print("kaç kilo muz alındı: ");
        muzkg = input.nextDouble();
        System.out.print("kaç kilo patlıcan alındı: ");
        patlıcankg = input.nextDouble();

        toplamfy = armutkg*armutfy + elmakg*elmafy + domateskg*domatesfy + muzkg*muzfy + patlıcankg*patlıcanfy;

        System.out.println("toplam fiyat: " + toplamfy);
    }
}