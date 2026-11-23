package P8;

import java.util.Scanner;

public class ProgramKasir {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String pilihanLanjut;
boolean programLanjut;

do {
double totalBelanja = 0;


// PEMBUKAAN SISTEM
System.out.println("=== SISTEM KASIR TOKO UTAMA ===");




// MEMASUKKAN JUMLAH JENIS BARANG
System.out.print("Masukkan Jumlah Jenis Barang: ");
int jumlahBarang = scanner.nextInt();

// LOOPING UNTUK MENANYAKAN JUMLAH DAN HARGA BARANG
for (int i = 1; i <= jumlahBarang; i++) {
System.out.println("\nData Barang ke-" + i);
System.out.print("Harga Satuan : Rp ");
double harga = scanner.nextDouble();
System.out.print("Jumlah Beli : ");
int qty = scanner.nextInt();

// MENGHITUNG HARGA SUBTOTAL
double subtotal = harga * qty;
totalBelanja += subtotal;
}
scanner.nextLine();

// SISTEM DISKON MEMBER
System.out.println("Apakah anda seorang member? (yes or no)");
String jawabanMember = scanner.nextLine();
boolean isMember = jawabanMember.equalsIgnoreCase("yes");

double persenDiskon = 0;
double memberDiskon = 0;

if (isMember) memberDiskon = 0.05;

double diskon_setelah_member = totalBelanja * memberDiskon;

// KONDISI PEMBERIAN DISKON
if (totalBelanja >= 500000) persenDiskon = 0.20;
else if (totalBelanja >= 200000) persenDiskon = 0.10;
else if (totalBelanja >= 100000) persenDiskon = 0.05;


 
// JUMLAH NOMINAL DISKON
double nominalDiskon = totalBelanja * persenDiskon;


// TOTAL BAYAR SETELAH DIBERI DISKON PERTAMA
double totalBayar = totalBelanja - nominalDiskon - diskon_setelah_member;



// SYSTEM PRINT OUT
System.out.println("\n=================================");
System.out.println("Total Kotor : Rp " + totalBelanja);
System.out.println("Diskon (" + (persenDiskon*100) + "%) : Rp " + nominalDiskon + memberDiskon);
System.out.println("Total Harus Bayar: Rp " + totalBayar);
System.out.print("Uang Dibayarkan: Rp ");
double bayar = scanner.nextDouble();
scanner.nextLine();

// SISTEM KEMBALIAN
System.out.println("Kembalian : Rp " + (bayar - totalBayar));

// SISTEM PENGULANGAN
System.out.println("Apakah anda ingin lanjut? (yes or no)");
pilihanLanjut = scanner.nextLine();
programLanjut = pilihanLanjut.equalsIgnoreCase("yes");


// KONDISI PROGRAM UNTUK BERLANJUT
} while(programLanjut);


scanner.close();
}
}
