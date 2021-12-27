import java.util.Scanner;

public class ChallengeTiga{
	public static void main(String [] args) 
	{
		// Menghitung luas dan Volume Balok

		double panjang,lebar,tinggi,luas,volume,a,b,c,d;


		Scanner baca = new Scanner(System.in);

		// Membuat input 

		System.out.println("Masukkan Panjang : ");
		panjang = baca.nextInt();
		
		System.out.println("Masukkan Lebar : ");
		lebar = baca.nextInt();
		
		System.out.println("Masukkan Tinggi : ");
		tinggi = baca.nextInt();

		// Proses

		// Menghitung volume
		volume = panjang*lebar*tinggi;

		// Mengitung luas Permukaan
		a = panjang * lebar;
		b = panjang * tinggi;
		c = lebar * tinggi;
		d = a + b + c;
		luas = 2*d;

		// Output Hasil

		System.out.println("Volume balok adalah = " + volume + " cm^3");
		System.out.println("Luas Permukaan balok adalah = " + luas + " cm^2");


	}	
}