import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.println("Daftar Menu Makanan dan Minuman:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("Masukkan nama menu yang anda cari: ");
        String menuDicari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++){
            if (menuDicari.equalsIgnoreCase(menu[i])) {
                ditemukan = true;
                break;
            }
           
        } if (ditemukan) {
            System.out.println("Menu '" + menuDicari + "' tersedia.");
        } else {
            System.out.println("Menu '" + menuDicari + "' tidak tersedia.");
        }
        sc.close();
    }
}
