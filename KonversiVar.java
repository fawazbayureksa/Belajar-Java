import java.util.Scanner;

public class KonversiVar{

	public static void main(String[] args){
		
		// Deklarasi var
		Double luas;
		int alas,tinggi;

		// Membuat scanner baru
		Scanner baca = new Scanner(System.in);

		// Input	
		System.out.println("==== Program Luas Segitiga ====");
		System.out.println("Masukkan nilai alas : ");
		alas = baca.nextInt();
		System.out.println("Masukkan nilai tinggi");
		tinggi = baca.nextInt();

		// Proses

		luas = Double.valueOf((alas * tinggi) / 2);

		// Cetak

		System.out.println("Luas = " + luas);
	}
}