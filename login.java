import java.util.Scanner;
public class login{
public static void main(String[] args) {
    String username= "rakiraki";
    String password= "punyaku";
    boolean loggedIn = false;
    Scanner in = new Scanner(System.in);

    while(!loggedIn){
    System.out.print("Masukkan username anda: ");
    String usernameIn = in.next();
    System.out.print("Masukkan password anda: ");
    String passwordIn = in.next();

    if(usernameIn.equals(username) && passwordIn.equals(password)){
        loggedIn = true;
    } else{
        System.out.println("Username dan Password salah");
    }

    if(loggedIn=true){
        System.out.println("\n=== Login berhasil. ===");
        System.out.println("Selamat datang, " +username+ "!");
        System.out.println("[System]");
    }
    }
}
}