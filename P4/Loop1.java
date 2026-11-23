package P4;
import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angkamu : ");
        int angka = input.nextInt();

        if(angka < 10 ) {
            for(int i = 0; i < 5; i++) {
                System.out.println("Kamu mati ke - " + angka++);
            }
        } else {
            System.out.println("Ya lu masih hidup");
        }



        input.close();
    }
}
