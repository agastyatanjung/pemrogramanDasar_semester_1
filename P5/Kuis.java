package P5;
import java.util.Scanner;

public class Kuis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Memasukkan nilai tugas
        System.out.println("Masukkan nilai Tugas: ");
        int nilaiTugas = input.nextInt();
        // Memasukkan nilai UTS
        System.out.println("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();
        // Memasukkan nilai UAS
        System.out.println("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();


        //Perhitungan konversi nilai menjadi bobot persentase
        double hitungTugas = nilaiTugas * 0.2;//20%
        double hitungUTS = nilaiUTS * 0.35;//35%
        double hitungUAS = nilaiUAS * 0.45;//45%

        double totalNilai = hitungTugas + hitungUTS * hitungUAS;

        // pemeberian grade bersarkan nilai 
        if (totalNilai >= 85 || totalNilai == 100) {
            System.out.println(totalNilai + "\nGrade A, nilai sempurna");
        } else if (totalNilai >= 75) {
            System.out.println(totalNilai + "\nGrade B, nilai sudah baik");
        } else if (totalNilai >= 60 ) {
            System.out.println(totalNilai + "\nGrade C, Lulus kurang baik");
        } else if (totalNilai >= 40) {
            System.out.println(totalNilai + "\nGrade D, Tidak lulus kurang baik");
        } else {
            System.out.println("Grade E, tidak lulus");
        }
        input.close();

    }
}
