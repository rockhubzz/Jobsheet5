import java.util.Scanner;

public class PemilihanPercobaan124 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
    
        System.out.print("Masukkan angka: ");
        int angka = input24.nextInt();

        if(angka %2 == 0){
            System.out.print("Angka "+angka+" bilangan genap");
            } else{
                System.out.println("Angka "+angka+" bilangan ganjil");
        } 
    }
}