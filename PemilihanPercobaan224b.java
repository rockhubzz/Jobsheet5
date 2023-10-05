import java.util.Scanner;

public class PemilihanPercobaan224b {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        String mutu="", kual="";
        double ipk=0;

        System.out.print("Nilai UAS     : ");
        float uas = input24.nextFloat();
        System.out.print("Nilai UTS     : ");
        float uts = input24.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input24.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input24.nextFloat();

        double total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if(80< total && total<=100){
            mutu= "A";
            ipk= 4;
            kual= "Sangat baik";
        } else if(73< total && total <= 80){
            mutu= "B+";
            ipk= 3.5;
            kual= "Lebih dari baik";
        } else if(65< total && total <= 73){
            mutu= "B";
            ipk= 3;
            kual= "Baik";
        } else if(60< total && total <= 65){
            mutu= "C+";
            ipk= 2.5;
            kual= "Lebih dari cukup";
        } else if(50< total && total <= 60){
            mutu= "C";
            ipk= 2;
            kual= "Cukup";
        } else if(39< total && total <= 50){
            mutu= "D";
            ipk= 1;
            kual= "Kurang";
        } else if(total <= 39){
            mutu= "D";
            ipk= 0;
            kual= "Kurang";
        }
        System.out.println("\nNilai akhir     : "+total);
        System.out.println("Nilai huruf     : "+mutu);
        System.out.println("Nilai setara    : "+ipk);
        System.out.println("Kualifikasi     : "+kual);
        
    }
}