import java.util.Scanner;

public class ForKelipatan13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float rataRata = 0;
        int kelipatan;
        int total = 0;
        int counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        rataRata = total/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("Rata-rata: " + rataRata);
    }
}