import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa jumlah banyak pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String namaMenu[] = new String[jumlahPesanan];
        int hargaMenu[] = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.print("Masukkan nama makanan/minuman: ");
            namaMenu[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan/minuman: ");
            hargaMenu[i] = sc.nextInt();
            sc.nextLine();
            total += hargaMenu[i];
        }
        System.out.println();
        System.out.println("Menu yang di pesan: ");

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.println((i + 1) + ". " + namaMenu[i]);
        }
        System.out.println("Total biaya pesanan: " +total);
        sc.close();
    }
}
