public class OperatorPenugasan {

    public static void main(String[] args) {
        int a;
        int b;

        // Masukkan data variabel
        a = 5;
        b = 10;

        // penambahan
        b += a;
        // Sama dengan b + a
        // sekarang b = 15
        System.out.println("Fungsi Tambah : " + b);

        // pengurangan
        b -= a;
        // Sama dengan b - a
        // sekarang b= 10 (karena 15-5)
        System.out.println("Fungsi Kurang : " + b);

        // perkalian
        b *= a;
        // Sama dengan b * a
        // sekarang b= 50 (karena 10*5)
        System.out.println("Fungsi Kali : " + b);

        // Pembagian
        b /= a;
        // Sama dengan b / a
        // sekarang b=10
        System.out.println("Fungsi Pembagian : " + b);

        // Sisa bagi
        b %= a;
        // Sama dengan b % a
        // sekarang b=0
        System.out.println("Fungsi Sisa Bagi: " + b);

    }

}