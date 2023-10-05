import java.util.Scanner;
public class weapon{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jarak pertarungan (meter): ");
    int jarak = in.nextInt();

    if(jarak<=5){
        System.out.println("Silakan gunakan melee weapon.");
    }else if(jarak <=1000){
        System.out.println("Silakan gunakan ranged weapon.");
    } else{
        System.out.println("Silakan gunakan senjata lainnya.");
    }
}
}