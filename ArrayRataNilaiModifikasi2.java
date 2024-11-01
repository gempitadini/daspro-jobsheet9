import java.util.Scanner;

public class ArrayRataNilaiModifikasi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        

        rata2Lulus = totalLulus/jumlahLulus;
        rata2TidakLulus = totalTidakLulus/jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus = " +rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}
