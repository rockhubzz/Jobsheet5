import java.util.Scanner;

public class PemilihanPercobaan124Ternary{
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
    
        System.out.print("Masukkan angka: ");
        int angka = input24.nextInt();

        String hasil = (angka %2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka +" adalahhh " + hasil);
    }
}