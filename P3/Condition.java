package P3;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        if(angka >= 80) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        input.close();

    }
}
