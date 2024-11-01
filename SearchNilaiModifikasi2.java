import java.util.Scanner;

public class SearchNilaiModifikasi2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int n = sc.nextInt();
        int arrayNilai[] = new int[n+1];

        for (int i = 1; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+ ": ");
            arrayNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for (int i = 1; i < arrayNilai.length; i++) {
            if (arrayNilai[i] == key) {
            hasil = i;
            break;
            }
        }
        System.out.println();
        if (hasil!=0){
        System.out.println("Nilai " +key+ " ketemu, merupakan nilai mahsiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        sc.close();
    }
}
