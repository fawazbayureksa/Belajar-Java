import java.util.Scanner;

public class ChallengeDua{
	public static void main(String [] args)
	{
		double phi,r,luas;

		phi = 3.14;


		Scanner baca = new Scanner(System.in);

		// Input 
		System.out.println("Masukkan nilai jari-jari : ");
		r = baca.nextInt();

		// Proses
		luas = phi*r*r;

		// Hasil
		
		System.out.println("Luas Lingkaran adalah : " + luas);

	}
}